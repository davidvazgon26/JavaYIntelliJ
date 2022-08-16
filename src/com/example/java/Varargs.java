package com.example.java;

//argumentos de longitud variable.
//en lugar de estar escribiendo varios metodos para cada vez que se ingresen difeerente cantidad de argumentos,
//mejor utilizamos uno variable...

public class Varargs {
    public static void main(String[] args) {
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";
//        String[] shopping = {"Bread", "Milk", "Eggs", "Bananas"};// con el metodo varargs ya no necesito crear el arreglo, lo paso tal cual
        printShoppingList(item1, item2, item3);
//        printShoppingList(shopping);
        printShoppingList("Bread", "Milk", "Eggs", "Bananas");

    }
// En lugar de hacer esto usamos varargs o argumentos de longitud variable que es lo mismo.
//    private static void printShoppingList(String string1, String string2){
//        System.out.println("SHOPING LIST");
//        System.out.println("1. "+ string1);
//        System.out.println("2. "+ string2);
//    }
//
//    private static void printShoppingList(String string1, String string2, String string3){
//        System.out.println("SHOPING LIST");
//        System.out.println("1. "+ string1);
//        System.out.println("2. "+ string2);
//        System.out.println("3. "+ string3);
//    }

//    private static void printShoppingList(String[] items) {
//        System.out.println("SHOPING LIST");
//        for (int i = 0; i < items.length; i++) {
//            System.out.println(i+1+": "+ items[i]);
//        }
//    }
//
//    private static void printShoppingList(String[] items) {
//        System.out.println("SHOPING LIST");
//        for (int i = 0; i < items.length; i++) {
//            System.out.println(i+1+": "+ items[i]);
//        }
//    }

//    private static void printShoppingList(String[] items) {
//        System.out.println("SHOPING LIST");
//        for (int i = 0; i < items.length; i++) {
//            System.out.println(i+1+": "+ items[i]);
//        }
//    }
        //Metodo varargs para sustituir a todos los otros metodos.
    private static void printShoppingList(String... items) {
        System.out.println("SHOPING LIST");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i+1+": "+ items[i]);
        }
    }

}
