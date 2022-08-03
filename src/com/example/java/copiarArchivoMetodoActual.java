package com.example.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

//Metodo disponible a partir de java 7
public class copiarArchivoMetodoActual {
    public static void main(String[] args) {
        Path sourceFile = Paths.get("files", "loremipsum.txt");
        Path targetFile = Paths.get("files", "loremipsumCopie.txt");

        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Archivo copiado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
