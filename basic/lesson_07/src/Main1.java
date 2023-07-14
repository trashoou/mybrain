import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(" If- else practice -Next ");


        //Сделайте расчет покупки товаров со скидками.
        // Стоимость, количество товаров и скидку на них вводит пользователь.
        // Товар А стоит X руб и на него скидка D%, а товар B стоит Y руб и на него скидка С%.
        // Клиент взял N товаров A и M товаров B. Программа не должна допускать ввода отрицательных чисел.
        // Выведите итоговую стоимость покупки и полученной скидки.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество купленного товара А");
        double n = scanner.nextDouble();
        System.out.println("Введите величину стоимости товара Х ");
        double x = scanner.nextDouble();
        System.out.println("Введите скидку на товар А");
        double d1 = scanner.nextDouble();
        if (n > 0 & x > 0 & d1 > 0) {
            double summaA = n * x * (100 - d1) / 100;


            System.out.println("Введите количество купленного товара B");
            double m = scanner.nextDouble();
            System.out.println("Введите величину стоимости товара Y ");
            double y = scanner.nextDouble();
            System.out.println("Введите скидку на товар B");
            double d2 = scanner.nextDouble();
            if (m > 0 & y > 0 & d2 > 0) {
                double summaB = m * y * (100 - d2) / 100;

                double summaAB = summaA + summaB;
                double summaD3 = m * x * d1 / 100 + n * y * d2 / 100;
                System.out.println("Общая стоимость покупки равна:" + summaAB);
                System.out.println("Общая стоимость скидки равна:" + summaD3);

            }
        }

    }
}