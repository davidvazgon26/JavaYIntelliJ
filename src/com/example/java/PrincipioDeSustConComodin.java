package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class PrincipioDeSustConComodin {
    public static void main(String[] args) {
        List<Building2> buildings2 = new ArrayList<>();
        buildings2.add(new Building2());
        buildings2.add(new Building2());
        printBuildings2(buildings2);

        List<Office2> offices2= new ArrayList<>();
        offices2.add(new Office2());
        offices2.add(new Office2());
        printBuildings2(offices2);

        List<House> houses = new ArrayList<>();
        houses.add(new House());
        houses.add(new House());
        printBuildings2(houses);

        addHouseToList(houses);
        addHouseToList(buildings2);
    }

    static void printBuildings2(List<? extends Building2> buildings2){ //con este comodin ahora puedo invocar a subtipos
        for (int i = 0; i <  buildings2.size(); i++) {
            System.out.println(buildings2.get(i).toString() + ""+ (i+1));
        }
        System.out.println();
    }

    static void addHouseToList (List<? super House> buildings2){
        buildings2.add(new House());
        System.out.println();
    }
}

class Building2{
    public int numberOfRooms = 7;

    @Override public String toString(){
        return ("building");
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

}
class Office2 extends  Building2{
    public String toString(){
        return("office");
    }
}

class House extends  Building2{

    public int numberOfRooms = 10;

    public String toString(){
        return("house");
    }

    @Override
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    @Override
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
