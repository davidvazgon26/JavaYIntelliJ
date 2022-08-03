package exercise.files.ch10.Ej10_02;

import exercise.files.ch10.Ej10_02.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
//        olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
//        olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
//        olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
//        olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));

        Press press = new OlivePress();
        press.setOil(5);
        int totalOil = press.getOil(olives);

        System.out.println("You got " + totalOil + " units of oil");

    }

}
