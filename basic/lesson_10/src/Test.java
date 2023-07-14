import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число n: ");
        int n = in.nextInt();
        long factorial = calculateFactorial(n);
        System.out.println("Факториал числа " + n + " равен: " + factorial);

        // Проверяем, при каком значении n происходит переполнение типа int
        int maxInt = Integer.MAX_VALUE;
        int i = 1;
        while (i <= maxInt) {
            factorial = calculateFactorial(i);
            if (factorial < 0) {
                System.out.println("Переполнение памяти типа int происходит при n = " + i);
                break;
            }
            i++;
        }
    }

    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

