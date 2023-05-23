// Generated from c:\Users\axeld\Desktop\TC\Copia del compilador para tps\TC2023-TP1\src\main\java\compiladores\compiladores.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladoresParser}.
 */
public interface compiladoresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void enterInicializacion(compiladoresParser.InicializacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void exitInicializacion(compiladoresParser.InicializacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#listaid}.
	 * @param ctx the parse tree
	 */
	void enterListaid(compiladoresParser.ListaidContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#listaid}.
	 * @param ctx the parse tree
	 */
	void exitListaid(compiladoresParser.ListaidContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(compiladoresParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(compiladoresParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(compiladoresParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignacion_double}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_double(compiladoresParser.Asignacion_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignacion_double}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_double(compiladoresParser.Asignacion_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracion_double}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_double(compiladoresParser.Declaracion_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracion_double}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_double(compiladoresParser.Declaracion_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#inicializacion_double}.
	 * @param ctx the parse tree
	 */
	void enterInicializacion_double(compiladoresParser.Inicializacion_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#inicializacion_double}.
	 * @param ctx the parse tree
	 */
	void exitInicializacion_double(compiladoresParser.Inicializacion_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(compiladoresParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(compiladoresParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void enterIwhile(compiladoresParser.IwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void exitIwhile(compiladoresParser.IwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresion_D}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_D(compiladoresParser.Expresion_DContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresion_D}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_D(compiladoresParser.Expresion_DContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(compiladoresParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(compiladoresParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(compiladoresParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(compiladoresParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#variableTipo}.
	 * @param ctx the parse tree
	 */
	void enterVariableTipo(compiladoresParser.VariableTipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#variableTipo}.
	 * @param ctx the parse tree
	 */
	void exitVariableTipo(compiladoresParser.VariableTipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#funcion_call}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_call(compiladoresParser.Funcion_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#funcion_call}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_call(compiladoresParser.Funcion_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(compiladoresParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(compiladoresParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(compiladoresParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(compiladoresParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#funcionTipo}.
	 * @param ctx the parse tree
	 */
	void enterFuncionTipo(compiladoresParser.FuncionTipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#funcionTipo}.
	 * @param ctx the parse tree
	 */
	void exitFuncionTipo(compiladoresParser.FuncionTipoContext ctx);
}