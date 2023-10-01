package myhw;

import java.io.*;
import java.util.Scanner;

public class UserNameToFile_N3 {
    public static void main(String[] args) {
        // Запрос имени у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String userName = scanner.nextLine();
        scanner.close();

        // Запись имени пользователя в текстовый файл
        writeToFile("userName.txt", userName);

        // Чтение имени пользователя из файла и вывод приветствия
        String savedUserName = readFromFile("userName.txt");
        if (savedUserName != null) {
            System.out.println("Hello, " + savedUserName + "!");
        }
    }

    // Метод для записи строки в файл
    public static void writeToFile(String fileName, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text);
            System.out.println("Имя пользователя записано в файл " + fileName);
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    // Метод для чтения строки из файла
    public static String readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            return line;
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
            return null;
        }
    }
}
