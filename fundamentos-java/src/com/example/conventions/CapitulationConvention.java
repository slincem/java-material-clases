package com.example.conventions;

/**
 * Hay distintos tipos de capitulización en Java: CamelCase y Mayuscula sostenida.
 *
 * CamelCase: convención de escribir nombres compuestos como uno solo
 *            y diferenciando las palabras iniciando en mayúsculas.
 *            Existen dos tipos de CamelCase:
 *
 *            CamelCase: La primera palabra empieza en mayuscula y aplica a las clases.
 *            camelCase: la primera palabra empieza en miscula y aplica a variables y métodos
 *
 * Mayúscula Sostenida: Varias palabras se agrupan en una sola escribiendose en mayúscula sostenida y separadas
 * por el caracter _
 *
 *  Para las clases:     CamelCase.
 *  Para las variables:  camelCase.
 *  Para las constantes: Mayúscula sostenida.
 *
 *  Otras reglas: No usar carácteres especiales ales como: ñ, tildes y acentuación en general.
 */
//El nombre de la clase debe comenzar por letra mayuscula y estar en singular. Se usan sustantivos para sus nombres.
public class CapitulationConvention {

    /**
     * El nombre del método, además de lo ya planteado debe comenzar por un verbo.
     *
     */
    public static void validateConvention() {

        // Este es un buen nombre para una variable.
        int cantidadDeAlumnos;

        // Este es un mal nombre para una variable y es una mala práctica.
        int c;

        // Esta es una constante, aquí se hace uso de la capitulización Mayúscula Sostenida.
        final int LADOS_TRIANGULO = 3;

    }
}
