// Generated from C:/Users/soare_wi5nw81/Desktop/d/Desktop/Faculdade/2 ano/2 semestre/LPROG/lprog2021sprintC/src/main/java\SprintCSEMLAPR4.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SprintCSEMLAPR4Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SprintCSEMLAPR4Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SprintCSEMLAPR4Parser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(SprintCSEMLAPR4Parser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoLerRapelCliente}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#lerRapelCliente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoLerRapelCliente(SprintCSEMLAPR4Parser.MetodoLerRapelClienteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoAlterarRapelCliente}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#alterarRapelCliente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoAlterarRapelCliente(SprintCSEMLAPR4Parser.MetodoAlterarRapelClienteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoLerPrecoProduto}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#lerPrecoProduto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoLerPrecoProduto(SprintCSEMLAPR4Parser.MetodoLerPrecoProdutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoAlterarPrecoProduto}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#alterarPrecoProduto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoAlterarPrecoProduto(SprintCSEMLAPR4Parser.MetodoAlterarPrecoProdutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoCalcularPrecoTotal}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#calcularPrecoTotal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoCalcularPrecoTotal(SprintCSEMLAPR4Parser.MetodoCalcularPrecoTotalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoAplicarDescontoRapel}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#aplicarDescontoRapel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoAplicarDescontoRapel(SprintCSEMLAPR4Parser.MetodoAplicarDescontoRapelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoEnviarEmail}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#enviarEmail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoEnviarEmail(SprintCSEMLAPR4Parser.MetodoEnviarEmailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoReportarAnomaliaDeComunicacao}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#reportarAnomaliaDeComunicacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoReportarAnomaliaDeComunicacao(SprintCSEMLAPR4Parser.MetodoReportarAnomaliaDeComunicacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoReportarAnomaliaNumEquipamento}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#reportarAnomaliaNumEquipamento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoReportarAnomaliaNumEquipamento(SprintCSEMLAPR4Parser.MetodoReportarAnomaliaNumEquipamentoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoReportarAnomaliaNumaApp}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#reportarAnomaliaNumaApp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoReportarAnomaliaNumaApp(SprintCSEMLAPR4Parser.MetodoReportarAnomaliaNumaAppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoRequerCotacaoVendaPGrosso}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#requerCotacaoVendaPGrosso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoRequerCotacaoVendaPGrosso(SprintCSEMLAPR4Parser.MetodoRequerCotacaoVendaPGrossoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoAutAppDescFinanc}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#autAppDescFinanc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoAutAppDescFinanc(SprintCSEMLAPR4Parser.MetodoAutAppDescFinancContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoAlterarNibCliente}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#alterarNibCliente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoAlterarNibCliente(SprintCSEMLAPR4Parser.MetodoAlterarNibClienteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoAlterarResidenciaCliente}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#alterarResidenciaCliente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoAlterarResidenciaCliente(SprintCSEMLAPR4Parser.MetodoAlterarResidenciaClienteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoAlterarEstadoCivilCliente}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#alterarEstadoCivilCliente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoAlterarEstadoCivilCliente(SprintCSEMLAPR4Parser.MetodoAlterarEstadoCivilClienteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoAtualHabilit}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#atualHabilit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoAtualHabilit(SprintCSEMLAPR4Parser.MetodoAtualHabilitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoMarcaFerias}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#marcaFerias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoMarcaFerias(SprintCSEMLAPR4Parser.MetodoMarcaFeriasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoJustificaFalta}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#justificaFalta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoJustificaFalta(SprintCSEMLAPR4Parser.MetodoJustificaFaltaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoInformaAusenciaFutura}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#informaAusenciaFutura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoInformaAusenciaFutura(SprintCSEMLAPR4Parser.MetodoInformaAusenciaFuturaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoRemetente}
	 * labeled alternative in {@link SprintCSEMLAPR4Parser#remetente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoRemetente(SprintCSEMLAPR4Parser.MetodoRemetenteContext ctx);
}