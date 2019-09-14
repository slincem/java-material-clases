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
public class WhileStructure {

    public static void main(String[] args) {

        /*
         * La estructura de control while continua hasta que su condición sea falsa:
         * while(condicion) { bloque a ejecutar }
         */
        System.out.println("---- While i++ ----");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("---- While i+=2 ----");
        i = 0;
        while (i < 10) {
            System.out.println(i);
            i+=2;
        }

        // While para una cuenta regresiva
        System.out.println("---- While i-- ----");
        i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
