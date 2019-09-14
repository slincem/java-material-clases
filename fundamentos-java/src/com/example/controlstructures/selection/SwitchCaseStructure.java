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
public class SwitchCaseStructure {

    public static void main(String[] args) {

        String mes = "Junio";

        /*
         * Con esta sentencia podemos ejecutar diversas acciones en función
         * de una expresión. Esta es una expresión alternativa al if-elseif-else
         * cuando se compara una misma expresión con distintos valores
         */
        switch (mes) {
            case "Enero":
                System.out.println("Es Enero");
                break;
            case "Febrero":
                System.out.println("Es Febrero");
                break;
            case "Junio":
                System.out.println("Es Junio");
                break;
            case "Diciembre":
                System.out.println("Es Diciembre");
                break;
        }

        // El tipo de dato de los "case" deben corresponder a la expresión a evaluar
        int mesEntero = 2;
        switch (mesEntero) {
            case 1:
                System.out.println("Es Enero");
                break;
            case 2:
                System.out.println("Es Febrero");
                break;
            case 6:
                System.out.println("Es Junio");
                break;
            case 12:
                System.out.println("Es Diciembre");
                break;
        }

        // La expresión "else", en un switch es llamada "default"
        int mesInexistente = 13;
        switch (mesInexistente) {
            case 1:
                System.out.println("Es Enero");
                break;
            case 2:
                System.out.println("Es Febrero");
                break;
            case 6:
                System.out.println("Es Junio");
                break;
            case 12:
                System.out.println("Es Diciembre");
                break;
            default:
                System.out.println("Este mes no existe");
        }

        /*
         * Por otro lado, es importante tener en cuenta la palabra reservada "break"
         * con el fin de detener la ejecución del "case". De no usarse, se ejecutaran
         * los demás que se encuentren posteriores al mismo.
         */
        String operacion = "suma";
        switch (operacion) {
            case "suma":
                int a = 1;
                int b = 2;
                int resultadoSuma = a + b;
                System.out.println("suma:" + resultadoSuma);
            case "resta":
                int c = 1;
                int d = 2;
                int resultadoResta = c - d;
                System.out.println("suma:" + resultadoResta);
            case "multiplicacion":
                int e = 1;
                int f = 2;
                int resultadoMultiplicacion = e * f;
                System.out.println("multiplicacion:" + resultadoMultiplicacion);
            case "division":
                int g = 1;
                int h = 2;
                int resultadoDivision = h % g;
                System.out.println("division:" + resultadoDivision);
            default:
                System.out.println("Operación no existente");
        }
    }
}
