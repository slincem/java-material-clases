package com.example.conventions;

import javax.swing.*;

/**
 * Identación: Para cada nuevo bloque de código se usa una tabulación para darle
 * indentación al código.
 */
public class Indentation {

    public static void main(String[] args) {
        System.out.println("Aqui ves de que se trata la indentación");
        JOptionPane.showMessageDialog(null, "Hola hola");

        String mensaje;

        if(args.length == 0) {
            mensaje = "No hay argumentos";
        } else {
            mensaje = "Si hay argumentos";
        }

        System.out.println(mensaje);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
