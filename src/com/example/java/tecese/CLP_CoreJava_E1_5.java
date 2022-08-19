package com.example.java.tecese;

public class CLP_CoreJava_E1_5 {
    static String originalString = "abcabc";

    public static void main(String[] args) {
        System.out.println(operationCount("abcabc", 1, 1));
    }


    static void reverse(char a[], int low, int high) {
        while (low < high) {
            char temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
    }

    static void rotate(char a[], int n, int d) {
        reverse(a, 0, d - 1);
        reverse(a, d, n - 1);
        reverse(a, 0, n - 1);
    }

    private static int operationCount(String word, int input1, int input2) {
        char[] ch = word.toCharArray();
        int p = input1;
        int q = input2;
        String str = word;
        char[] tmp = word.toCharArray();
        String temp = "";
        int turn = 0;
        while (!temp.equals(str)) {
            //tmp=str;
            rotate(ch, ch.length, p);
            rotate(ch, ch.length, q);
            turn++;
            temp = String.valueOf(ch);
            //System.out.println(" temp :"+temp);
        }
        return turn;
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


    // arguments are passed using the text field below this editor
//    public static void main(String[] args) {
//        originalString = args[0];
//        System.out.println(operationCount(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2])));