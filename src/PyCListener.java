// Generated from PyC.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PyCParser}.
 */
public interface PyCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code NPrograma}
	 * labeled alternative in {@link PyCParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterNPrograma(PyCParser.NProgramaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NPrograma}
	 * labeled alternative in {@link PyCParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitNPrograma(PyCParser.NProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoDeclaracao}
	 * labeled alternative in {@link PyCParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterBlocoDeclaracao(PyCParser.BlocoDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoDeclaracao}
	 * labeled alternative in {@link PyCParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitBlocoDeclaracao(PyCParser.BlocoDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link PyCParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterNDeclaracao(PyCParser.NDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link PyCParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitNDeclaracao(PyCParser.NDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoAlgoritimo}
	 * labeled alternative in {@link PyCParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterBlocoAlgoritimo(PyCParser.BlocoAlgoritimoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoAlgoritimo}
	 * labeled alternative in {@link PyCParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitBlocoAlgoritimo(PyCParser.BlocoAlgoritimoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NInstrucao}
	 * labeled alternative in {@link PyCParser#instrucoes}.
	 * @param ctx the parse tree
	 */
	void enterNInstrucao(PyCParser.NInstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NInstrucao}
	 * labeled alternative in {@link PyCParser#instrucoes}.
	 * @param ctx the parse tree
	 */
	void exitNInstrucao(PyCParser.NInstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOperacao}
	 * labeled alternative in {@link PyCParser#operacoes}.
	 * @param ctx the parse tree
	 */
	void enterNOperacao(PyCParser.NOperacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOperacao}
	 * labeled alternative in {@link PyCParser#operacoes}.
	 * @param ctx the parse tree
	 */
	void exitNOperacao(PyCParser.NOperacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link PyCParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterNAtribuicao(PyCParser.NAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link PyCParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitNAtribuicao(PyCParser.NAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NLeitura}
	 * labeled alternative in {@link PyCParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterNLeitura(PyCParser.NLeituraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NLeitura}
	 * labeled alternative in {@link PyCParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitNLeitura(PyCParser.NLeituraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEscrita}
	 * labeled alternative in {@link PyCParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterNEscrita(PyCParser.NEscritaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEscrita}
	 * labeled alternative in {@link PyCParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitNEscrita(PyCParser.NEscritaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NCondicional}
	 * labeled alternative in {@link PyCParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterNCondicional(PyCParser.NCondicionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NCondicional}
	 * labeled alternative in {@link PyCParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitNCondicional(PyCParser.NCondicionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NRepeticao}
	 * labeled alternative in {@link PyCParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterNRepeticao(PyCParser.NRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NRepeticao}
	 * labeled alternative in {@link PyCParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitNRepeticao(PyCParser.NRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpressao}
	 * labeled alternative in {@link PyCParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterNExpressao(PyCParser.NExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpressao}
	 * labeled alternative in {@link PyCParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitNExpressao(PyCParser.NExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyCParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(PyCParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyCParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(PyCParser.OperandoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOperacaoCauda}
	 * labeled alternative in {@link PyCParser#operacao_cauda}.
	 * @param ctx the parse tree
	 */
	void enterNOperacaoCauda(PyCParser.NOperacaoCaudaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOperacaoCauda}
	 * labeled alternative in {@link PyCParser#operacao_cauda}.
	 * @param ctx the parse tree
	 */
	void exitNOperacaoCauda(PyCParser.NOperacaoCaudaContext ctx);
}