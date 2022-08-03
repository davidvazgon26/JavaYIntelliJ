package com.example.java;

import java.util.Scanner;

public class sobreEscribirMetodo {
    public static void main(String[] args) {

        //asignando datos que vienen de consola
        String s1 = getInput("Enter value 1: "); //el metodo getInput tiene el scanner que retornara el valor ingresado
        String s2 = getInput("Enter value 2: ");
        String s3 = getInput("Enter value 3: ");

        double result = addValues(s1,s2);
        System.out.println("The answer is: " + result);

        double result2 = addValues(s1,s2,s3);
        System.out.println("The answer for 3 values is: " + result2);

        double result3 = addValues(s1,s2,s3,"5",s2,s3); // "5" solo para confirmar los argumentos
        System.out.println("The answer for 3 values is: " + result3);

    }

    //Enviando a las variables los datos de consola
    static String getInput(String message){
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();  // los envio como strin y los transformo a integer en donde los manipulo "addValues"
    }

    // Trabajando con los datos
    static double addValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 + d2;
        return result;
    }

    //Sobre escribiendo addValues
    static double addValues(String s1, String s2, String s3){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double d3 = Double.parseDouble(s3);
        double result = d1 + d2 + d3;
        return result;
    }

    //sobre escribir para n valores enviados

    static double addValues (String...values){
        double result = 0;
        for (String value:values) {
            double d = Double.parseDouble(value);
            result+= d;
        };
        return result;
    }

}
