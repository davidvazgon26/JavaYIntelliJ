package com.example.java;

import java.util.Scanner;

public class callengeCalculadora {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a numeric value: ");
        int intValue = Integer.parseInt(s.nextLine());

        System.out.println("Enter a numeric value: ");
        float fValue = Float.parseFloat(s.nextLine());

        System.out.println("The answer is: " + (intValue+fValue));

    }
}
