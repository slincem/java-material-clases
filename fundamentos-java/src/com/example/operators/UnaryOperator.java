package com.example.operators;

/**
 * Existen diversos tipos de operadores en Java
 *
 *  Operadores Unarios:
 *      Operador1: +    Indica que un valor es positivo, típicamente se obvia.
 *      Operador2: ‐    Multiplica por menos uno, una expresión numérica.
 *      Operador3: ++   Incrementa en uno el valor de una variable.
 *      Operador4: ‐‐   Decrementa en uno el valor de una variable.
 *      Operador5: !    Invierte el valor de una expresión booleana.
 */
public class UnaryOperator {

    public static void main(String[] args) {
        int operador1 = +3;
        int operador2 = -3;

        int operador3 = operador1++;
        int operador4 = operador2--;

        boolean esVerdadero = true;
        boolean operador5 = !esVerdadero;
    }
}
