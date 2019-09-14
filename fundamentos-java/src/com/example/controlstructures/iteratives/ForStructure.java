package com.example.controlstructures.iteratives;

/**
 * Las estructuras de control permiten al desarrollador
 * modificar el flujo de ejecución de una aplicación
 *
 * En java existen distintas estructuras de control, algunas de ellas pertenecen a un grupo llamado
 * Estructuras de control Iterativas:
 *
 *   - Inician o repiten un bloque de instrucciones si se cumple una condición o mientras se cumple una condición
 */
public class ForStructure {

    public static void main(String[] args) {

        /*
         * La estructura de control for contiene 3 componentes:
         *  - Inicio: Variable de control
         *  - Final: Condición mientras la cual el for se continuará ejecutando
         *  - Tamaño de paso: Aqui se aumenta la cantidad deseada a la variable de control
         */
        System.out.println("---- For i++ ----");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("---- For i+=2 ----");
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }

        // For para una cuenta regresiva
        System.out.println("---- For i-- ----");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // Cabe resaltar que el valor inicial puede ser declarado fuera del for y tener el nombre que deseemos.
        System.out.println("---- For con var: valorInicial ----");
        int valorInicial;
        for (valorInicial = 4; valorInicial < 10; valorInicial++) {
            System.out.println(valorInicial);
        }

        // Así como también podemos usar una variable ya inicializada y omitir este componente en el for
        System.out.println("---- For con var Inicializada: valorInicial ----");
        valorInicial = 10;
        for (; valorInicial < 20; valorInicial++) {
            System.out.println(valorInicial);
        }
    }
}
