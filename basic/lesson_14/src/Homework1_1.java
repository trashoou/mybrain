public class Homework1_1 {
    public static void main(String[] args) {
//Задача 1.1 Написать метод, принимающий массив целых чисел,
//и возвращающий сумму всех его четных элементов (не индексы!, а сами элементы).
//Массив на 100 элементов задать случайными числами в интервале от 1 до 100.
// Изменить код так чтобы использовались операторы break или continue.
        int[] num = new int [10];
        int a = 1, b = 100;

        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами
            num[i] = (int)(Math.random() * (b - a + 1) + a);
        }
        System.out.println("Вывод всех массивов:");
        printArray(num);
        System.out.println();
        System.out.println("Вывод четных массивов:");
        printEvenArray(num);
        System.out.println();
        oddElements(num);
    }
    public static void printEvenArray (int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i]+ " | ");
            }
        }
    }
    public static void printArray (int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " | ");
        }
    }
    public static int oddElements (int[] num) {
        int sumOdd = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                continue;
            }
            sumOdd += num[i];
        } System.out.print("Сумма всех четных элементов массива = "+sumOdd);
        return sumOdd;
    }
}
