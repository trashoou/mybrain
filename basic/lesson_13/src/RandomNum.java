import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {
//Задача 2.
// Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
// Запросите у пользователя какое-то натуральное число.
// Определите, есть ли это число в массиве.
// Создайте и используйте метод searchInArray,
// который получает на вход массив и искомое число,
// а возвращает ответ - нашлось ли это число в массиве.

        Scanner in = new Scanner(System.in);
        int[] num = new int[10];

        int a = 1, b = 100;


        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами
            num[i] = (int)(Math.random() * (b - a + 1) + a);
        }

        printArray(num); // вызываем метод и печатаем массив
        System.out.println();
        System.out.println("Input number for search: ");
        int input = in.nextInt();

        while (input < 0 ) {
            System.out.println("Wrong input! Try again");
            input = in.nextInt();
        }

        // вызов метода поиска
        if (searchInArray(num,input)) {
            System.out.println("We find the number!"+searchIndexInArray(num, input));
        } else {
            System.out.println("We didn't find the number!"+searchIndexInArray(num, input));
        }
    }
    //_______Methods_______
    public static int searchIndexInArray (int[] num, int input) {
        int index = -1; // несуществующий индекс
        for (int i = 0; i < num.length; i++) {
            //проверяем, что в массиве есть такое искомое число.
            if (input == num[i]) {
                index = i;
                return index;
            }
        }
        return index;
    }

    public static boolean searchInArray (int[] num, int input) {
        //boolean res = false;
        for (int i = 0; i < num.length; i++) {
            //проверяем, что в массиве есть такое искомое число.
            if (input == num[i]) {
                return true;
            }
        }
        return false;
        //return res;
    }

    public static void printArray (int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " | ");
        }
    }

    //_______End of Methods______
}
