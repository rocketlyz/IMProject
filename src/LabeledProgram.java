import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

/**
 * Created by lyz on 2015/6/30.
 */
public class LabeledProgram implements  ImpListener{
    String labeled = "Labeled Program:";
    int id = 1;
    FOLProgram fol = new FOLProgram();
    int startId = id;
    int endId = id;

    @Override
    public void enterAtom(@NotNull ImpParser.AtomContext ctx) {
        //labeled += ctx.getText();
    }

    @Override
    public void exitAtom(@NotNull ImpParser.AtomContext ctx) {

    }

    @Override
    public void enterInit(@NotNull ImpParser.InitContext ctx) {
        //labeled += ctx.getText();
    }

    @Override
    public void exitInit(@NotNull ImpParser.InitContext ctx) {
        endId = id;
        fol.parseAll( ctx.comlist(),startId);
        System.out.println(labeled);
        System.out.println(fol.produceFol());
    }

    @Override
    public void enterComlist(@NotNull ImpParser.ComlistContext ctx) {
        //labeled += ctx.getText();

    }

    @Override
    public void exitComlist(@NotNull ImpParser.ComlistContext ctx) {
        //labeled += ctx.getText();

    }

    @Override
    public void enterBlock(@NotNull ImpParser.BlockContext ctx) {

    }

    @Override
    public void exitBlock(@NotNull ImpParser.BlockContext ctx) {

    }

    @Override
    public void enterCom(@NotNull ImpParser.ComContext ctx) {
        //labeled += ctx.getText();
    }

    @Override
    public void exitCom(@NotNull ImpParser.ComContext ctx) {

    }

    @Override
    public void enterIfstmt(@NotNull ImpParser.IfstmtContext ctx) {
    }

    @Override
    public void exitIfstmt(@NotNull ImpParser.IfstmtContext ctx) {
    }

    @Override
    public void enterWhilestmt(@NotNull ImpParser.WhilestmtContext ctx) {

    }

    @Override
    public void exitWhilestmt(@NotNull ImpParser.WhilestmtContext ctx) {

    }

    @Override
    public void enterEvalue(@NotNull ImpParser.EvalueContext ctx) {
        labeled +="L"+id+":\t";
        id++;
    }

    @Override
    public void exitEvalue(@NotNull ImpParser.EvalueContext ctx) {

    }

    @Override
    public void enterAexp(@NotNull ImpParser.AexpContext ctx) {
        //labeled += ctx.getText();
    }

    @Override
    public void exitAexp(@NotNull ImpParser.AexpContext ctx) {

    }

    @Override
    public void enterAddaexp(@NotNull ImpParser.AddaexpContext ctx) {
        //labeled += ctx.getText();
    }

    @Override
    public void exitAddaexp(@NotNull ImpParser.AddaexpContext ctx) {

    }

    @Override
    public void enterMulaexp(@NotNull ImpParser.MulaexpContext ctx) {
        //labeled += ctx.getText();
    }

    @Override
    public void exitMulaexp(@NotNull ImpParser.MulaexpContext ctx) {

    }

    @Override
    public void enterAexpatom(@NotNull ImpParser.AexpatomContext ctx) {
        //labeled += ctx.getText();
    }

    @Override
    public void exitAexpatom(@NotNull ImpParser.AexpatomContext ctx) {

    }

    @Override
    public void enterBexp(@NotNull ImpParser.BexpContext ctx) {
        //labeled += ctx.getText();
    }

    @Override
    public void exitBexp(@NotNull ImpParser.BexpContext ctx) {

    }

    @Override
    public void enterOrbexp(@NotNull ImpParser.OrbexpContext ctx) {
        //labeled += ctx.getText();
    }

    @Override
    public void exitOrbexp(@NotNull ImpParser.OrbexpContext ctx) {

    }

    @Override
    public void enterAndbexp(@NotNull ImpParser.AndbexpContext ctx) {
        //labeled += ctx.getText();
    }

    @Override
    public void exitAndbexp(@NotNull ImpParser.AndbexpContext ctx) {

    }

    @Override
    public void enterEqualbexp(@NotNull ImpParser.EqualbexpContext ctx) {
        //labeled += ctx.getText();
    }

    @Override
    public void exitEqualbexp(@NotNull ImpParser.EqualbexpContext ctx) {

    }

    @Override
    public void enterBexpatom(@NotNull ImpParser.BexpatomContext ctx) {
        //labeled += ctx.getText();
    }

    @Override
    public void exitBexpatom(@NotNull ImpParser.BexpatomContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {
        labeled += terminalNode.getText() + " ";

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
