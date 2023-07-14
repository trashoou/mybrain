import java.util.Scanner;
public class Zada4a_5 {
    public static void main(String[] args) {
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

        System.out.println("Вы взяли " + Meat1 + " кг мяса и " + Kartoffel1 + " кг картофеля");
        System.out.println("Итоговая стоимость покупки = " + (MeatAndKartoffel2 - MeatAndKartoffel1));
        System.out.println("Итоговая сумма скидки = " + MeatAndKartoffel1);
    }
}