package exercise.files.ch10.Ej10_02;

import exercise.files.ch10.Ej10_02.model.Olive;
import exercise.files.ch10.Ej10_02.model.OliveColor;
import exercise.files.ch10.Ej10_02.model.OliveName;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Olive(OliveName.KALAMATA, OliveColor.PURPLE, 3));
        olives.add(new Olive(OliveName.KALAMATA, OliveColor.PURPLE, 3));
        olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
        olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
        olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
        olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);

        System.out.println("You got " + totalOil + " units of oil");

    }

}
