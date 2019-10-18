package com.example.classes;

/**
 * Java es un lenguaje de programacion orientado a objetos.
 *
 * Cada cosa en Java está asociada con clases y objetos, junto con sus atributos y metodos.
 *
 * Por ejemplo: en la vida real, un animal es un objeto.
 *
 * El animal tiene atributos, como color o peso, y métodos, como saltar o correr.
 *
 */
public class ClassCreater {

    // Atributo de la clase
    int x = 5;

    // Atributo no modificable
    final int y = 2;

    // Metodo de la clase
    public void showValue() {
        System.out.println(x);
    }

    // Metodo de la clase
    public void print(String stringToPrint) {
        System.out.println(stringToPrint);
    }
}
