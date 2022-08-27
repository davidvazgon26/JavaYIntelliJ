package com.ejercicio.espaniol.java.capitulo7.videojuego.claseAbstracta;

public class Triangulo extends Figura2D{

    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double obtenerArea() { //sobreescribe los metoso de la clase abstracta aunque esten vacios
        double semiperimetro = (lado1+lado2+lado3)/2;
        double area = Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
        return area;
    }

    @Override
    public double obtenerPerimetro() { //sobreescribe los metoso de la clase abstracta aunque esten vacios
        return lado1+lado2+lado3;
    }
}
