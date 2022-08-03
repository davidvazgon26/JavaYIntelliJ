package com.example.java;

public class createMethods {

    //Los com.example.java.arreglos aqui se declaran y crean diferente
    static String[] months = {"January", "February", "March", "April", "May","June","July","August",
            "September","October","November","December"};

    public static void main(String[] args) {
        //Calling the method from main
            loopIt("Months of the year");
            loopIt("Second run");
            loopIt("third run");
    }

    static void loopIt(String label){

        System.out.println(label);
        //creando encabezado con asteriscos
        for (int i = 0; i <label.length() ; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        //Mostrando los meses
        for (String month: months ) {
            System.out.println(month);
        }
        System.out.println(" ");
    }
}
