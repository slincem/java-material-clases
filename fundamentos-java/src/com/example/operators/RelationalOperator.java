package com.example.operators;

/**
 * Existen diversos tipos de operadores en Java
 *
 *  Operadores Relacionales:
 *      Los operadores relacionales nos permiten determinar si un operando es mayor, menor, igual o diferente de otro operando. Su resultado es
 *      un booleano.
 *
 *              ==  Igual a (Operador usado para primitivos, para cadenas se usa `.equals`)
 *              !=  Diferente de
 *              >   Mayor que
 *              >=  Mayor o igual
 *              <   Menor que
 *              <=  Menor o igual que
 */
public class RelationalOperator {

    public static void main(String[] args) {
        int a=2;
        int b=7;

        System.out.println(a==b);
        //Salida:false

        System.out.println(a!=b);
        //Salida:true

        System.out.println(a<=b);
        //Salida:true

        System.out.println(a >= b);
        //Salida:false

    }
}
