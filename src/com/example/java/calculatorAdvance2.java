package com.example.java;

//Ejemplo de encapsulamiento (separar el codigo en modulos) con esta clase y la clase calculatorMAthHelper en la carpeta utilities

import com.example.java.utilities.*;

import java.util.Scanner;


public class calculatorAdvance2 {
    public static void main(String[] args) {
        calculatorAdvance2 calc = new calculatorAdvance2();
        calc.calculate();
    }


    protected void calculate() {  // se le quita el static para poderlo instanciar

        //Ahora necesitamos una instancia de la clase InputHelper para usar getInput
        InputHelper helper = new InputHelper();
        String s1 = helper.getInput("Enter a numeric value:");
        String s2 = helper.getInput("Enter a numeric value:");
        String op = helper.getInput("Choose an operation (+ - * / %):");


        double result = 0;

        try {
            switch (op){
                case "+":
                    result = calculatorMathHelper.addValues(s1,s2);
                    break;
                case "-":
                    result = calculatorMathHelper.substracValues(s1,s2);
                    break;
                case "*":
                     result = calculatorMathHelper.multiplyValues(s1,s2);
                    break;
                case "/":
                    result = calculatorMathHelper.divideValues(s1,s2);
                    break;
                case "%":
                    result = calculatorMathHelper.modValues(s1,s2);
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

   //Clase anidada
    class InputHelper{  // recuerda que las clases usan UpperCase, getInput es ahora un metodo de instancia de la clase InputHelper
       private  String getInput(String prompt){
           System.out.println(prompt);
           Scanner sc = new Scanner(System.in);
           return sc.nextLine();
       }
   }
}

