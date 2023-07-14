import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//Бизнесмен взял ссуду m тысяч рублей в банке под 10% годовых.
//Через сколько лет его долг превысит s тысяч рублей, если за это время он не будет отдавать долг.

        System.out.print("Введите начальную сумму долга (тысячи рублей): ");
        double m = in.nextDouble();

        System.out.print("Введите заданную сумму, которую долг должен превысить (тысячи рублей): ");
        double s = in.nextDouble();

        System.out.print("Введите годовую процентную ставку (например, 10% = 0.1): ");
        double r = in.nextDouble();

        int years = 0;
        double debt = m;

        while (debt <= s) {
            years++;
            double increase = debt * r;
            debt += increase;
        }

        System.out.println("Долг превысит " + s + " тысяч рублей через " + years + " лет.");
    }
}


