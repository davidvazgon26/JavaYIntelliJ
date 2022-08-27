package com.ejercicio.espaniol.java.capitulo7.videojuego;

public class Protagonista extends Personaje{

    private String nombre;

    private static final int UNIDADES_DE_SALTO = 10;

    public Protagonista(int posicionX, int posicionY, String nombre) {
        super(posicionX, posicionY); //el super se utiliza para heredar el constructor de la clase padre, que en este caso es posicion X y Y, luego vendrian los atributos propios de la clase hija
        this.nombre = nombre;
    }

    public void recibirCura(int puntos){
        puntosDeVida += puntos;
    }

    public void saltar(){
        posicionY += UNIDADES_DE_SALTO;
    }

    //sobreescribir sonido de dolor
    @Override
    public void emitirSonidoDeDolor(){
        System.out.println("Au!!!!!");
    }
}
