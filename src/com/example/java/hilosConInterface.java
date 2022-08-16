package com.example.java;

public class hilosConInterface {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableExample());
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            int i = 0;
            while (i <= 100) {
                System.out.println(i + " " + Thread.currentThread().getName());
                i++;
            }
        }
    });
        thread2.start();

    }
}

class RunnableExample implements Runnable { // Runnable es una clase ya existente en java.lang y implement se usa para indicar que es una interface

    public void run() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i + " " + Thread.currentThread().getName());
            i++;
        }
    }
}

