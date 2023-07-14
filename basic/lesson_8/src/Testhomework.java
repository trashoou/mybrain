import java.util.Scanner;

public class Testhomework {
    public static void main(String[] args) {

        System.out.println("Discount for goods");

        Scanner in = new Scanner(System.in);

        System.out.println("Первый угол");
        double a = in.nextInt();
        System.out.println("Второй угол");
        double b = in.nextInt();
        System.out.println("Третий угол");
        double c = in.nextInt();

        if (a <=90 && b <= 90 && c <= 90) {
            double sum = a + b + c;

            if (sum ==180) {
                System.out.println("Треугольник существует");
            } else {
                System.out.println("Треугольник не существует");
            }
        }
    }
}