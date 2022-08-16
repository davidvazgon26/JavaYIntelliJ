package com.example.java;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class otroHashMapOrdenado {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>(9, 0.75f, true);
        phonebook.put("David", 12345);
        phonebook.put("Jill", 678910);
        phonebook.put("Brend", 123123);
        phonebook.put("Viky", 777777);
        phonebook.put("Alejandro", 111111);
        System.out.println(phonebook);

        System.out.println("\n Lista de contactos: \n");
        for (Map.Entry<String, Integer> entry: phonebook.entrySet()) {
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }
    }
}
