package com.ejercicio.espaniol.java.capitulo7.videojuego.interfaces;

//Las interfaces permiten a las classes implementar una o varias interfaces a diferencia de
// las clases abstractas que solo permiten una a la vez.
//Ojo al implementar una interfaz, estas obligado a implementar en tu clase todos los metodos heredados...
//A partir de Java8 esta permitido que las interfaces aniadan por defecto un implementen a sus propios metodos y
//anadir metodos estaticos. Apartir de Java 9 se pueden anadir metodos privados a las interfaces.
//Sirve para relacionar clases con comportamientos similares...

public class Smartphone implements Telefono, Reproductor{
    @Override
    public void reproducir() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void parar() {

    }

    @Override
    public void rebobinar(int segundos) {

    }

    @Override
    public void adelantar(int segundos) {

    }

    @Override
    public void llamar(int numeroDeTelefono) {

    }

    @Override
    public void silenciarMicrofono() {

    }

    @Override
    public void colgar() {

    }
}
