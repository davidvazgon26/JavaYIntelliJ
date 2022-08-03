package com.example.java;//los datos con punto flotante en operaciones matematicas tienden a ser inexactos en java
// por lo que hay que utilizar el tipo de dato BigDecimal, aqui un ejemplo:

import java.math.BigDecimal;

public class exactitudDecimal {
    public static void main(String[] args) {
        double valor = 0.012;

        double primitiveValue = valor + valor +valor;
        System.out.println("Esto no es correcto");
        System.out.println(primitiveValue);  // 0.036000000000000004 lo cual es incorrecto

        //Para solucionarlo debemos hacer uso de BigDecimal...

        String strValue = Double.toString(valor);
        System.out.println("Mostrar el valor como string: "+ strValue);
        //Ya como string podemos hacer la transformacion y calculo
        BigDecimal bigValue = new BigDecimal(strValue);

        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);

        System.out.println("Ya tenemos el calculo correcto: "+ bSum);
    }
}
