import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
//В задаче про калькулятор все действия оформить методами.
//Если вводятся целые числа, то вычислять целочисленное частное и остаток от деления.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                int sum = add(num1, num2);
                System.out.println("Результат: " + sum);
                break;
            case '-':
                int difference = subtract(num1, num2);
                System.out.println("Результат: " + difference);
                break;
            case '*':
                int product = multiply(num1, num2);
                System.out.println("Результат: " + product);
                break;
            case '/':
                if (num2 != 0) {
                    int quotient = divide(num1, num2);
                    int remainder = modulo(num1, num2);
                    System.out.println("Результат (Частное): " + quotient);
                    System.out.println("Результат (Остаток): " + remainder);
                } else {
                    System.out.println("Ошибка: деление на ноль недопустимо.");
                }
                break;
            default:
                System.out.println("Ошибка: неправильная операция.");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }
}
