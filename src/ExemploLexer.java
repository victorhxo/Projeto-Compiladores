import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class ExemploLexer {

    public static void main (String [] args){
        String filename = "src\\codigos-teste\\codigo.txt";
        try {
            CharStream input = CharStreams.fromFileName(filename);
            GramaticaLexer lexer = new GramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GramaticaParser parser = new GramaticaParser(tokens);

            ParseTree ast = parser.programa();
            System.out.println(ast.toStringTree());
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
    }
}
