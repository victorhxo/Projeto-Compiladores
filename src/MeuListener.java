import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

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
            System.out.println("Declaracao duplicada! Variavel " + id + " ja declarada");
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
    public void enterNAtribuicao(PyCParser.NAtribuicaoContext ctx) {
        String id = ctx.ID(0).getText();
        if (!tabelaSimbolos.containsKey(id)) {
            tabelaUsosNaoDeclarados.add(id);
        }
    }


    @Override
    public void exitNPrograma(PyCParser.NProgramaContext ctx) {
        if (!tabelaUsosNaoDeclarados.isEmpty()) {
            System.out.println("Erro: Variáveis não declaradas: " + tabelaUsosNaoDeclarados);
        }
    }
}
