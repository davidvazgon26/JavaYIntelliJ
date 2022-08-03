package com.example.java.model;

public class Olive {
    //Definiendo constantes

    public static final String KALAMATA = "Kalamata"; // Se quita la constante para proposito del ejercicio de enum

    //Definiendo variables
    private String name = KALAMATA; //al cambiar los valores de public a private ahora solo puedo modificar o acceder al valor
    // a traves de los get y set
    private long color = 0x2E0854;
    private int oil = 3  ;

    //los Get devuelven el valor y los set reciben argumentos. this se refiere a las variables de la instancia actual


    //Creando constructor sin argumentos
    public Olive(){}

    //Constructor para nuestras 3 variables
    //Pueden existir tantos constructores como necesitemos siempre y cuando no sea iguales
    public Olive(String name, long color, int oil ){
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public String getName() { return name;  }

    public void setName(String name) { this.name = name; }

    public long getColor() { return color; }

    public void setColor(long color) { this.color = color; }

    public int crush() {
        System.out.println("Ouch!!!");
        return oil;
    }

    public void setOil(int oil) { this.oil = oil; }
}
