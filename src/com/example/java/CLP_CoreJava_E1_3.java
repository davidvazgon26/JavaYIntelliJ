package com.example.java;

public class CLP_CoreJava_E1_3 {

    public static void main(String[] args) {
        System.out.println(operationCount("AbcDef", 1, 2));
    }

    private static int operationCount(String word, int input1, int input2) {

        String palabra = word;
        int result = 0;
        int ciclos = input1 + input2;
        boolean bandera = true;
            System.out.println(palabra);

        for (int i = 0; i < ciclos; i++) {
            String inicio = palabra.substring(palabra.length()-1);
            String fin = palabra.substring(0,palabra.length()-1);
//            System.out.println(inicio);
//            System.out.println(fin);
            palabra = inicio+fin;
        }
            System.out.println(palabra);
        System.out.println("Termina el for");

        while(bandera){
            result++;

                String inicio = palabra.substring(palabra.length()-1);
                String fin = palabra.substring(0,palabra.length()-1);
                palabra = inicio+fin;
                System.out.println(palabra);


            if(word.equals(palabra)){
                bandera = false;
            }else{
                System.out.println("No quedo");
            }
        }

//        System.out.println(word.equals(palabra));

        return result;
    }


}
