package com.example.java.tecese;

import java.io.*;
import java.util.HashSet;

//Una clase principal que tiene un metodo filtes que devuelve nulo (no hace nada el metodo)
//Declarar 2 variables de tipo entero y publicas en la clase padre llamadas startElement y endElement
class Parent{
    public int startElement;
    public int endElement;
    public String filter(){
        return null;
    }
}

//Clase que se extiende de Parent y anula el metodo filter o lo sobre escribe para escribir su propia version
class ChildOne extends Parent {
    private Boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2;i<= Math.sqrt(n);i++)
            if(n%i == 0) return false;
        return true;
    }
    @Override //Sobre escribo el metodo para devolver los numeros primos
    public String filter(){
        StringBuilder sb = new StringBuilder();
        for(int i=startElement;i<=endElement;i++)
            if(isPrime(i)) sb.append(i+" ");
        return sb.toString();
    }
}


//Clase que se extiende de Parent y anula el metodo filter o lo sobre escribe para escribir su propia version
class ChildTwo extends Parent{
    private int sumDigitSquare(int n){

        int sq = 0;
        while (n > 0)
        {
            int digit = n % 10;
            sq += digit * digit;
            n = n / 10;
        }
        return sq;
    }

    private Boolean isHappy(int n) {
        // A set to store numbers during
        // repeated square sum process
        HashSet<Integer> s = new HashSet<Integer>();
        s.add(n);

        // Keep replacing n with sum of
        // squares of digits until we either
        // reach 1 or we endup in a cycle
        while (true)
        {

            // Number is Happy if we reach 1
            if (n == 1)
                return true;

            // Replace n with sum of squares
            // of digits
            n = sumDigitSquare(n);

            // If n is already visited, a cycle
            // is formed, means not Happy
            if ((s.contains(n) && n != (int)s.toArray()[ s.size()-1 ] ))
                return false;

            // Mark n as visited
            s.add(n);

        }

    }
    @Override  // Sobre escribo el metodo para devolver los numeros felices
    public String filter(){
        StringBuilder sb = new StringBuilder();
        for(int i=startElement;i<=endElement;i++)
            if(isHappy(i)) sb.append(i+" ");
        return sb.toString();
    }
}


public class Polymorphism {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
      //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      //  int start = Integer.parseInt(br.readLine());
     //   int end = Integer.parseInt(br.readLine());
        ChildOne ch1 = new ChildOne();
        ChildTwo ch2 = new ChildTwo();
//        ch1.startElement =  start;
//        ch1.endElement = end;
//        ch2.startElement = start;
//        ch2.endElement = end;
        ch1.startElement =  1;
        ch1.endElement = 5555;
        ch2.startElement = 1;
        ch2.endElement = 5555;
        long total = 0;
        int x;
        long inicio = System.currentTimeMillis();
        System.out.println(ch1.filter());
        System.out.print(ch2.filter());
        long tiempo = System.currentTimeMillis() - inicio;
        total += tiempo;
        System.out.println("\n");
        System.out.println("tardo: "+total);

    }
}


/*
*
*  private int sumarCuadrados(int num){

        System.out.println("Antes del while: "+ num);
        int res = 0;
        while(num>0){
            System.out.println("Entro al while el num: "+ num);
            int dig = num%10;
            System.out.println("Dig es num%10 = "+ dig);
            num = num/10;
            System.out.println("num/10 es igual a: "+num/10);
            res = res+(dig*dig);
            System.out.println("Devuelvo: "+res);
        }
        return res;
    }
    *
    *
    *
    *
    *  private Boolean isHappy(int numero){
        Boolean res = false;
        int original = numero;
        boolean bandera = true;
        while(bandera==true){
            int sumaCuadrados = sumarCuadrados(numero);
            if(sumaCuadrados == 1){
                res = true;
                bandera = false;
            }else{
                if(sumaCuadrados == original){
                    res = false;
                    bandera = false;
                }else{
                    if(sumaCuadrados<10 && sumaCuadrados!=7){
                        res = false;
                        bandera = false;
                    }else{
                        numero = sumaCuadrados;
                     //   System.out.println("SUMACUADRADOS: " + numero);
                    }
                }
            }
        }
        return res;
    }
* */