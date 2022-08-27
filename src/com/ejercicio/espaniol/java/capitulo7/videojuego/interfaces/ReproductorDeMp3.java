package com.ejercicio.espaniol.java.capitulo7.videojuego.interfaces;

public class ReproductorDeMp3 implements Reproductor{
    @Override
    public void reproducir() {
        System.out.println("Reproducir Audio");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar Audio");
    }

    @Override
    public void parar() {
        System.out.println("Parar Audio");
    }

    @Override
    public void rebobinar(int segundos) {
        System.out.println("Rebobinar Audio "  + segundos + " segundos");
    }

    @Override
    public void adelantar(int segundos) {
        System.out.println("adelantar Audio"  + segundos + " segundos");
    }

}
