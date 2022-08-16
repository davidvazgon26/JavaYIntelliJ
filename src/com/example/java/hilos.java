package com.example.java;

public class hilos {
    public static void main(String[] args) {
        System.out.println("Hilos corriendo al inicio: "+Thread.activeCount());

        ThreadExample thread1 = new ThreadExample();
        thread1.setName("Hilo No 1");
        thread1.start();

        ThreadExample thread2 = new ThreadExample();
        thread2.setName("Hilo No 2");
        thread2.start();

        System.out.println("Hilos corriendo al final: "+Thread.activeCount());
    }
}

class ThreadExample extends Thread{ // Thread es una clase ya existente en java.lang

    public void run(){
        int i = 1;
        while(i<=100){
            System.out.println(i+" "+ this.getName());
            i++;
        }
    }
}
