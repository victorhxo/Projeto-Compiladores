// Generated from Gramatica.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(GramaticaParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(GramaticaParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(GramaticaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(GramaticaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterAlgoritmo(GramaticaParser.AlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitAlgoritmo(GramaticaParser.AlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrucoes}.
	 * @param ctx the parse tree
	 */
	void enterInstrucoes(GramaticaParser.InstrucoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrucoes}.
	 * @param ctx the parse tree
	 */
	void exitInstrucoes(GramaticaParser.InstrucoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operacoes}.
	 * @param ctx the parse tree
	 */
	void enterOperacoes(GramaticaParser.OperacoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operacoes}.
	 * @param ctx the parse tree
	 */
	void exitOperacoes(GramaticaParser.OperacoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterLeitura(GramaticaParser.LeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitLeitura(GramaticaParser.LeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterEscrita(GramaticaParser.EscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitEscrita(GramaticaParser.EscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(GramaticaParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(GramaticaParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(GramaticaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(GramaticaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(GramaticaParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(GramaticaParser.OperandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operacao_cauda}.
	 * @param ctx the parse tree
	 */
	void enterOperacao_cauda(GramaticaParser.Operacao_caudaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operacao_cauda}.
	 * @param ctx the parse tree
	 */
	void exitOperacao_cauda(GramaticaParser.Operacao_caudaContext ctx);
}