package com.example.java;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class listaEnlazada {

    public static void main(String[] args) {
        LinkedList<String> miLista = new LinkedList<>();
        miLista.add("A");
        miLista.add("B");
        miLista.add(1,"C"); // Puedo indicar la posicion en la que quiero el elemento de esta manera
        System.out.println(miLista);
        miLista.remove("B");
        System.out.println(miLista);
    }
}
