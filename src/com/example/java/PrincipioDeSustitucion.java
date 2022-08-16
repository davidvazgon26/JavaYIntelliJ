package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class PrincipioDeSustitucion {
    public static void main(String[] args) {

        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office); // El principio de sustitucion me permite pasar un subtipo de Building, es decir que extiende de Building

        //Puedo crear una lista del tipo Building y agregar elementos del subtipo Office sin problema
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Office());
        buildings.add(new Building());
        buildings.add(new Office());
        printBuildings(buildings); // imprimiendo lista creada

        //Lo que no puedo hacer es crear una lista del subtipo

//        List<Office> office = new ArrayList<>();
//        office.add(new Office());
//        office.add(new Office());
//        printBuildings(office); // la respuesta sera que son incompatibles

    }
    //Metodos
    static void build(Building building){
        System.out.println("Construyendio un nuevo "+ building.toSring());
    }

    static void printBuildings(List<Building> buildings){
        for (int i = 0; i < buildings.size() ; i++) {
            System.out.println(i+1+": "+buildings.get(i).toSring());
        }
    }
}

class Building{
//    @Override
    public String toSring(){
        return("building");
    }
}

class Office extends Building{
//    @Override
    public String toSring(){
        return("office");
    }
}
