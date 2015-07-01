import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

/**
 * Created by lyz on 2015/6/30.
 */
public class FOLProgram{

    final String PC = "PC";
    final String PCN = "PC'";
    final String L = "L";
    final String SAME = "same(?)";
    final char AND = '\u2227';
    final char OR = '\u2228';
    final char EQ = '=';
    int id=1;
    ArrayList<String> list = new ArrayList<String>();

    public String assignStmt( ImpParser.EvalueContext ctx,int startPCid){
        String v = parseAssignName(ctx);
        int endPCid = startPCid+1;
        String str = PC+EQ+(L+startPCid)+AND+PCN+EQ+(L+endPCid)+AND+v+AND+"same(V/{"+ctx.getChild(0).getText()+"})";
        list.add(str);
        id = startPCid+1;
        return str;
    }
    public String ifStmt( ImpParser.IfstmtContext ctx,int startPCid){
        String b = ctx.getChild(1).getText();
        int thenId = startPCid;

        String str1 = PC+EQ+(L+startPCid)+AND+PCN+EQ+(L+thenId)+AND+b+AND+"same(V)";
        list.add(str1);
        for(ImpParser.ComContext comctx: ctx.block(0).com()){
            parse(comctx,id);
        }
        int elseId = id;
        String str2 = PC+EQ+(L+startPCid)+AND+PCN+EQ+(L+elseId)+AND+"~"+b+AND+"same(V)";
        list.add(str2);
        for(ImpParser.ComContext comctx:ctx.block(1).com()){
            parse(comctx,id);
        }

        return str1+OR+str2;
    }

    public String whileStmt( ImpParser.WhilestmtContext ctx,int startPCid){
        int doId = startPCid;
        for(ImpParser.ComContext comctx : ctx.block().com() ){
            parse(comctx,doId);
        }
        String b = ctx.getChild(1).getText();
        String str1 = PC+EQ+(L+startPCid)+AND+PCN+EQ+(L+doId)+AND+b+AND+"same(V)";
        String str2 = PC+EQ+(L+doId)+AND+PCN+EQ+(L+id)+AND+"~"+b+AND+"same(V)";
        list.add(str1);
        list.add(str2);

        return str1+OR+str2;
    }

    public String parseAssignName( ImpParser.EvalueContext ctx){

        String text = ctx.getText();
        text= text.replaceAll(":=","=");
        text=text.replaceAll(";","");
        return text;
    }

    public String produceFol(){
        String folString = "";
        for(int i=0;i<list.size();i++){
            folString += "("+list.get(i)+")";
            if(i<list.size()-1){
                folString += " "+OR+" ";
            }
            else{
                folString +="\n";
            }
        }
        return folString;
    }

    public void parseAll(ParserRuleContext ctx, int startPCid) {
        if (ctx instanceof ImpParser.ComlistContext) {
            for (ImpParser.ComContext comctx : ((ImpParser.ComlistContext) ctx).com()) {
                parse(comctx, startPCid);
            }
        }else if(ctx instanceof ImpParser.BlockContext) {
            for (ImpParser.ComContext comctx : ((ImpParser.BlockContext) ctx).com()) {
                parse(comctx, startPCid);
            }
        } else {
            parse((ImpParser.ComContext) ctx, startPCid);
        }
    }
    public void parse(ImpParser.ComContext comctx,int startPCid){
        if(comctx.evalue()!=null) {
            assignStmt(comctx.evalue(), startPCid);
        }
        else if(comctx.ifstmt()!=null)
            ifStmt(comctx.ifstmt(),startPCid);
        else
            whileStmt(comctx.whilestmt(),startPCid);
    }

}