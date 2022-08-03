package com.example.java;

import java.util.Scanner;

public class scannerSwitchMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa el numero del mes buscado:");
        int numValue = Integer.parseInt(scan.nextLine());

        switch (numValue){
            case 1:
                System.out.println("Es Enero");
                break;
            case 2:
                System.out.println("Es Febrero");
                break;
            case 3:
                System.out.println("Es Marzo");
                break;
            case 4:
                System.out.println("Es Abril");
                break;
            case 5:
                System.out.println("Es Mayo");
                break;
            case 6:
                System.out.println("Es Junio");
                break;
            default:
                System.out.println("Es mediado de anio");
        }
    }
}
