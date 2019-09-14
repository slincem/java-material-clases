package com.example.methods;

/**
 *
 * Un método es un conjunto de instrucciones definidas dentro de una clase
 * el cual posee un nombre, con el que posteriormente podrá ser invocado.
 *
 * La estructura de un método es la siguiente:
 *
 *
 *   [acceso] tipoRetorno nombreMetodo ([listaParametros]) [throws listaExcepciones] {
 *       // Instrucciones;
 *       [return retornoDelMetodo;]
 *   }
 *
 * Los elementos que se encuentran entre corchetes son opcionales.
 *
 * La convención de nombres para los métodos es: camelCase Minuscula, siendo su primera palabra un verbo en infinivo.
 *
 * ej: realizarTarea(), ejecutarAccion().
 */
public class Method {

    /**
     * Este es el método main, que ya hemos usado previamente; cumpliendo la estructura definida.
     * @param args parámetro del método.
     */
    public static void main(String[] args) {

        imprimirEnConsola("1");

        imprimirSeparador();
        int resultadoSuma = sumarValores(3, 5);

        imprimirEnConsola(resultadoSuma);
    }

    public static void imprimirEnConsola(String valorAImprimir) {
        System.out.println(valorAImprimir);
    }

    // Sobrecarga
    public static void imprimirEnConsola(int valorAImprimir) {
        System.out.println(valorAImprimir);
    }

    public static int sumarValores(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void imprimirSeparador() {
        System.out.println("---------  Separador --------");
    }
}
