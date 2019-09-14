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
public class DoWhileStructure {

    public static void main(String[] args) {

        /*
         * La estructura de control do-while ejecuta un bloque de c&oacute;digo y, posteriormente,
         * evalua una condición booleana. Este bloque se ejecutará hasta que esta condición sea falsa.
         * do { bloque a ejecutar } while(condicion)
         *
         * Se dice que es de tipo "pos prueba", pues primero realiza la acción y luego pregunta por
         * la condición
         */
        do {
            System.out.println("Se ejecuta al menos una vez");
        } while (false);

        System.out.println("---- Do-While i++ ----");
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        System.out.println("---- Do-While i+=2 ----");
        i = 0;
        do {
            System.out.println(i);
            i+=2;
        } while (i < 10);

        // Do-While para una cuenta regresiva
        System.out.println("---- Do-While i-- ----");
        i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i > 0);
    }
}
