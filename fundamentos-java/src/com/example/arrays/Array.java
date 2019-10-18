package com.example.arrays;

import java.util.Arrays;

/**
 * Un arreglo, es una estructura de datos con una capacidad
 * pre-definida en la cual se pueden almacenar objetos de un mismo tipo
 *
 * La capacidad de un arreglo es declarada desde el momento en que este es definido y
 * este no puede ser cambiado en tiempo de ejecución.
 *
 * Cada dato almacenado en el arreglo es un elemento en el mismo, y puede ser
 * accedido a través de un índice de posición
 *
 */
public class Array {

    public static void main(String[] args) {

        // Inicialización de un arreglo de 3 posiciones
        int[] arregloDeEnteros = new int[3];
        // Agregar datos al arreglo
        arregloDeEnteros[0] = 3;
        arregloDeEnteros[1] = 2;
        arregloDeEnteros[2] = 1;
        System.out.println(Arrays.toString(arregloDeEnteros));

        double[] arregloDeDecimales = new double[4];
        // Agregar datos al arreglo
        arregloDeDecimales[0] = 10.0;
        arregloDeDecimales[1] = 20.0;
        arregloDeDecimales[2] = 30.0;
        // Valor por defecto en caso de no asignación, es el valor por defecto para el tipo de dato usado. (0.0 en doubles)
        System.out.println(Arrays.toString(arregloDeDecimales));

        String[] nombres = new String[2];
        nombres[0] = "Santiago";
        nombres[1] = "Lince";
        System.out.println(Arrays.toString(nombres));

        // Un arreglo puede ser inicializado con sus valores.
        String superheroes[] = {"Ironman", "Spiderman", "Hulk"};
        System.out.println(Arrays.toString(superheroes));

        //Para acceder a un elemento basta con tomarlo usando el nombre del arreglo y el indice correspondiente
        String superheroeEnPosicionCero = superheroes[0];
        System.out.println("Superheroe en posición 0: " + superheroeEnPosicionCero);

        // Para conocer el tamaño del arreglo hacemos uso de su variable length
        System.out.println("El tamaño del arreglo de superheroes es: " + superheroes.length);


        int[] a = {1, 2, 3, 4};
    }
}
