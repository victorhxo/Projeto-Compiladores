import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;

public class ExemploLexer {

    public static void main (String [] args){
        String filename = "C:\\Users\\victo\\OneDrive\\Desktop\\UFLA\\6 Periodo\\Compiladores\\Projeto-Compiladores\\src\\codigos-teste\\codigoErro.txt";
        try {
            CharStream input = CharStreams.fromFileName(filename);
            GramaticaLexer lexer = new GramaticaLexer(input);
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

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
