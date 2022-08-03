package com.example.java;

import java.util.*;

public class recorrerListasYMapas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Uno");
        list.add("Dos");
        list.add("Tres");

        System.out.println("Recorriendo los datos de la lista");
        System.out.println(list); //Muestra la lista completa
        System.out.println("");

        System.out.println("ArrayList iterator");
        Iterator<String>iterator = list.iterator();
        while(iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);
        }
        System.out.println(" ******************  ");

        System.out.println("ArrayList forEach");
        for (String value: list) {
            System.out.println(value);
        }

        System.out.println(" ******************  ");

        System.out.println("Java 8 method reference");
        list.forEach(System.out::println);
        System.out.println("");

        System.out.println(" ******************  ");

        System.out.println("Unordered data");
        Map<String, String> map = new HashMap<>();
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);
        System.out.println(" ");

        System.out.println("HashMap Iterator");
        Set<String> keys = map.keySet();
        Iterator<String> iterator1 = keys.iterator();
        while (iterator1.hasNext()){
            String key = iterator1.next();
            System.out.println("The capitol of "+ key+ " is "+ map.get(key));
        }
        System.out.println("");

        System.out.println("HashMap ForEach");
        for (String key: keys) {
            System.out.println("The capitol of "+ key+ " is "+ map.get(key));
        }
        System.out.println("");
    }
}
