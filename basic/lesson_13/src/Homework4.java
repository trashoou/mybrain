import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
//Задача 4.()* Написать метод, принимающий массив целых чисел, и разворачивающий его.
// Последний элемент становится нулевым, предпоследний, первым, и т. д.
// Подсказка: этот метод должен изменить полученный массив.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа через пробел:");
        String input = in.nextLine();

        String[] numbers = input.split(" ");
        int[] array = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }

        reverseArray(array);
        System.out.println("Результат: " + Arrays.toString(array));
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
