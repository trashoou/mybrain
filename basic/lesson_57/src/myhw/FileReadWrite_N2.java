package myhw;

import java.io.*;
import java.util.Scanner;

public class FileReadWrite_N2 {
    public static void main(String[] args) {
        String fileName = "sample.txt"; // Имя вашего файла

        // Записываем строку "Hello, World!" в конец файла
        writeToFile(fileName, "Hello, World!");

        // Повторно читаем и выводим обновленное содержимое файла
        readFileContents(fileName);
    }

    // Метод для чтения и вывода содержимого файла
    public static void readFileContents(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            System.out.println("Содержимое файла: "+fileName);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
    }

    // Метод для записи строки в конец файла
    public static void writeToFile(String fileName, String text) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true); // true - для добавления в конец файла
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            printWriter.println(text);

            printWriter.close();
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}
