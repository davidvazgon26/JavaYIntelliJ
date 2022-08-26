package com.example.java.InputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class InputOutputStreamUse {
    public static void main(String[] args) {

        //ruta para leer un archivo
        Path inputPath = Paths.get("C:\\Users\\david\\Downloads\\Cursos TATA\\Ex_Files_JavaEssT_Q32015\\Ex_Files_JavaEssT_Q32015\\Exercise Files\\Ch03\\03_04\\IDEAProject\\IDEAProject\\src\\com\\example\\java\\InputStream\\file.txt");
        //ruta para escribir en un archivo nuevo
        Path outputPath = Paths.get("C:\\Users\\david\\Downloads\\Cursos TATA\\Ex_Files_JavaEssT_Q32015\\Ex_Files_JavaEssT_Q32015\\Exercise Files\\Ch03\\03_04\\IDEAProject\\IDEAProject\\src\\com\\example\\java\\InputStream\\file2.txt");
        InputStream input;
        try {
            input = Files.newInputStream(inputPath, StandardOpenOption.READ); //Lectura

            Files.newOutputStream(outputPath, StandardOpenOption.CREATE); // Escritura en archivo nuevo, si no existe lo crea

            OutputStream outputStream = Files.newOutputStream(outputPath, StandardOpenOption.WRITE); //despues de crear el archivo lo abrimos en modo escritura

            int i;
            byte[] data = new byte[1024]; // leemos la info del otro archivo

            while ((i = input.read()) != -1){
                System.out.print((char)i);
            }

            System.out.println("");
            System.out.println("Termina lectura e inicia escritura");

            while ((i = input.read(data)) != -1){
                System.out.print((char)i);
                outputStream.write(data); // Vamos escribiendo las lineas
            }
            input.close(); //cerrar archivo file.txt
            outputStream.close(); // cerrar archivo file2.txt
            System.out.println("Escritura finalizada");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
