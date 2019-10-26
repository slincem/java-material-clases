package com.example.classes.keywords;

/**
 * La palabra reservada “null” indica que dicha variable no referencia a ningun objeto.
 * Esto puede deberse a que no se haya inicializado asignándole un objeto mediante la instrucción "new",
 * o a que hayamos borrado la referencia que contenía la variable.
 */
public class NullKeyWord {

    public static void main(String[] args) {
        String s = retornarValor(); // El valor de s sera "null"

        System.out.println("El valor de la variable es: " + s);

        //Podemos contrastar el valor de nulicidad
        if(s != null) {
            //Esto no se imprimirá
            System.out.println("Esta linea no es alcanzable");
        }
    }

    public static String retornarValor() {
        return null;
    }
}
