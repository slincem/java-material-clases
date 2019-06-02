package com.example.casting;

/**
 *
 * Conversión de tipos y Casting:
 *
 *      Las conversiones de tipos de datos nos permiten pasar de una representación dada en un tipo de dato determinado a otra representación.
 *      Por ejemplo si tenemos 7.0 doble y deseamos usarlo como un entero 7 tendremos que hacer una conversión de tipo de dato.
 *      El lenguaje hace las conversiones de forma implícita y automática para cuando no hay perdida de precisión.
 *      Si existe perdida de precisión el programador tendrá que hacer la conversión de forma explícita por medio de casting.
 */
public class Caster {

    public static void castearImplicitamente() {
        int a = 1234;
        long b = a;

        char c = 'X';
        int d = c;
    }

    public static void castearExplicitamente() {
        long a = 4321L;
        int b = (int) a;

        double c = 12.34;
        float d = (float) c;
    }

    /**
     * Cuando tenemos una cadena que deseamos convertir a su tipo numérico usamos la clase del tipo numérico (Wrapper)
     * de la siguiente forma: Tipo.parseTipo("Número");
     */
    public static void castearDeCadenaAOtrosTipos() {
        //Si no puede ser realizada la conversión con éxito se lanza una excepción y se dice entonces que tenemos un error en tiempo de ejecución

        int a = Integer.parseInt("1212");
        double b = Double.parseDouble("12.12");
        long c = Long.parseLong("1212");
        float d = Float.parseFloat("12.12");

        /*
         * Byte.parseByte("numero");
         * Short.parseShort("numero");
         * Boolean.parseBoolean("false ó true");
         */

    }
}
