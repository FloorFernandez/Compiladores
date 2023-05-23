// Generated from c:\Users\axeld\Desktop\TC\Copia del compilador para tps\TC2023-TP1\src\main\java\compiladores\compiladores.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiladoresParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiladoresVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#inicializacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacion(compiladoresParser.InicializacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#listaid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaid(compiladoresParser.ListaidContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(compiladoresParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacion_double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_double(compiladoresParser.Asignacion_doubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion_double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_double(compiladoresParser.Declaracion_doubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#inicializacion_double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacion_double(compiladoresParser.Inicializacion_doubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(compiladoresParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#iwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIwhile(compiladoresParser.IwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresion_D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_D(compiladoresParser.Expresion_DContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(compiladoresParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(compiladoresParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#variableTipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableTipo(compiladoresParser.VariableTipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#funcion_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_call(compiladoresParser.Funcion_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(compiladoresParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(compiladoresParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#funcionTipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionTipo(compiladoresParser.FuncionTipoContext ctx);
}