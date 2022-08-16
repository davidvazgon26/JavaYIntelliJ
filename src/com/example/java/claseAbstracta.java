package com.example.java;

//Las clases abstarctas pueden ser heredadas pero jamas instanciadas
//Al heredar de una clase abstracta es obligatorio definir todos sus metodos, es decir, definir el comportamiento de sus metodos.
//Para que una classe se considere abstracta debe tener cuando menos uno de sus metodos del tipo abstracto.

public class claseAbstracta {

}
abstract class Figura{
    private int numeroLados;

    public Figura(){
        this.numeroLados = 0;
    }

    public abstract float area();

}

////////////////////////////////
  class Circulo extends Figura{
    public float radio;

    public float area(){
        return (float) (3.1415 * (this.radio * this.radio));
    }

}
