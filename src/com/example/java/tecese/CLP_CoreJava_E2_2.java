package com.example.java.tecese;

public class CLP_CoreJava_E2_2 {

    public static int levelCount(final String word) {

        /* write your code here and return appropriate value */
        // "{\"0\":{\"name\":\"[John]\"}\",\"1\":{\"name\":\"[micheal]\"}}"
        String cadena = word.replaceAll("[A-Za-z|\\d|\"|\\:]","");
        int veces = cadena.length();
        char [] str = cadena.toCharArray();
        int nivel = 0;
        int nivelMaximo = 0;

        for (int i = 0; i < veces; i++) {
            char c = str[i];
            if(c =='{' || c=='['){
                nivel++;
                if (nivel>nivelMaximo) {
                    nivelMaximo = nivel;
                }
            }
            if (c=='}' || c==']') {
                nivel--;
            }
        }


        return nivelMaximo; //3
    }

    public static void main(final String[] args)
    {
       // System.out.println("Hola");
        System.out.println(levelCount("{\"0\":{\"name\":\"[John]\"}\",\"1\":{\"name\":\"[micheal]\"}}"));
    }
}
