package com.example.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class MetodoGenericoParaListas {

    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

        public static <T> List<T> arrayToList(T[] array, List<T> list){
            for (T object: array) {
                list.add(object);
            }
            return list;
        }

    public static void main(String[] args) {
        //Invoco a arrayList y le paso el tipo del que quiero la lista.
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
    }
}

