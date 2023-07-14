import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Superman and his choice");
// Богатырь приехал к камню с выбором трех путей - налево, направо или прямо.
// Считайте с клавиатуры выбор богатыря и сообщите ему его судьбу:
// left - loose your horse, right - loose your honor, forward - loose your head.
// Использовать сравнение строк st.equals(), st - это имя переменной типа String
        // задача на использование строковых переменных в условиях

        Scanner in = new Scanner(System.in);

        System.out.println("left - loose your horse, right - loose your honor, forward - loose your head.");
        System.out.println("What is your choice? ");
        String choice = in.next(); // считываем строку, которую написал пользователь

        if (choice.equals("left")) {
            System.out.println("you loose your horse!");
        } else if (choice.equals("right")) {
            System.out.println("You loose your honor!");
        } else if (choice.equals("forward")) {
            System.out.println("You loose your head!");
        }
    }
}