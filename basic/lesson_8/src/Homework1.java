import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
//Пользователь вводит с клавитуры число.
//Вывести абсолютное значение (модуль) числа, используя тернарный оператор
        Scanner in = new Scanner(System.in);
        System.out.println("Hello!");
        System.out.println("Input number: ");
        double number = in.nextDouble();
        String securityAnswer = (number >= 0) ?  "The absolute value of a number " + number :  "The absolute value of a number " + -number;
        System.out.println(securityAnswer);
    }
}
