grammar compiladores;

@header {
package compiladores;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

PYC : ';';
PA : '(';
PC : ')';
LLA : '{';
LLC : '}';
CA : '[';
CC : ']';
ASIGN : '=';
COMA : ',';
SUMA : '+';
RESTA : '-';
MULT : '*';
DIV : '/';
MOD : '%';

MENOR : '<';
MAYOR : '>';
MENORIGUAL : '<=';
MAYORIGUAL : '>=';
IGUAL : '==';
DISTINTO : '!=';

NUMERO : DIGITO+ ;

NUMERO_DOUBLE : DIGITO+ '.' DIGITO+;
//OTRO : . ;

INT : 'int';
CHAR : 'char';
DOUBLE : 'double';
VOID : 'void';

WHILE : 'while';
IF : 'if' ;
ELSE: 'else';
FOR : 'for' ;

//es asterisco y no un + para que se pueda escribir mas de 1 letra
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

//se usa para ignorar los caracteres en el corchete y con el skip lo salta
WS : [ \t\n\r] -> skip ;


programa : instrucciones EOF ;
instrucciones : instruccion instrucciones
              |
              ;

instruccion : asignacion 
            | declaracion
            | asignacion_double 
            | declaracion_double
            | bloque        
            | if_else
            | for_loop
            | iwhile
            | funcion_call
            ;

bloque : LLA instrucciones LLC ;

asignacion : ID ASIGN expresion PYC;
declaracion : INT ID inicializacion listaid PYC;

inicializacion : ASIGN NUMERO
               |
               ;
listaid : COMA ID inicializacion listaid
        |
        ;

expresion : termino exp
          | llamadaFuncion  
          ;

exp : SUMA termino exp
    | RESTA termino exp
    | comp
    |
    ;

termino : factor term ;

term : MULT factor term
     | DIV factor term
     | MOD factor term
     |
     ;
factor : NUMERO
       | ID 
       | PA expresion PC
       |
       ;

       //asignacion y declaracion para el tipo de dato DOUBLE

asignacion_double : ID ASIGN expresion PYC;
declaracion_double : DOUBLE ID inicializacion_double listaid PYC;

inicializacion_double : ASIGN NUMERO_DOUBLE
                      | ASIGN NUMERO
                      |
                      ;

comp : MENOR 
     | MAYOR 
     | MENORIGUAL 
     | MAYORIGUAL 
     | IGUAL 
     | DISTINTO 
     ;

iwhile : WHILE PA expresion_D PC bloque;          //uso del bloque

expresion_D : expresion comp expresion
            | PYC
            | llamadaFuncion
            ;

// Regla para una ESTRUCTURA DE CONTROL IF
if_else : IF PA expresion_D PC bloque 
             | ELSE bloque
             ;
// Regla para un BUCLE FOR
for_loop : FOR PA variableTipo asignacion 
         | expresion_D 
         | PC
         | bloque 
         ;

variableTipo : INT 
             | CHAR
             | DOUBLE
             ;

//    ---------------------       FUNCIONES                -----------------------------------
//declaracion de funciones

funcion_call : funcionTipo ID PA parametros PC bloque ;
parametros : parametro (COMA parametro)*
           |
           ;
parametro : funcionTipo ID ;

//lamada a funciones

llamadaFuncion : ID PA argumentos PC PYC;
argumentos : expresion (COMA expresion)*; 

//tipo de funciones

funcionTipo : INT 
            | CHAR
            | DOUBLE
            | VOID
            ;

