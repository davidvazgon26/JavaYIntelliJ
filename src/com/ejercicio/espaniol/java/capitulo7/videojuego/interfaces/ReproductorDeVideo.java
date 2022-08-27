package com.ejercicio.espaniol.java.capitulo7.videojuego.interfaces;

public class ReproductorDeVideo implements Reproductor {
    @Override
    public void reproducir() {
        System.out.println("Reproducir Video");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar Video");
    }

    @Override
    public void parar() {
        System.out.println("Parar Video");
    }

    @Override
    public void rebobinar(int segundos) {
        System.out.println("Rebobinar Video");
    }

    @Override
    public void adelantar(int segundos) {
        System.out.println("adelantar Video");
    }
}
