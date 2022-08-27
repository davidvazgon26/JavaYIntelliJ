package com.ejercicio.espaniol.java.capitulo7.videojuego.claseAbstracta;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(4.5,6.8);
        Triangulo triangulo = new Triangulo(3,3,3);

        System.out.println("El area de mi rectangulo es: "+ rectangulo.obtenerArea());
        System.out.println("El perimetro de mi rectangulo es: "+ rectangulo.obtenerPerimetro());

        System.out.println("El area de mi triangulo es: "+ triangulo.obtenerArea());
        System.out.println("El perimetro de mi rectangulo es: "+ triangulo.obtenerPerimetro());
    }
}
