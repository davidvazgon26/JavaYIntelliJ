package com.example.java;

import java.util.Arrays;

public class arreglos {
    public static void main(String[] args) {
        System.out.println("Arreglos con primitivos");
        int[] ints = {9,6,3}; //No puedo cambiar el tamanio pero si los valores y/o posiciones

        System.out.println(ints[0]);
        ints[0]++;
        System.out.println(ints[0]);
        //Tambien puedo ordenarlos
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        System.out.println("Arreglo de strings");
        String[] strings = {"Red", "Blue", "Yellow", "Gray"};
        Arrays.sort(strings);
        for (String color: strings) {
            System.out.println(color);
        }

        System.out.println("Declarar arreglo y asignar despues");
        int[] sized = new int[10];
        for (int i = 0; i < sized.length ; i++) {
            sized[i] = i*22;
        }
        for (int value:sized) {
            System.out.println(value);
        }

        System.out.println("Copiar arreglo compleo o seccion");
        int[] copiedArray = new int[5];
        System.arraycopy(sized,4,copiedArray,0,5); // parametros: 1-Arreglo de donde se copia,
        // 2-posicion desde donde comienza la copia, 3-arreglo a donde se copia, 4-posicion destino, 5-tamanio
        for (int value:copiedArray) {
            System.out.println(value);
        }

    }
}
