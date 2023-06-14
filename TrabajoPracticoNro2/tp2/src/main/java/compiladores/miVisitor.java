package compiladores;

import compiladores.compiladoresParser.ProgramaContext;

//recorrer y procesar los nodos del arbol
public class miVisitor extends compiladoresBaseVisitor<String> {

    @Override
    public String visitPrograma(ProgramaContext ctx) {
        System.out.println("A recorrer el arbol");

        // Invoca al método visitPrograma de la clase padre y devuelve el resultado
        return super.visitPrograma(ctx);
    }
    
}
