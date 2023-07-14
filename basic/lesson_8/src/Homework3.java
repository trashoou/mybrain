import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
//Написать программу, в которую пользователь вводит имя и фамилию в одну строку через пробел.
//Программа должна выводить имя и фамилию на разных строках.
//Первая буква имени и фамилии должны быть большими не зависимо от того,
//как их ввел пользователь, лишние пробелы должны быть удалены. (повторение методов String)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя и фамилию через пробел: ");
        String fullName = scanner.nextLine();

        // Удаляем лишние пробелы в начале и конце строки
        fullName = fullName.trim();

        // Разделяем имя и фамилию
        String[] nameParts = fullName.split(" ");

        // Преобразуем первую букву имени и фамилии в верхний регистр
        String firstName = capitalizeFirstLetter(nameParts[0]);
        String lastName = capitalizeFirstLetter(nameParts[1]);

        // Выводим имя и фамилию на разных строках
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
    }

    // Метод для преобразования первой буквы строки в верхний регистр
    private static String capitalizeFirstLetter(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
}

