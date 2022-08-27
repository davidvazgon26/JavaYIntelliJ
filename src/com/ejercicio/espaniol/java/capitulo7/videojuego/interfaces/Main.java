package com.ejercicio.espaniol.java.capitulo7.videojuego.interfaces;

public class Main {
    public static void main(String[] args) {
        ReproductorDeVideo reproductorDeVideo = new ReproductorDeVideo();
        reproductorDeVideo.reproducir();
        reproductorDeVideo.rebobinar(5);
        reproductorDeVideo.parar();

        ReproductorDeMp3 reproductorDeMp3 = new ReproductorDeMp3();
        reproductorDeMp3.reproducir();
        reproductorDeMp3.rebobinar(5);
        reproductorDeMp3.parar();
    }
}
