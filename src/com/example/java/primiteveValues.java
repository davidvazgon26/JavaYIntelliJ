package com.example.java;

public class primiteveValues {
    public static void main(String[] args) {
        byte b = 1;
        short sh = 1;
        int i = 1;
        long l = 1;

        float f = 1f;  //El sistema puede pedirtelo o no
        double d = 1d; //El sistema puede pedirtelo o no

        System.out.println("Byte : " + b );
        System.out.println("Short : " + sh );
        System.out.println("Integer : " + i );
        System.out.println("Long : " + l );
        System.out.println("Float : " + f );
        System.out.println("Double : " + d );

        otraFuncion();

        System.out.println("******************************");

        MaxValues();

    }

    public static void otraFuncion(){
        System.out.println("Solo imprime algo");
    }

    public static void MaxValues(){
        //que pasa cuando sobrepasas el valor maximo de un tipo de dato?

        byte b = 127; //Este es el valor maximo del tipo byte
        byte bb = 127; // Uso 2 variables identicas por el ejercicio.
        System.out.println(b);

        //que pasa si sobrepaso el valor incrementando en uno

        System.out.println(++bb); //El valor se vuelve negativo  -128

        //podemos evitar eso con un if

        if(b<Byte.MAX_VALUE){
            b++;
        }

        System.out.println("Byte: "+b); // Asi nunca se sobrepasa

    }


}
