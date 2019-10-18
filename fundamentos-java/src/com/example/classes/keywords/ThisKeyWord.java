package com.example.classes.keywords;

/**
 * La palabra reservada "this" se utiliza para llamar atributos y/o métodos dentro de la misma clase.
 * Se utiliza generalemnte cuando existe ambiguedad entre atributos y/o métodos, es decir,
 * cuando poseen el mismo nombre.
 */
public class ThisKeyWord {

    private String className;

    public ThisKeyWord(String className) {
        //className = className; esta asignación es redundante, debido a que usa el atributo que ingresa por parametro.

        // De esta manera se soluciona el problema.
        this.className = className;
    }
}
