package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Start ---");
        List<Autoturism> autoturisme = new ArrayList<>();
        File file = new File("src/main/resources/auto.csv");
        try {
            // Create a CSVReader object
            CSVReader reader = new CSVReader(new FileReader(file));
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                String firma = nextLine[0];
                Combustibil combustibil = Combustibil.valueOf(nextLine[1].toUpperCase());
                try {
                    int price = Integer.parseInt(nextLine[2]);
                    String model = nextLine[3];
                    autoturisme.add(new Masina(firma, combustibil, price, model));
                } catch (NumberFormatException e) {
                    String date = nextLine[2];
                    autoturisme.add(new Motocicleta(firma, combustibil, date));
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }

       // System.out.println(autoturisme);
        autoturisme.forEach(System.out::println);
    }
}