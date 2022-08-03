package com.example.java;

//Este archivo se uso en los primeros ejercicios pero ahora lo utilizare para el ejercicio de Instanciar variables

import com.example.java.model.Olive;

import java.util.ArrayList;
import java.util.List;

// el archivo esta en com.example.java.model --> Olive
public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello from IDEA!");
        List<Olive> olives = new ArrayList<>();
/*        //cada vez que llamamos a new Olive estamos llamando al constructor (aqui se llamo 3 veces)
        Olive olive1 = new Olive("Kalamata", 0x2E0854,3 );  // Si paso argumentos usara el constructor en el archivo Olive
        olives.add(olive1);
        Olive olive2 = new Olive("Chopilopi", 0x2E9854,2);
        //olive2.setOil(1); //Cambiando el valor pre establecido de la variable oil
        olives.add(olive2);
        Olive olive3 = new Olive("Bien Negro", 0x000000,9);
       // olive3.setOil(12); // Tambien aqui
        olives.add(olive3);*/
        //Creando codigo de arriba mas limpio y con menos lineas

       // olives.add(new Olive(Olive.KALAMATA, 0x2E0854,3)); //asi se usan las constantes
        //olives.add(new Olive(Olive.KALAMATA, 0x2E0854,6));
        olives.add(new Olive(Olive.KALAMATA, 0x2E0854,6));
        olives.add(new Olive(Olive.KALAMATA, 0x2E0854,6)); // Usando las listas enumeradas
        //olives.add(new Olive("Kalamata3", 0x2E0854,9));


        //Creando una instancia de OlivePress
        OlivePress press = new OlivePress(); //instancia de la clase
        int totalOil = press.getOil(olives); // uso de metodo de la instancia (press) de la clase
        System.out.println("Total olive oil: "+ totalOil);
    }
}
