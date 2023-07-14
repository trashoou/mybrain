import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
//Составьте программу, которая вычисляет сумму чисел от 1 до 1/n.
//n вводится с клавиатуры.
//Пример:n = 10|sum = 1 + 1/2 + 1/3 + ... + 1/10 Для вычисления sum используйте метод.
        Scanner in = new Scanner(System.in);
        System.out.println("Вычисление суммы чисел от 1 до 1/n");
        System.out.println("Введите число n:");
        int n = in.nextInt();
        double sum = 0;
        double i = 1;

        while (i<=n) {
            sum += 1 / i;
            i++;
        }
        System.out.println("Сумма чисел от 1 до 1/n: "+sum);
    }
}

