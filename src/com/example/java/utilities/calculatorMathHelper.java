package com.example.java.utilities;

public class calculatorMathHelper {
    public static double addValues(String ss1, String ss2){
        double d1 = Double.parseDouble(ss1);
        double d2 = Double.parseDouble(ss2);
        return d1+d2;
    }
    public static double substracValues(String ss1, String ss2){
        double d1 = Double.parseDouble(ss1);
        double d2 = Double.parseDouble(ss2);
        return d1-d2;
    }
    public static double multiplyValues(String ss1, String ss2){
        double d1 = Double.parseDouble(ss1);
        double d2 = Double.parseDouble(ss2);
        return d1*d2;
    }
    public static double divideValues(String ss1, String ss2){
        double d1 = Double.parseDouble(ss1);
        double d2 = Double.parseDouble(ss2);
        return d1/d2;
    }
    public static double modValues(String ss1, String ss2){
        double d1 = Double.parseDouble(ss1);
        double d2 = Double.parseDouble(ss2);
        return d1%d2;
    }
}
