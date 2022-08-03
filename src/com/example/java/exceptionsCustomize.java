package com.example.java;

public class exceptionsCustomize {
    public static void main(String[] args) {
//Creando excepciones personalizadas
        String welcome = "Welcome!              "; //hacer mayor a 10 para que tome la exception
        char[] chars = welcome.toCharArray();

        try {
            if (chars.length > 10) {
                throw (new Exception("Mi exception personalizada"));
            }
            char lastChar = chars[chars.length];
            System.out.println(lastChar);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
