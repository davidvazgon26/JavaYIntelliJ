package com.example.java;

import java.util.HashSet;

public class Happy {
    int start = 1;
    int end = 5555;

    public static void main(String[] args) {

        Happy isHappy = new Happy();
        System.out.println("Estos son los numeros Felices del "+ isHappy.start + " hasta el "+ isHappy.end);
        System.out.println(isHappy.filter());

    }
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

    public String filter(){
        StringBuilder sb = new StringBuilder();
        for(int i=start;i<=end;i++)
            if(isHappy(i)) sb.append(i+" ");
        return sb.toString();
    }
}

