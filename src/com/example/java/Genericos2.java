package com.example.java;

//Creare una clase para consumir Caja desde aqui mismo...

public class Genericos2{

    public static void main(String[] args) {

        //Creo una instancia de caja del tipo String
        Caja<String> caja1 = new Caja<>("este es mi string"); //en el segundo <> no se escribe el tipo de dato por ser generico

        //Creo una clase del tipo entero, pero debo crearlo antes en una variable porque no acepta primitivos
        Integer numero = 5;
        Caja<Integer> caja2 = new Caja<>(numero);

        System.out.println("Caja 1 es del tipo: "+caja1.elemento.getClass().getSimpleName());
        System.out.println("Caja 2 es del tipo: "+caja2.elemento.getClass().getSimpleName());

        //Comparando ambas instancias contra un string
        String miObjeto = "Perro";

        System.out.println("Caja1 y mi Objeto son iguales? "+ caja1.perteneceElContenidoAlaMismaClase(miObjeto));
        System.out.println("Caja2 y mi Objeto son iguales? "+ caja2.perteneceElContenidoAlaMismaClase(miObjeto));


    }
}

//Esto deberia ir en otro archivo

class Caja<T>{ //<T> indica que es una clase generica
    T elemento;

    //Constructor
    Caja(T elemento){
        this.elemento = elemento;
    }

    //en esta ocasion solo se crea un metodo para retornar el elemento
    T obtenerObjeto(){
        return elemento;
    }

    <V> boolean perteneceElContenidoAlaMismaClase(V otroObjeto) {  //Para comparar 2 objetos creados con esta misma clase para comporbar si son iguales o no.
        return elemento.getClass() == otroObjeto.getClass();
    }
}
