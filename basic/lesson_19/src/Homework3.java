import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите натуральное число: ");
        int n = in.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        int[] primeNum = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                primeNum[index++] = i;
            }
        }
        printArray(primeNum);

    }
    //__________Methods________
    public static void printArray (int n[]) {
        System.out.print("Массив простых чисел: ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+" | ");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num/2 ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
