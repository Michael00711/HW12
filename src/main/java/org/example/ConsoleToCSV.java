package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleToCSV {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder csvContent = new StringBuilder();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            } else if (input.equals("next")) {
                csvContent.append("\n");
            } else {
                csvContent.append(input).append(", ");
            }
        }

        try {
            FileWriter csvWriter = new FileWriter("output.csv");
            csvWriter.write(csvContent.toString());
            csvWriter.close();
            System.out.println("CSV файл успешно создан!");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при создании CSV файла: " + e.getMessage());
        }
    }
}
