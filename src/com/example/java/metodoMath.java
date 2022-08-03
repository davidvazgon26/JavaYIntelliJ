package com.example.java;

public class metodoMath {
    public static void main(String[] args) {
        int intValue1 = 56;
        int intValue2 = 42;

        int result1 = intValue1+intValue2;
        System.out.println("Addition: "+ result1);

        int result2 = intValue1-intValue2;
        System.out.println("Substraction: "+ result2);

        int result3 = intValue1*intValue2;
        System.out.println("Multiplication: "+ result3);

        double result4 = (double) intValue1/intValue2; //Hay que preparar el dato para el tipo que saldra, en este caso double
        System.out.println("Division: "+ result4);

        double result5 = (double) intValue1%intValue2;
        System.out.println("Addition: "+ result5);

        double doubleValue = -3.9999;
        long rounded = Math.round(doubleValue);
        System.out.println("Rounded: "+ rounded);

        double absValue = Math.abs(doubleValue);
        System.out.println("Absolute: "+ absValue);
    }
}

