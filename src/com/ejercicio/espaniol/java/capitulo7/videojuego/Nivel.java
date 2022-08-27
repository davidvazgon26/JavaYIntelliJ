package com.ejercicio.espaniol.java.capitulo7.videojuego;

public class Nivel {
    public static void main(String[] args) {
        Personaje enemigo = new Personaje(10,0);
        Protagonista protagonista = new Protagonista(0,0, "David");

        enemigo.emitirSonidoDeDolor();
        protagonista.emitirSonidoDeDolor();

        System.out.println(enemigo.toString());
        System.out.println(protagonista.toString());
    }
}
