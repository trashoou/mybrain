import java.util.Scanner;

public class Homework2 {
    //Задача 2
//Вводится положительное целое число, найдите сумму его цифр.
    public static int find(int n) {
        int sum = 0;

        while (n > 0) {
            int p = n % 10;
            sum += p;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите положительное целое число: ");
        int n = in.nextInt();

        int result = find(n);
        System.out.println("Сумма цифр числа: " + result);
    }
}
