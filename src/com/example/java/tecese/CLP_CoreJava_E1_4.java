package com.example.java.tecese;

public class CLP_CoreJava_E1_4 {

    public static void main(String[] args) {
        System.out.println(operationCount("abcabc", 1, 1));
    }

    private static int operationCount(String word, int input1, int input2) {
        String s1 = word; //abcabc, 1, 1
        int count = 0;
        int width = word.length(); //6


       // do {
            StringBuilder str = new StringBuilder();
       // listo string vacio
        System.out.println(width);
        System.out.println(s1.substring(width - input1));
            str.append(s1.substring(width - input1));
            str.append(s1.substring(0, width - input1));
            s1 = str.toString();

            StringBuilder str2 = new StringBuilder();

            str2.append(s1.substring(width - input2));
            str2.append(s1.substring(0, width - input2));
            s1 = str2.toString();

            count++;
       // } while (!word.equals(s1));

       // System.out.println(count.getClass().getSimpleName() );

        return count;
    }
}

/*
*
*
*  StringBuilder str = new StringBuilder();
            if (i % 2 == 0) {
                str.append(s1.substring(len - input1));
                str.append(s1.substring(0, len - input1));
            } else {
                str.append(s1.substring(len - input2));
                str.append(s1.substring(0, len - input2));
            }
           // System.out.println(str);
            s1 = str.toString();
          //  System.out.println(s1);
            i++;
            count++;
*
* */