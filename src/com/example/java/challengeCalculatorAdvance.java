package com.example.java;

import java.util.Scanner;

public class challengeCalculatorAdvance {
    public static void main(String[] args) {
        String s1 = getInput("Enter a numeric value:");
        String s2 = getInput("Enter a numeric value:");
        String op = getInput("Choose an operation (+ - * / %):");

//        System.out.println(op);

        double result = 0;
        double[] arr;

        try {
            switch (op){
                case "+":
                    arr = Values(s1,s2);
                    result = arr[0]+arr[1];
                    break;
                case "-":
                    arr = Values(s1,s2);
                    result = arr[0]-arr[1];
                    break;
                case "*":
                   // result = multiplyValues(s1,s2);
                    arr = Values(s1,s2);
                    result = arr[0]*arr[1];
                    break;
                case "/":
//                    result = divideValues(s1,s2);
                    arr = Values(s1,s2);
                    result = arr[0]/arr[1];
                    break;
                case "%":
//                    result = modValues(s1,s2);
                    arr = Values(s1,s2);
                    result = arr[0]%arr[1];
                    break;
                default:
                    System.out.println("Unrecognized operation");
                    System.out.println("Exit");
                    return;
            }

            System.out.println("The result is: "+ result);
        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }

    private static double[] Values(String ss1, String ss2){
        double d1 = Double.parseDouble(ss1);
        double d2 = Double.parseDouble(ss2);
        double[] arr = {d1,d2};
        return arr;
    }
   /* private static double substracValues(String ss1, String ss2){
        double d1 = Double.parseDouble(ss1);
        double d2 = Double.parseDouble(ss2);
        return d1-d2;
    }
    private static double multiplyValues(String ss1, String ss2){
        double d1 = Double.parseDouble(ss1);
        double d2 = Double.parseDouble(ss2);
        return d1*d2;
    }
    private static double divideValues(String ss1, String ss2){
        double d1 = Double.parseDouble(ss1);
        double d2 = Double.parseDouble(ss2);
        return d1/d2;
    }
    private static double modValues(String ss1, String ss2){
        double d1 = Double.parseDouble(ss1);
        double d2 = Double.parseDouble(ss2);
        return d1%d2;
    }*/
    private static String getInput(String prompt){
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
