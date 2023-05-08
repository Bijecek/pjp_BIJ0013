import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("testovaci.txt"));
        String allLines = new String();
        String line;
        while((line = (br.readLine())) != null){
            allLines += line;
        }


        CodePointCharStream codePointCharStream = CharStreams.fromString(allLines);
        GrammarLexer lex = new GrammarLexer(codePointCharStream);
        lex.removeErrorListeners();
        CommonTokenStream tokens = new CommonTokenStream(lex);
        GrammarParser parser = new GrammarParser(tokens);
        parser.removeErrorListeners();
        parser.setErrorHandler(new DefaultErrorStrategy());
        ParseTree tree;
        try {
            tree = parser.prog();
            MyVisitor v = new MyVisitor();
            var result = v.visit(tree);
            System.out.println(result);
            VirtualMachine vm = new VirtualMachine((String) result);
            vm.Run();


            //System.out.println(tree.toStringTree(parser));

        }
        catch (RecognitionException e){
            System.out.println("CHYBA");
        }
    }
}