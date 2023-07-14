import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
//Задача 3. Пользователь вводит строку.
//Распечатайте эту строку в обратном порядке.
        System.out.println("Input string to reverse: ");
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        char[] array = st.toCharArray();

        for (int i = st.length()-1; i >= 0; i--) {
            System.out.print(array[i]);

        }

    }
}
