package com.example.operators;

/**
 * Existen diversos tipos de operadores en Java
 *
 *  Operadores Logicos:
 *      Se usan para realizar operaciones entre expresiones booleanas.
 *
 *              ||  Operador Lógico OR
 *              &&  Operador Lógico AND
 *
 */
public class LogicOperator {

    public static void main(String[] args) {

        boolean verdadero = true;
        boolean falso = false;

        boolean todosSonVerdaderos = verdadero && falso;
        System.out.println(todosSonVerdaderos);
        // Imprime false.

        boolean algunoEsVerdadero = verdadero || falso;
        System.out.println(algunoEsVerdadero);
        // Imprime true

    }
}
