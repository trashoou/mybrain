public class Homework1_2 {
    public static void main(String[] args) {
//Задача 1.2 Написать метод, принимающий массив целых чисел,
// и возвращающий произведение всех его элементов, с четными индексами.
// 0 - тоже четное число.
// Умножать числа с четными индексами в массиве так,
// чтобы использовались операторы break или continue.
        int[] num = new int [10];
        int a = 1, b = 10;

        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами
            num[i] = (int)(Math.random() * (b - a + 1) + a);
        }
        printArray(num);
        System.out.println();
        ProductOfElements(num);
    }
    public static void printArray (int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " | ");
        }
    }
    public static int ProductOfElements (int[] num) {
        int product = 1;
        for (int i = 0; i < num.length; i++) {
            if (i % 2 != 0) {
                continue;
            }

            if (num[i] == 0) {
                product = 0;
                break;
            }
            product *= num[i];
        } System.out.println("Произведение всех четных индексов массива: "+product);
        return product;
    }
}
