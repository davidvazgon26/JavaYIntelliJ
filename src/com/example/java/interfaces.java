package com.example.java;

//en JAVA no es posible la herencia multiple
//LInterfas, coleccion de metodos abstractos y propiedades constantes, donde se especifica que se debe de hacer pero no el como.
//a diferencia de una clase abstracta la interfaz no puede hacer nada por si sola
// todo lo deben hacer las clases hijas es decir todos sus metodos estan por contrato pendientes de que los realicen sus clases hijas
//Una clase puede usar N cantidad de interfaces que necesite.



public class interfaces {


}

 interface  Canino{
    public abstract  void aullar();
    public abstract  void ladrar();
}

class Perro  implements Canino{
    public void aullar(){}

    public void ladrar(){}
}
