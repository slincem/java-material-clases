package com.example.classes;

/**
 * En Java, un objeto es creado a partir de una clase.
 *
 * Para crear un Objecto, especificamos el nombre de la clase, seguido del nombre del objeto,
 * y usamos la palabra reservada "new"
 *
 */
public class ObjectCreater {

    public static void main(String[] args) {
        createAnObjectOfClassCreater();
        System.out.println("------- SEPARATOR ------");
        createAnObjectOfConstructorSample();
        System.out.println("------- SEPARATOR ------");
        StaticContext.printWithoutInstance();
    }

    public static void createAnObjectOfClassCreater() {
        ClassCreater objectName = new ClassCreater();

        System.out.print("Este es el valor de x: ");
        objectName.showValue();

        objectName.x = 500;
        System.out.print("Este es el valor de x modificado: ");
        objectName.showValue();

        // No es posible modificar "y" debido a que es "final"
        //objectName.y = 6;

        System.out.println();
        objectName.print("Hola");
    }

    public static void createAnObjectOfConstructorSample() {
        ConstructorSample constructorSampleDefault = new ConstructorSample();
        System.out.println("ConstructorSample por defecto no hizo nada");
        System.out.println("--- ---- ---");
        ConstructorSample constructorSample = new ConstructorSample("ClassName");
    }
}
