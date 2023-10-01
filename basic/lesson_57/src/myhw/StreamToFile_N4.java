package myhw;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToFile_N4 {
    public static void main(String[] args) {
        // Создаем коллекцию строк
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");
        strings.add("bow");
        strings.add("man");
        strings.add("lesson");

        // Преобразуем каждую строку в верхний регистр и фильтруем строки длиной больше 3 символов
        List<String> filteredAndTransformedStrings = strings.stream()
                .filter(str -> str.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Записываем отфильтрованные и преобразованные строки в новый текстовый файл
        writeToFile("output.txt", filteredAndTransformedStrings);
    }

    // Метод для записи списка строк в файл
    public static void writeToFile(String fileName, List<String> lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Строки записаны в файл " + fileName);
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}
