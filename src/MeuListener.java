import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class MeuListener extends PyCBaseListener{

    private Map<String,String> tabelaSimbolos = new HashMap<String,String>();
    private Set<String> tabelaUsosNaoDeclarados = new HashSet<>();

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }

    /*ERRO DE DECLARACAO DUPLICADA*/
    @Override
    public void exitNDeclaracao(PyCParser.NDeclaracaoContext ctx) {
//        System.out.println("Out declaração:" + ctx.getText());
        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();
        if (tabelaSimbolos.containsKey(id)){
            System.out.println("Erro: Declaracao duplicada!" + "\n" + "Variavel [" + id + "] ja declarada");
        } else {
            tabelaSimbolos.put(id,tipo);
        }
    }

    /*ERRO DE VARIAVEL NAO DECLARADA*/
    @Override
    public void enterOperando(PyCParser.OperandoContext ctx) {
        String id = ctx.ID().getText();
        if (!tabelaSimbolos.containsKey(id)){
            tabelaUsosNaoDeclarados.add(id);
        }
    }

    @Override
    public void enterNEscrita(PyCParser.NEscritaContext ctx) {
        String id = ctx.ID().getText();
        if (!tabelaSimbolos.containsKey(id)){
            tabelaUsosNaoDeclarados.add(id);
        }
    }

    @Override
    public void enterNLeitura(PyCParser.NLeituraContext ctx) {
        String id = ctx.ID().getText();
        if (!tabelaSimbolos.containsKey(id)){
            tabelaUsosNaoDeclarados.add(id);
        }
    }

    @Override
    public void enterNAtribuicao(PyCParser.NAtribuicaoContext ctx) {
        List<String> ids = new ArrayList<>();
        for (TerminalNode idNode : ctx.ID()) {
            String id = idNode.getText();
            if (!tabelaSimbolos.containsKey(id)){
                tabelaUsosNaoDeclarados.add(id);
            }
            ids.add(id);
        }

        if(ids.size() == 2){
            String id1 = ids.get(0);
            String id2 = ids.get(1);

            if (tabelaSimbolos.containsKey(id1) && tabelaSimbolos.containsKey(id2)) {
                String tipo1 = tabelaSimbolos.get(id1);
                String tipo2 = tabelaSimbolos.get(id2);

                if (!tipo1.equals(tipo2)) {
                    int linha = ctx.getStart().getLine();
                    System.out.println("Erro: Tipos dos IDs em atribuição não são iguais na linha de numero " + linha);
                    System.out.println("ID: [" + id1 + "] tem tipo [" + tipo1 + "]");
                    System.out.println("ID: [" + id2 + "] tem tipo [" + tipo2 + "]");
                }
            }
        }
    }


    @Override
    public void exitNPrograma(PyCParser.NProgramaContext ctx) {
        if (!tabelaUsosNaoDeclarados.isEmpty()) {
            System.out.println("Erro: Variáveis não declaradas: " + tabelaUsosNaoDeclarados);
        }
    }
}
