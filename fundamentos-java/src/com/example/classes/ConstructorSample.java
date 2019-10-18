package com.example.classes;

/**
 * Un Constructor es una función, método, etc,  de las clases,
 * el cual es llamado automáticamente cuando se crea un objeto de esa clase.
 *
 * Debido a ser métodos, los constructores también aceptan parámetros.
 * Cuando en una clase no especificamos ningún tipo de constructor,
 * el compilador añade uno público por omisión sin parámetros.
 */
public class ConstructorSample {

    /**
     * Constructor por defecto de la clase
     */
    public ConstructorSample() {
    }

    /**
     * Constructor Sobrecargado
     * @param nombreClase, nombre de la clase para ser impreso
     */
    public ConstructorSample(String nombreClase) {
        System.out.println("Constructor de la clase: " + nombreClase + " Fue llamado");
    }
}
