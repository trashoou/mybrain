import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Нахождение максимального числа их трех натуральных чисел.");
        System.out.println("Введите первое число: ");
        int x = in.nextInt();
        System.out.println("Введите второе число: ");
        int y = in.nextInt();
        System.out.println("Введите третье число: ");
        int z = in.nextInt();
        int result = maxXYZ(x,y,z);
        if (result != -1) {
            System.out.println("Максимальное число:" + result);
        } else {
            System.out.println("Введены некоректные значения.");
        }



    }
//Написать метод, определяющий максимум из трех натуральных чисел.
//Метод должен быть защищен от ввода отрицательных чисел.
    public static int maxXYZ(int x, int y, int z) {
        if (x > 0 && y > 0 && z > 0) { // Проверяем, что все числа неотрицательные
            int max = x;
            if (y > max) {
                max = y;
            }
            if (z > max) {
                max = z;
            }
            return max;
        } else {
            return -1; // Возвращаем -1 для указания ошибки или невозможности определения максимума
        }

    }
}