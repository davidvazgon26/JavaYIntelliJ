package com.ejercicio.espaniol.java.capitulo7.videojuego.interfaces;

public interface Reproductor {
//En una interfaz los metodos se decalaran pero no se implementan.
    public void reproducir();

    public void pausar();

    public void parar();

    public void rebobinar(int segundos);

    public void adelantar(int segundos);

}
