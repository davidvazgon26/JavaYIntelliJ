package com.example.java;

public class exceptions {
    public static void main(String[] args) {
        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
            char lastChar = chars[chars.length-1];  // Quitar el -1 para provocar la exception
            System.out.println(lastChar);
            System.out.println("Pase la primera exception");

            //Ejemplo de generacion de una n ecima exception

            String sub = welcome.substring(10); //Provocando el error de manera deliberada ingresando 10 en lugar de 6 e!
            System.out.println(sub);

        } catch (ArrayIndexOutOfBoundsException e) { // Captura la exception de tamanio del arreglo
            System.out.println("New Error");
            throw new RuntimeException(e);
        }catch (StringIndexOutOfBoundsException e){ // Captura la exception de la subcadena
            System.out.println("String index problem!"); // Puedo personalizar la respuesta en cada catch
        }
    }
}
