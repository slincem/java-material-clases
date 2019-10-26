package com.example.classes.enums;

public class Application {

    public static void main(String[] args) {
        usarSimpleEnumeration();
        System.out.println("------");
        usarEnumeration();
        System.out.println("------");
        recorrerEnum();
    }

    public static void usarSimpleEnumeration() {
        SimpleEnumeration simpleEnumeration = SimpleEnumeration.LOW;

        if(simpleEnumeration.equals(SimpleEnumeration.LOW)) {
            System.out.println("Esta es la manera de comparar entre enums");
        }

        String simpleEnumStringValue = SimpleEnumeration.LOW.name();

        if (simpleEnumStringValue.equals(SimpleEnumeration.LOW.name())) {
            System.out.println("Esta es la manera de comparar entre el valor String de los enums");
        }
    }

    public static void usarEnumeration() {
        Integer lowStartRange = Enumeration.LOW_RANGE.getStarRange();

        System.out.println("Esta es la forma de tomar valores existentes en variables para una constante en el enum: " + lowStartRange);
    }

    public static void recorrerEnum () {
        for (Enumeration enumeration: Enumeration.values()) {

            System.out.println(enumeration);
        }
    }
}
