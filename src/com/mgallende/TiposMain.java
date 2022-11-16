package com.mgallende;

public class TiposMain {

    public static void main(String[] args) {

        /* Ejercicio del Tema 1 Curso Básico de Java de OpenBootcamp
        en el que mostramos los tipos de datos conocidos hasta el momento

        1- Crear un proyecto desde Cero
        2 - Crear un paquete dentro del proyecto
        3 - Crear una clase en el paquete
        4 - Crear el método main e imprimir los tipos de datos primitivos

         */

        System.out.println("Ejercicio del tema 1 del Curso Básico de Java de Open Bootcamp\nen el que mostramos tipos de datos conocidos hasta el momento");

        // Tipos Numéricos Enteros
        byte number1 = 125; // Ocupa un byte de memoria
        System.out.println("byte = " + number1);
        short number2 = 2941; // Ocupa dos bytes de memoria
        System.out.println("short = " + number2);
        int number3 = 174255; // Ocupa cuatro bytes de memoria
        System.out.println("int = " + number3);
        long number4 = 693649319; // Ocupa ocho bytes de memoria
        System.out.println("long = " + number4);

        // Numéricos decimales
        float number5 = 1.5f; // Ocupa cuatro bytes de memoria
        System.out.println("float = " + number5);
        double number6 = 10.10; // Ocupa ocho bytes de memoria
        System.out.println("double = " + number6);

        // Boolean, puede almacenar valores booleanos,: true or false
        boolean variable1 = true;
        boolean variable2 = false;
        System.out.println("La variable1 es " + variable1 + " y la variable2 es "+ variable2);

        // Tipos de texto
        char caracter1 = 'A';
        System.out.println("char = " + caracter1);
        String cadena1 = "Esto es una cadena de texto";
        System.out.println("Cadena = " + cadena1);

    }
}
