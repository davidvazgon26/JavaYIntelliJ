package com.example.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class copiarArchivoMetodoAnterior {
    public static void main(String[] args) {
        String sourceFile = "files/loremipsum.txt";
        String targetFile = "files/target.txt";

        //Usando la sintaxis try-with-resources
        //implementando try con el metodo close... try(){}, que implementa la interface AutoClosable
        try (
                FileReader fReader = new FileReader(sourceFile);
                BufferedReader bReader = new BufferedReader(fReader);
                FileWriter writer = new FileWriter(targetFile);
        ) {
            while (true) {
                String line = bReader.readLine();
                if (line == null) {
                    break;
                } else {
                    writer.write(line + "\n");
                }
            }
            System.out.println("Archivo copiado");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

