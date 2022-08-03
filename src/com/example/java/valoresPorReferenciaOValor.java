package com.example.java;

public class valoresPorReferenciaOValor {
    public static void main(String[] args) {
        int intValue = 10; // Valor por copia o por valor
        int [] intValueArray = {50,60,70}; // Valor por referencia

        System.out.println(intValue);
        incrementValue(intValue);
        System.out.println(intValue);

        System.out.println("***********************");

        System.out.println(intValueArray[0]);
        incremetArray(intValueArray);
        System.out.println(intValueArray[0]);

        //Ojo esto pasa en los com.example.java.arreglos pero no en las cadenas al ser inmutables

    }

    static void incrementValue(int intValue){
        intValue++;
        System.out.println("Valor incrementado en el metodo: "+intValue);
    }

    static void incremetArray(int[] intValueArray){
        intValueArray[0]++;
        System.out.println("Valor incrementado dentro del array "+intValueArray[0]);
    }
}
