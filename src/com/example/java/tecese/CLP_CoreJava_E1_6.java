package com.example.java.tecese;

public class CLP_CoreJava_E1_6 {
    static String originalString = "abcabc";

    private static int operationCount(String word, int input1, int input2) { // AbcDef, 1, 2

        /*write your code here and return appropriate value*/
        String palabra = word;
        int count = 1;
        int veces = input1 + input2;

        for (int i = 0; i < veces; i++) {
            String temp = palabra.substring(palabra.length() - 1);
            String temp2 = palabra.substring(0, palabra.length() - 1);
            palabra = temp + temp2;
        }

            System.out.println(palabra);

        while(!palabra.equals(word)){
            count++;
            String temp = palabra.substring(palabra.length() - 1);
            String temp2 = palabra.substring(0, palabra.length() - 1);
            palabra = temp + temp2;
        }

            System.out.println(palabra);

        return count; // 4

    }

    // arguments are passed using the text field below this editor
    public static void main(String[] args) {
        // originalString=args[0];
        // System.out.println(operationCount(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2])));
        System.out.println(operationCount("abcabc", 1, 1));
    }
}
