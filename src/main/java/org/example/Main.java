package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String fname = "Virus";
        int c = 1;

        try {
            while (c <= 10) {
                // Use try-with-resources to automatically close the FileWriter
                try (FileWriter myFile = new FileWriter("C:/Users/tklaw/Desktop/" + fname + c + ".txt")) {
                    myFile.write("Lorem Ipsum");
                }
                c++;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}