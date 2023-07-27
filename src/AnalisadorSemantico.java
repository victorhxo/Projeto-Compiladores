import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class AnalisadorSemantico {
    public static void main (String [] args){
        PyCParser parser = getParser("src\\codigos-teste\\codigoErro.txt");

        ParseTree ast = parser.programa();

        MeuListener listener = new MeuListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, ast);

    }
    public static PyCParser getParser(String filename){
        PyCParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(filename);
            PyCLexer lexer = new PyCLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new PyCParser(tokens);


            /*
            Token token;
            while(!lexer._hitEOF){
                token = lexer.nextToken();
                if(token.getType() == 15){
                    System.out.println("Erro: Encontrado um token do tipo ErrorChar na linha " + token.getLine());
                    return;
                } else {
                    System.out.println("Token: "+ token);
                    System.out.println("     Lexema: " + token.getText());
                    System.out.println("     Classe: " + lexer.getVocabulary().getDisplayName(token.getType()));
                }
            }
            */

        } catch(IOException e){
            e.printStackTrace();
        }
        return  parser;
    }
}
