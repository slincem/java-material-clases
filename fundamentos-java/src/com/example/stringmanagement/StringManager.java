package com.example.stringmanagement;

/**
 * Las cadenas son inmutables, esto es, dado un valor no se les puede cambiar. Las variables que almacenan cadenas por el contrario
 * pueden tener diferentes valores de cadena. Para esto las cadenas existentes se procesan para crear unas copias modificadas y almacenar
 * sus valores en las variables.
 */
public class StringManager {

    public static void main(String[] args) {

        // La forma directa para declarar una cadena, En éste caso, "HolaMundo!" es una cadena de caracteres instanciada (se crea un objeto de) por el compilador.
        String saludo = "Hola Mundo!";

        //Las cadenas de caracteres son arreglos de estos:
        String hello = "hello.";
        //Equivale a:
        char[] helloArray = {'h','e','l','l','o','.' };

        //La cadena vacía no contiene caracteres y se escribe como "" ;
        String vacio = "";
    }

    /**
     * El método accesor que nos permite obtener el tamaño de una cadena de caracteres es lenght().
     * Dicho método retorna el número decaracteres contenidos en la cadena.
     */
    public static void usarMetodoLength() {
        String saludo="HolaMundo!";
        System.out.println(saludo.length());
        //La salida es: 11
    }

    /**
     * El método charAt(posicion) me permite obtener un caracter en una posición determinada
     * de la cadena contando desde 0 (cero).
     */
    public static void usarMetodoCharAt() {
        //            012345
        String hello="hello.";
        System.out.println(hello.charAt(4));
        //La salida es: 'o'
        System.out.println(hello.charAt(0));
        //La salida es: 'h'
    }

    /**
     * La concatenación es la operación que nos permite unir dos o más cadenas en una sola.
     *
     * La concatenación puede hacerse como una mezcla de objetos y datos primitivos.
     * Para cada uno de ellos que no sea una cadena se invoca
     * el método toString() y para los primitivos se concatena su representación en String.
     */
    public static void concatenarCadenas() {

        String cadenaConcatenada="Hola,"+" Mundo"+"!";

        System.out.println(cadenaConcatenada);
        //Salida: "Hola, Mundo!"
    }

    /**
     * Para comparar cadenas se pueden usar los métodos equals y equalsIgnoreCase. El primer método compara cadenas teniendo en cuenta si
     * son mayúsculas o minúsculas. El segundo, ignora éste aspecto
     */
    public static void compararCadenas() {
        "cadena".equals("otraCadena");//false
        "CaDeNa".equalsIgnoreCase("cadena");//true
    }

    /**
     * Para determinar si un carácter está presente en una cadena se puede hacer uso de dos métodos:
     * El método indexOf() que devuelve la primera ocurrencia de un caracter dentro de una cadena y
     * el método lastIndexOf() retorna la última aparición del carácter.
     */
    public static void buscarEnCadenas() {
        System.out.println("Encuentrame".indexOf('e')); //4
        System.out.println("Encuentrame".lastIndexOf('e'));//10
        System.out.println("Encuentrame".indexOf('z')); //‐1
        System.out.println("Encuentrame".lastIndexOf('z'));//‐1
    }

    /**
     * Para reemplazar todas las ocurrencias de un carácter dentro de una cadena se debe usar el método replace .
     */
    public void reemplazarEnCadena() {
        System.out.println("Encuentrame".replace('e','a'));//Encuantrama
    }

    /**
     * Los métodos toLowerCase() y toUpperCase() permiten generar una cadena con sus caracteres de en minúscula o mayúscula
     * respectivamente.
     */
    public static void modificarCadenas() {
        System.out.println("Encuentrame".toLowerCase());//encuentrame
        System.out.println("Encuentrame".toUpperCase());//ENCUENTRAME

        //Para generar una cadena sin los caracteres que representan espacios en blanco al inicio y al final de ésta se usa el método trim() .
        System.out.println(" \n\tEncuentrame Encuentrame\n\t ".trim());//"Encuentrame Encuentrame"
    }

}
