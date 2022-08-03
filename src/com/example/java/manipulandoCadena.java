package com.example.java;

public class manipulandoCadena {
    public static void main(String[] args) {
        String s1 = "Welcome to Torreon";
        System.out.println("Length of string: "+ s1.length());

        int position = s1.indexOf("Torreon");
        System.out.println("the position of Torreon is: "+ position);

        String sub = s1.substring(position);
        System.out.println(sub);

        String s2 = "Prueba de cadena            ";
        System.out.println("Length of string: "+ s2.length());
        //Quitando espacios en blanco
        String s3 = s2.trim();
        System.out.println("New length of string: "+ s3.length());
    }
}
