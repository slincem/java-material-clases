package com.example.operators;

/**
 * Existen diversos tipos de operadores en Java
 *
 * Operador de asignación:
 *      El caracter = es el operador de asignación. Nos permite dar un valor a una determinada variable.
 *
 * Operadores aritméticos:
 *      El lenguaje Java provee operadores que realizan sumas, restas, multiplicaciones y divisiones. Son los conocidos en matemáticas.
 *          + Para sumar dos expresiones numéricas. En las cadenas sirve para concatenar.
 *          ‐ Operador de resta.
 *          * Operador de multiplicación.
 *          / Operador de división.
 *          % Módulo.
 *
 */
public class ArithmeticOperator {

    public static void main(String[] args) {
        usarOperadorAritmeticoDeSuma();
        usarOperadorAritmeticoDeResta();
        usarOperadorAritmeticoDeMultiplicacion();
        usarOperadorAritmeticoDeDivision();
        usarOperadorAritmeticoDeModulo();
    }



    public static void usarOperadorAritmeticoDeSuma() {
        int primerNumero = 1;
        int segundoNumero = 2;

        int resultado = primerNumero + segundoNumero;
        System.out.println("Resultado de la suma: " + resultado);
    }

    public static void usarOperadorAritmeticoDeResta() {
        int primerNumero = 1;
        int segundoNumero = 2;

        int resultado = primerNumero - segundoNumero;
        System.out.println("Resultado de la resta: " + resultado);
    }

    public static void usarOperadorAritmeticoDeMultiplicacion() {
        int primerNumero = 1;
        int segundoNumero = 2;

        int resultado = primerNumero * segundoNumero;
        System.out.println("Resultado de la multiplicación: " + resultado);
    }

    public static void usarOperadorAritmeticoDeDivision() {
        double primerNumero = 1;
        double segundoNumero = 2;

        double resultado = primerNumero / segundoNumero;
        System.out.println("Resultado de la devisión: " + resultado);
    }

    public static void usarOperadorAritmeticoDeModulo() {
        int primerNumero = 10;
        int segundoNumero = 8;

        double resultado = primerNumero % segundoNumero;
        System.out.println("Resultado del módulo: " + resultado);
    }
}
