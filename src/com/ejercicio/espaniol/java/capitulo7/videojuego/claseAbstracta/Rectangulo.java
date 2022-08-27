package com.ejercicio.espaniol.java.capitulo7.videojuego.claseAbstracta;

public class Rectangulo extends  Figura2D{

    private double lado2;
    private double lado1;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }


    @Override //sobreescribe los metoso de la clase abstracta aunque esten vacios
    public double obtenerArea() {
        return lado1*lado2;
    }

    @Override //sobreescribe los metoso de la clase abstracta aunque esten vacios
    public double obtenerPerimetro() {
        return 2*lado1 + 2*lado2;
    }
}
