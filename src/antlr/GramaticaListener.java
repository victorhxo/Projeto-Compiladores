// Generated from .\Gramatica.g4 by ANTLR 4.13.0

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code NPrograma}
	 * labeled alternative in {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterNPrograma(GramaticaParser.NProgramaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NPrograma}
	 * labeled alternative in {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitNPrograma(GramaticaParser.NProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoDeclaracao}
	 * labeled alternative in {@link GramaticaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterBlocoDeclaracao(GramaticaParser.BlocoDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoDeclaracao}
	 * labeled alternative in {@link GramaticaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitBlocoDeclaracao(GramaticaParser.BlocoDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterNDeclaracao(GramaticaParser.NDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitNDeclaracao(GramaticaParser.NDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoAlgoritimo}
	 * labeled alternative in {@link GramaticaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterBlocoAlgoritimo(GramaticaParser.BlocoAlgoritimoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoAlgoritimo}
	 * labeled alternative in {@link GramaticaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitBlocoAlgoritimo(GramaticaParser.BlocoAlgoritimoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NInstrucao}
	 * labeled alternative in {@link GramaticaParser#instrucoes}.
	 * @param ctx the parse tree
	 */
	void enterNInstrucao(GramaticaParser.NInstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NInstrucao}
	 * labeled alternative in {@link GramaticaParser#instrucoes}.
	 * @param ctx the parse tree
	 */
	void exitNInstrucao(GramaticaParser.NInstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOperacao}
	 * labeled alternative in {@link GramaticaParser#operacoes}.
	 * @param ctx the parse tree
	 */
	void enterNOperacao(GramaticaParser.NOperacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOperacao}
	 * labeled alternative in {@link GramaticaParser#operacoes}.
	 * @param ctx the parse tree
	 */
	void exitNOperacao(GramaticaParser.NOperacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterNAtribuicao(GramaticaParser.NAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitNAtribuicao(GramaticaParser.NAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NLeitura}
	 * labeled alternative in {@link GramaticaParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterNLeitura(GramaticaParser.NLeituraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NLeitura}
	 * labeled alternative in {@link GramaticaParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitNLeitura(GramaticaParser.NLeituraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEscrita}
	 * labeled alternative in {@link GramaticaParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterNEscrita(GramaticaParser.NEscritaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEscrita}
	 * labeled alternative in {@link GramaticaParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitNEscrita(GramaticaParser.NEscritaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NCondicional}
	 * labeled alternative in {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterNCondicional(GramaticaParser.NCondicionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NCondicional}
	 * labeled alternative in {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitNCondicional(GramaticaParser.NCondicionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NRepeticao}
	 * labeled alternative in {@link GramaticaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterNRepeticao(GramaticaParser.NRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NRepeticao}
	 * labeled alternative in {@link GramaticaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitNRepeticao(GramaticaParser.NRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpressao}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterNExpressao(GramaticaParser.NExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpressao}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitNExpressao(GramaticaParser.NExpressaoContext ctx);
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
	 * Enter a parse tree produced by the {@code NOperacaoCauda}
	 * labeled alternative in {@link GramaticaParser#operacao_cauda}.
	 * @param ctx the parse tree
	 */
	void enterNOperacaoCauda(GramaticaParser.NOperacaoCaudaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOperacaoCauda}
	 * labeled alternative in {@link GramaticaParser#operacao_cauda}.
	 * @param ctx the parse tree
	 */
	void exitNOperacaoCauda(GramaticaParser.NOperacaoCaudaContext ctx);
}