package com.example.java;

public class PracticaConStrings {

    public static void main(String[] args) {
        String unString = new String("Soy un string");

        String otroString = new String(unString);  //al usar new le decimos a java que queremos una estancia independiente, por lo que la referencia no es la misma.

        String tercerString = unString;

//        System.out.println("unString "+unString);
//        System.out.println("otroString "+otroString);
//        System.out.println("tercerString "+tercerString);
//
//        tercerString = "modifico mi tercerString";
//
//        System.out.println("unString 2 "+unString);
//        System.out.println("otroString 2 "+otroString);
//        System.out.println("tercerString 2 "+tercerString);

        String miString = "abcde";


        char caracter;

        caracter = miString.charAt(2); //c
        System.out.println("El caracter en la posicion 2 es: "+ caracter);
        System.out.println("El caracter en la posicion 4 es: "+ miString.charAt(4));

        String concatenar = miString.concat("xyz");
        System.out.println("El resultado de concatenar es: " + concatenar);

        String otroConcatenar = "abcde" + "xyz";

        System.out.println("son iguales las cadenas? "+  (concatenar == otroConcatenar));
        System.out.println("Son iguales las cadenas? "+ concatenar.equals(otroConcatenar)); // equalsIgnoreCase para ignorar mayusculas



    }
}
