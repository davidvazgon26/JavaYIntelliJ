package com.example.java;

public class arregloBidimensional {
    public static void main(String[] args) {
        //Declarando un arreglo bidimensional de tipo string
        String[][] states = new String[3][2]; //3 renglones 2 columnas

        states[0][0] = "California";
        states[0][1] = "Sacramento";
        states[1][0] = "Oregon";
        states[1][1] = "Salem";
        states[2][0] = "Washington";
        states[2][1] = "Olympia";

        for (int i = 0; i < states.length; i++) {  //recorro los renglones

            StringBuilder sb = new StringBuilder(); //Creo una cadena incremental para no usar tantas variables
                sb.append("The capitol of ")
                    .append(states[i][0]) // el segundo argumento lo dejo manual porque solo existen 2 columnas
                        .append(" is ")
                        .append(states[i][1])
                        .append(".");
            System.out.println(sb);
        }

    }
}


/*
*
*                  1rst Dimension  2nd Dimension      Dimension (2)
*    Position (3)
*           2       Washington      Olympia
*           1       Oregon          Salem
*           0       California      Sacramento
*
* */