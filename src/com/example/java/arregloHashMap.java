package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class arregloHashMap {
    public static void main(String[] args) {
        //Creando el HashMap
        Map<String, String> map = new HashMap<>();

        //agregando datos al Map
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);

        //Agregando mas datos
        map.put("Alaska", "Juneau");  //No se garantiza el mismo orden del map cada vez...
        map.put("Coahuila", "Saltillo");
        System.out.println(map);

        //Obtener dato
        String cap = map.get("Oregon");
        System.out.println("The capitol of Oregon is " + cap);

        //Remover dato
        map.remove("Coahuila");
        System.out.println(map);

    }
}
