package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class CLP_CoreJava_E1_2 {

    public static void main(String[] args) {
        System.out.println(operationCount("abcabc", 1, 1));
    }

    private static int operationCount(String word, int input1, int input2) {

        int palabra = word.length();
        int veces = input1 + input2;
        int result = 1;

        while (palabra != veces) {
            if (palabra > veces) {
                veces = veces + input2 + input1;
                result++;
            } else {
                palabra = palabra + word.length();
            }
        }

      //  System.out.println("fin");
        return result;
    }


}
