package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class arreglosListas {
    public static void main(String[] args) {
        //Creando la lista
        List<String> list = new ArrayList<>();
        //Agregando elementos a la lista

        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println(list);  //Lo muestra como un arreglo de js

        //Puedo seguir agregando

        list.add("Torreon");
        System.out.println(list);

        //Puedo remover elementos de la lista
        list.remove(1);
        System.out.println(list);

        //Puedo obtener un elemento de la lista
        String state = list.get(2);
        System.out.println("El tercer elemento de la lista es: "+state);

        //Puedo buscar un elemento en la lista
        int pos = list.indexOf("Washington");
        System.out.println("Washington esta en la posicion: "+ pos);

    }
}
