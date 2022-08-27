package com.ejercicio.espaniol.java.capitulo7.videojuego;

public class Personaje {

    protected  int puntosDeVida = 100;
    protected int posicionX = 0;
    protected int posicionY = 0;

    public Personaje(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public void recibirDano(int puntos){
        puntosDeVida-= puntos;
    }
    public void moverALaDerecha(int unidades){
        posicionX += unidades;
    }

    public void moverALaIzquierda (int unidades){
        posicionY -= unidades;
    }

    public void emitirSonidoDeDolor(){
        System.out.println("Ay!!!!!");
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "puntosDeVida=" + puntosDeVida +
                ", posicionX=" + posicionX +
                ", posicionY=" + posicionY +
                '}';
    }
}
