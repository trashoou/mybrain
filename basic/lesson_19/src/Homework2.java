import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int n = in.nextInt();

        int countDivisors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                countDivisors++;
            }
        }

        int[] arrayDivisors = new int[countDivisors];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arrayDivisors[index++] = i;
            }
        }
        printArray(arrayDivisors);

    }
    //__________Methods________
    public static void printArray (int n[]) {
        System.out.print("Массив делителей числа: ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+" | ");
        }
    }
}