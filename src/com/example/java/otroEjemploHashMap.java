package com.example.java;

import java.util.HashMap;

//Es util porque no permite clave valor duplicado, lo sustituye, pero no resperta el orden, este es variable

public class otroEjemploHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> phonebook  = new HashMap<>();
        phonebook.put("David", 123456);
        phonebook.put("David", 456456);// Ejemplo de que no permite valores repetidos.
        phonebook.put("Alejandro", 789111);
        phonebook.put("Carlos", 123123);
        phonebook.put("Vita Uva", 777777);
        phonebook.put(null, 00000);
        if(phonebook.containsKey("Carlos")){
            System.out.println("Eliminare a Carlos");
            phonebook.remove("Carlos");
        }
        if(phonebook.containsValue(777777)){
            System.out.println("Tenemos a 777777");
        }
        System.out.println(phonebook);
        System.out.println("Limpiando el hashmap");
        phonebook.clear();
        System.out.println(phonebook);
    }
}
