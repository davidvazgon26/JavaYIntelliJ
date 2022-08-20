package com.example.java.tecese;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

class Register {

    private static Register register = null; //Para Singelton lo vuelvo privado y asi me aseguro que nadie pueda llamar una nueva instancia

    public static Register getInstance() {  //Como no puedo llamar instancias de una classe singleton yo debo crearla y eso lo hago aqui

        if (register == null) {
            register = new Register();
        }
        return register;
    }

    public String getTotalBill(Map<String, Integer> itemDetails) {
        Map<String, Float> map = new HashMap<>();
        map.put("apple", 2.0f);
        map.put("orange", 1.5f);
        map.put("mango", 1.2f);
        map.put("grape", 1.0f);

       // System.out.println(itemDetails);
        double total = 0;
        for (Map.Entry<String, Integer> entry : itemDetails.entrySet()) {
            float p = map.get(entry.getKey());
            int cant = entry.getValue();

           // System.out.println(entry.getKey());
           // System.out.println(entry.getValue());
            total +=  p*cant;
        }

        String str = new DecimalFormat("#.0").format(total);

        return str;
    }
}


public class Billing {
    public static void main(String[] args) {
        Map<String, Integer> compra = new HashMap<String, Integer>();
        compra.put("orange", 10);
        compra.put("apple", 30);
        compra.put("mango", 20);

        Register instancia = Register.getInstance();
        System.out.println(instancia.getTotalBill(compra)); // el resultado debe ser 99.0
    }
}
