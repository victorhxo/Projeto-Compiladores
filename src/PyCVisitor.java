// Generated from PyC.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PyCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PyCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code NPrograma}
	 * labeled alternative in {@link PyCParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNPrograma(PyCParser.NProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoDeclaracao}
	 * labeled alternative in {@link PyCParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoDeclaracao(PyCParser.BlocoDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link PyCParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNDeclaracao(PyCParser.NDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoAlgoritimo}
	 * labeled alternative in {@link PyCParser#algoritmo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoAlgoritimo(PyCParser.BlocoAlgoritimoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NInstrucao}
	 * labeled alternative in {@link PyCParser#instrucoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNInstrucao(PyCParser.NInstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOperacao}
	 * labeled alternative in {@link PyCParser#operacoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOperacao(PyCParser.NOperacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link PyCParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNAtribuicao(PyCParser.NAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NLeitura}
	 * labeled alternative in {@link PyCParser#leitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNLeitura(PyCParser.NLeituraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NEscrita}
	 * labeled alternative in {@link PyCParser#escrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNEscrita(PyCParser.NEscritaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NCondicional}
	 * labeled alternative in {@link PyCParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNCondicional(PyCParser.NCondicionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NRepeticao}
	 * labeled alternative in {@link PyCParser#repeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNRepeticao(PyCParser.NRepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NExpressao}
	 * labeled alternative in {@link PyCParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNExpressao(PyCParser.NExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyCParser#operando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperando(PyCParser.OperandoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOperacaoCauda}
	 * labeled alternative in {@link PyCParser#operacao_cauda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOperacaoCauda(PyCParser.NOperacaoCaudaContext ctx);
}