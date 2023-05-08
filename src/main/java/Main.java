import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("testovaci.txt"));
        String allLines = new String();
        String line;
        while((line = (br.readLine())) != null){
            allLines += line;
        }
        br.close();


        CodePointCharStream codePointCharStream = CharStreams.fromString(allLines);
        GrammarLexer lex = new GrammarLexer(codePointCharStream);
        lex.removeErrorListeners();
        CommonTokenStream tokens = new CommonTokenStream(lex);
        GrammarParser parser = new GrammarParser(tokens);
        //parser.removeErrorListeners();
        parser.setErrorHandler(new DefaultErrorStrategy());
        ParseTree tree;
        try {
            tree = parser.prog();
            MyVisitor v = new MyVisitor();
            var result = v.visit(tree);
            if(!MyVisitor.sb_Errors.isEmpty()){
                System.out.println("VSTUP OBSAHUJE CHYBY, kod neni zpracovan:");
                System.out.println(MyVisitor.sb_Errors.toString());
            }
            else {
                BufferedWriter vysledky = new BufferedWriter(new FileWriter("vysledky.txt",false));
                vysledky.write(result.toString());
                vysledky.close();

                BufferedReader soubor = new BufferedReader(new FileReader("vysledky.txt"));
                StringBuilder vstup = new StringBuilder();
                while((line = (soubor.readLine())) != null){
                    vstup.append(line+"\n");
                }
                VirtualMachine vm = new VirtualMachine(vstup.toString());
                vm.Run();
            }


        }
        catch (Exception e){
            System.out.println("CHYBA");
        }
    }
}