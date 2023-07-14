import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
//Вводится n - натуральное число. Напишите метод, который получает на вход n
// и вычисляет n! = 1 * 2 * 3 *... * n (n факториал) 10! = 1 * 2 * 3 * ... * 10
// Вызовите полученный метод. При каком значении n происходит переполнение памяти,
// выделяемой для n типа int?
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число n: ");
        int n = in.nextInt();
        int factorial = calculateFac(n);
        System.out.println("Факториал числа " + n + " равен: " + factorial);

        int maxInt = Integer.MAX_VALUE;
        int i = 1;
        while (i <= maxInt) {
            factorial = calculateFac(i);
            if (factorial < 0) {
                System.out.println("Переполнение памяти типа int происходит при n = " + i);
                break;
            }
            i++;
        }
    }

    public static int calculateFac(int n) {
        int result = 1;
        for (int i = 1; i < n; i++) {
            result *= i;
        }
        return result;
    }
}

