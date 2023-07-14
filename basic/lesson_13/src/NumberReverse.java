import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
//Задача 3.
// Пользователь вводит натуральное число.
// Распечатайте это число в обратном порядке.
        Scanner in = new Scanner(System.in);
        System.out.println("Input integer positive number: ");
        int n = in.nextInt();
        int digits = 0;
        int nd = n;

        // занесем цифры числа в массив, а потом распечатаем его в обратном порядке.
        // этот цикл вычисляет длину массива
        while (n > 0) {
            digits++;
            n = n / 10;
        }
        System.out.println(digits);

        int[] digit = new int[digits]; // задали длину массива

        // в массив digit заносим цифры числа
        for (int i = 0; i < digit.length; i++) {
            digit[i] = nd % 10; // остаток от деления на 10 - это и есть
            nd = nd / 10; // уменьшение числа в 10 раз
        }
        printArray(digit);
        System.out.println();
        printArrayReverse(digit);





    }
    // Methods
    public static void printArrayReverse (int[] num) {
        for (int i = num.length-1; i >= 0; i--) {
            System.out.print(num[i]+ " | ");
        }
    }

    public static void printArray (int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " | ");
        }
    }
    // End of Methods
}
