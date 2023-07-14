import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
//Пользователь вводит строку.
// Распечатайте каждую букву строки на новой строчке.
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int l = s.length(); // определяем длину введеной строки
        System.out.println("");
        int pointer = 0;

        while (l > 0) {
            System.out.println(s.charAt(pointer)); // печатаем букву
            pointer++; //двигаем указатель по строке вправо
            l--; // уменьшаем длину строки
        }
    }
}
