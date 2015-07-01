import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.Scanner;

/**
 * Created by lyz on 2015/6/29.
 */
public class Test {
    public static void main(String args[]){
        System.out.println("请输入程序文件名：");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String statement = "";
        try{
            File file = new File(input);
            Reader reader = new InputStreamReader(new FileInputStream(file));
            int tempChar;
            while((tempChar = reader.read())!=-1){
                System.out.print((char)tempChar);
                statement +=(char)tempChar;
            }
            System.out.println();
            reader.close();

        }catch (IOException e){
            e.printStackTrace();
        }

        //1.Lexical analysis
        ImpLexer lexer = new ImpLexer(new ANTLRInputStream(statement));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //2.Syntax analysis
        ImpParser parser = new ImpParser(tokens);
        ParseTree tree = parser.init();

        //3.Application based on Syntax Tree
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LabeledProgram(),tree);
    }

}
