import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
// Задача 3 -
//Сделайте расчет покупки товаров со скидками. Стоимость, количество товаров и скидку на них вводит пользователь.
//Товар А стоит X руб и на него скидка D%, а товар B стоит Y руб и на него скидка С%. Клиент взял N товаров A и M товаров B.
//Программа не должна допускать ввода отрицательных чисел. Выведите итоговую стоимость покупки и полученной скидки.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите стоимость мяса: ");
        double Meat = in.nextInt();
        System.out.println("Сколько вам нужно мяса: ");
        double Meat1 = in.nextInt();
        System.out.println("Введите скидку на мясо: ");
        double Meat2 = in.nextInt();
        System.out.println("Введите стоимость картофеля: ");
        double Kartoffel = in.nextInt();
        System.out.println("Сколько вам нужно картофеля: ");
        double Kartoffel1 = in.nextInt();
        System.out.println("Введите скидку на картофель: ");
        double Kartoffel2 = in.nextInt();
        double MeatResult, KartoffelResult, MeatAndKartoffel2, MeatAndKartoffel1;
        MeatResult = Meat * Meat1 * Meat2/100;
        KartoffelResult = Kartoffel * Kartoffel1 * Kartoffel2/100;
        MeatAndKartoffel1 = MeatResult + KartoffelResult;
        MeatAndKartoffel2 = Meat * Meat1 + Kartoffel * Kartoffel1;


        if (Meat > 0 & Meat1 > 0 & Meat2 > 0 & Kartoffel > 0 & Kartoffel1 > 0 & Kartoffel2 > 0) {
            System.out.println("Вы взяли " + Meat1 + " кг мяса и " + Kartoffel1 + " кг картофеля");
            System.out.println("Итоговая стоимость покупки = " + (MeatAndKartoffel2 - MeatAndKartoffel1));
            System.out.println("Итоговая сумма скидки = " + MeatAndKartoffel1);
        } else {
            System.out.println("Недопустим ввод отрицательных чисел.");
        }
    }
}