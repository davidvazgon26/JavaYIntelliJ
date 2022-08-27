package com.ejercicio.espaniol.java.capitulo7.videojuego;

public class Orco extends Enemigo{


    public Orco(int posicionX, int posicionY) {
        super(posicionX, posicionY);
    }

    @Override
    public void emitirSonidoDeDolor(){
        System.out.println("Noooo!!!!");
    }
}
