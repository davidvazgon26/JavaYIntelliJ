package com.ejercicio.espaniol.java.capitulo1;

import java.util.Scanner;

public class ingresoPorTeclado {
    public static void main(String[] args) {

        //La clase Scanner nos ayuda a leer cadenas de caracteres
        //System.in son datos de entrada y System.out son datos de salida

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame tu nombre");
        String nombre = sc.nextLine(); //nextLine queda a la espera de que el usuario ingrese los datos y de enter en el teclado
        System.out.println("Hola " + nombre + " bienvenido");
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();
        System.out.println("Tienes "+ edad + " anios");
    }
}
