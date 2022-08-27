package com.ejercicio.espaniol.java.capitulo7.videojuego;

public class Dragon extends  Enemigo{

    private static final int PUNTOD_DE_DANO = 80;

    public Dragon(int posicionX, int posicionY) {
        super(posicionX, posicionY);
    }

    @Override  // sobreescribo el metodo pero tambien necesito la constante que se usa en este metodo
    public int obtenerPuntosDeDano(){
        return PUNTOD_DE_DANO;
    }
}
