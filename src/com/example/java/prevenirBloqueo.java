package com.example.java;

//Como revenir bloqueos de nuestra aplicacion

public class prevenirBloqueo {
    public static  Object spoon = new Object();
    public static  Object bowl = new Object();

    public static void main(String[] args) {
        Thread cook1 = new Thread(()->{
            synchronized (spoon){ //Bloquea el objeto par que nadie lo utilice hasta que termine su proceso
                System.out.println("Cook1: Holding the spoon...");
                System.out.println("Cook1: Waiting for the bowl...");

                synchronized (bowl){
                    System.out.println("Cook1: Holding the spoon and the bowl.");
                }
            }
        });

        //Para hacer que falle cambiar spoon por bowl y bowl por Spoon esto hara que entren en ciclo infinito
        // y no termine el programa, ejemplo de porque no se recomienda utilizar sincronizmo anidado...

        Thread cook2 = new Thread(()->{
            synchronized (spoon){
                System.out.println("Cook2: Holding the bowl...");
                System.out.println("Cook2: Waiting for the spoon...");

                synchronized (bowl){
                    System.out.println("Cook1: Holding the spoon and the bowl.");
                }
            }
        });

        cook1.start();
        cook2.start();
    }
}
