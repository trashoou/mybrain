import java.util.Scanner;
public class Homework4 {
    public static void main (String [] args) {
// Задача 4 -
// Написать программу, определяющую является ли год високосным.
// Для того, чтобы быть високосным год должен: делится без остатка на 4 и либо не должен делится без остатка на 100
// либо если он делится на 100, то он должен делится также на 400.
        Scanner in = new Scanner(System.in);
        System.out.println("Определение является ли год високосным.");
        System.out.println("Введите год:");
        int year = in.nextInt();
        if (year % 4 == 0 & year % 100 != 0) {
            System.out.println("Год является високосным");
            } else if (year % 100 == 0 & year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }


    }
}
