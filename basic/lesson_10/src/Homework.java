import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
//С клавиатуры вводятся N чисел. Составьте программу, которая определяет кол-во отрицательных,
//кол-во положительных и кол-во нулей среди введеных чисел. Значение N вводится с клавиатуры.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел N:");
        int n = in.nextInt();

        int positive = 0;
        int negative = 0;
        int zero = 0;

        System.out.println("Введите числа: ");

        int i = 0;
        while (i < n) {
            int number = in.nextInt();

            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }
            i++;
        }
        System.out.println("Кол-во положительных чисел:"+positive);
        System.out.println("Кол-во отрицательных чисел:"+negative);
        System.out.println("Кол-во нулей:"+zero);
    }
}