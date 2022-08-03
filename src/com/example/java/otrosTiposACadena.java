package com.example.java;

import java.text.NumberFormat;

public class otrosTiposACadena {
    public static void main(String[] args) {
        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

        long longValue = 10_000_000; //el guion bajo se introdujo desde java 7 para mejor comprension del numero
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);
    }
}
