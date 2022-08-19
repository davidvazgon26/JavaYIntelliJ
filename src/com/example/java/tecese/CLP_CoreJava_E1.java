package com.example.java.tecese;

import java.util.ArrayList;
import java.util.List;

public class CLP_CoreJava_E1 {

    public static void main(String[] args) {
        System.out.println(operationCount("AbcDef", 2, 3));
    }

    private static int operationCount(String word, int input1, int input2) {

        /*write your code here and return appropriate value*/
        //numero de ciclos para llegar a la posicion inicial
        int result = 1;
        //convertir el string en arreglo
        char[] arreglo = word.toCharArray();
        // Pasar una lista para poder extraer y agregar datos
        List<Character> list = new ArrayList<>();
        //ingresar los datos a la lista por un ciclo
        for (Character c : arreglo) {
            list.add(c);
        }

        do {
            //extrae los datos de la lista y agregarlos al inicio las veces que indique la suma de los input
            int veces = input1 + input2;
            result++;
            for (int i = 0; i < veces; i++) {
                char l = list.remove(list.size() - 1);
                list.add(0, l);
            }

        }while(word.equals(list.toString().replaceAll("\\[|\\]", "").replaceAll(", ","")));



       // System.out.println(word);
        //System.out.println(list.toString().replaceAll("\\[|\\]", "").replaceAll(", ",""));


       // System.out.println(word.equals(list.toString().replaceAll("\\[|\\]", "").replaceAll(", ","")));

        return result;
    }



}
