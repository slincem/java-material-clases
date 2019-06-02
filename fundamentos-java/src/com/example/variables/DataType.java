package com.example.variables;

/**
 * Existen distintos Tipos de Datos en Java.
 *
 * int: El tipo de dato entero está compuesto por 32 bits en complemento a dos.
 * Tiene un valor mínimo de -2,147,483,648 y un máximo de 2,147,483,647 inclusivos.
 * Para valores enteros, éste tipo de dato es el preferido, a menos que no la información a manejar no se enmarque en el rango anterior.
 * Si es necesario usar números que sobrepasen el rango el tipo de dato que se usa es long.
 *
 * double: El tipo de dato dobles representa números bajo el estándar IEEE 754 de 64 bits en punto flotante.
 * Para valores decimales éste es el tipo de dato preferido.
 * No debe ser usado para para valores que requieran una precisión estricta como dinero (En el curso se va a manejar este tipo de dato).
 *
 * boolean: El tipo de dato booleano sólo tiene dos posibles valores: true y false .
 * Se usa éste tipo de dato para simples banderas que son consideradas en condiciones.
 * Representa un solo bit de información pero su tamaño real depende de la implementación del lenguaje.
 *
 * Otros primitivos:
 *      byte 8 bits [-128, 127]
 *      short 16 bits [-32,768, 32,767]
 *      long 64 bits [-9,223,372,036,854,775,808, -9,223,372,036,854,775,808]
 *      float 32 bits IEEE 754 de punto flotante.
 *      char 16 bits que representan un caracter Unicode.
 *
 * Aparte de los datos primitivos anteriores, el lenguaje Java también provee soporte especial para las cadenas de caracteres por medio de la
 * clase String.
 *
 * Si se encierra una cadena de caracteres por medio de comillas dobles " Java automáticamente nos crea un objeto de tipo String .
 * Ej.: Stringcadena="Soyunacadena.";
 *
 * El tipo de dato String no es primitivo, pero debido al especial soporte dado por el lenguaje y a su común presencia en el código fuente se
 * podría pensar en él como casi un tipo de dato primitivo.
 */
public class DataType {

    public static void main(String[] args) {

        // Los siguientes son tipos de dato Primitivos.

        //Tipo de dato short para las variables que almacenan información discreta, tiene una precisión de 8 bits. (-128, 127)
        byte decena = '1';

        //Tipo de dato short para las variables que almacenan información discreta, tiene una precisión de 16 bits.
        short numeroVehiculos = 7;

        //Tipo de dato entero para las variables que almacenan información discreta, tiene una precisión de 32 bits.
        int numeroCanciones = 12;

        //Tipo de dato long para las variables que almacenan información discreta, tiene una precisión de 64 bits.
        long cantidadArpones = 25L;

        //Tipo de dato Float para las variables que almacenan números con decimales, tiene una precisión de 32 bits.
        float kilometrosRecorridos = 1.3f;

        //Tipo de dato Double para las variables que almacenan números con decimales, tiene una precisión de 64 bits.
        double galonesTanqueados = 3.45;

        //Tipo de dato Char para representar todos los carácteres Unicode.
        char letraA = 'A';
        char caracter = 65;

        // Lógicos, para almacenar valores (booleanos) de falso o verdadero.
        boolean asistira = true;
        boolean acompanado = false;


        // A diferencia de los anteriores, String no es un tipo de dato primitivo.

        //String para las cadenas de caracteres;
        String apellidos = "Montaño Lince";

    }
}
