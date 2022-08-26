package com.ejercicio.espaniol.java.capitulo4;

public class Sobrecarga {

     public static  final String COLOR_POR_DEFECTO = "\u001B[0m";
     public static  final String COLOR_NEGRO = "\u001B[30m";
     public static  final String COLOR_ROJO = "\u001B[31m";
     public static  final String COLOR_VERDE = "\u001B[32m";
     public static  final String COLOR_AMARILLO = "\u001B[33m";
     public static  final String COLOR_AZUL = "\u001B[34m";

    void mostrarPorPantalla(int entero){
        System.out.println("Mostrando el entero "+ entero);
    }

    void mostrarPorPantalla(double decimal){
        System.out.println("Mostrando el decimal "+ decimal);
    }

    void mostrarPorPantalla(String cadena){
        System.out.println("Mostrando la cadena "+ cadena);
    }

    void mostrarPorPantalla(String cadena, String color){
        System.out.println(color + "Mostrando la palabra con color "+ cadena + COLOR_POR_DEFECTO); // se coloca COLOR_POR_DEFECTO para que regrese al color original, sino las siguientes lineas continuaran en el color seleccionado
    }

    public static void main(String[] args) {
        Sobrecarga sc = new Sobrecarga();
        sc.mostrarPorPantalla(77);
        sc.mostrarPorPantalla(1.45454);
        sc.mostrarPorPantalla("Una cadena");
        sc.mostrarPorPantalla(2+'a');
        sc.mostrarPorPantalla("Este es mi Hola", Sobrecarga.COLOR_AZUL);
        System.out.println("Otra linea");
    }
}
