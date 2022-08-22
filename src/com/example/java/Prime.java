package com.example.java;

import java.util.HashSet;

public class Prime {

        int start = 1;
        int end = 5555;

    public static void main(String[] args) {

        Prime isPrime = new Prime();
        System.out.println("Estos son los numeros Primos del "+ isPrime.start + " hasta el "+ isPrime.end);
        System.out.println(isPrime.filter());

    }

    public static HashSet<Integer> collection(int start, int end){
        HashSet<Integer> p = new HashSet<Integer>();
        // recorro el rango de numeros dado
        for (int i = start; i <= end; i++) {
            int cont = 0;
            // valido si son primos y si lo son los ingreso al HashSet
            for (int j = 1; j <=i ; j++) {
                if (i%j == 0){
                    cont++;
                }
            }
            if (cont == 2){ p.add(i);}
        }
       return p;
    }


    private Boolean isPrime(int n, HashSet<Integer> r){

        return r.contains(n);

      //  if(n==1) return false;
     //   for(int i=2;i<= Math.sqrt(n);i++)
      //      if(n%i == 0) return false;
       // return true;
    }

    public String filter(){
         HashSet<Integer> r = Prime.collection(start, end);
     //   System.out.println("retornando r: "+r);
        StringBuilder sb = new StringBuilder();
       for(int i=start;i<=end;i++)
            if(isPrime(i, r)) sb.append(i+" ");
        return sb.toString();
    }
}


/*
*
*  private Boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2;i<= Math.sqrt(n);i++)
            if(n%i == 0) return false;
        return true;
    }
*
* */