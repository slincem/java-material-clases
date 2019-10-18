package com.example.classes;

/**
 * Cuando un miembro es declarado estatico, este purde ser accedido antes de que objetos sobre su clase
 * hayan sido creados, y sin la referencia a ningun objeto.
 *
 * estos miembros son declarados con la palabra reservada "static" y es aplicable para:
 *
 * blocks
 * variables
 * methods
 * nested classes
 *
 */
public class StaticContext {

    public static void printWithoutInstance() {
        System.out.println("Impresión sin instancia previa");
    }
}
