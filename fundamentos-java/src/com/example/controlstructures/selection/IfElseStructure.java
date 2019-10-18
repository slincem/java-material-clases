package com.example.controlstructures.selection;

/**
 * Las estructuras de control permiten al desarrollador
 * modificar el flujo de ejecución de una aplicación
 *
 * En java existen distintas estructuras de control, algunas de ellas pertenecen a un grupo llamado
 * Estructuras de control de selección:
 *
 *   - Ejecutan un bloque de instrucciones u otro, según se cumpla una condición o no
 */
public class IfElseStructure {

    public static void main(String[] args) {

        boolean esVerdadero = true;
        boolean esFalso = false;

        /*
         * Sentencia if simple, permite evaluar una condición y ejecutar un bloque de código
         * si dicha condición es verdadera.
         */
        if(esVerdadero) {
            System.out.println("Esta condición es verdadera");
        }

        /*
         * Sentencia if-else, permite evaluar una condición y ejecutar un bloque de código
         * si dicha condición es verdadera. Sin embargo, si la condición no resulta ser verdadera
         * se ejecutará el bloque de código contenido justo después de la palabra reservada "else"
         */
        if(esFalso) {
            System.out.println("Bloque de código de la sentencia if");
        } else {
            // Este será el bloque que se ejecutará
            System.out.println("Bloque de código de la sentencia else");
        }

        /*
         * Se pueden plantear múltiples condiciones simultáneamente. Una vez se ejecute una de ellas
         * finalizará el proceso de evaluación; en caso contrario se ejecutará el bloque de sentencias
         * contenido en el else (en caso de que este exista).
         */
        if(4 < 3) {
            System.out.println("Bloque de sentencias 1");
        } else if(5 < 4) {
            System.out.println("Bloque de sentencias 2");
        } else if(6 < 3) {
            System.out.println("Bloque de sentencias 3");
        } else {
            // Este será el bloque que se ejecutará
            System.out.println("Bloque de sentencias del else");
        }
    }
}
