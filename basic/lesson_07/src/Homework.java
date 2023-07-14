import java.util.Scanner;
public class Homework {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 сторону треугольника:");
        double a = in.nextInt();
        System.out.println("Введите 2 сторону треугольника:");
        double b = in.nextInt();
        System.out.println("Введите 3 сторону треугольника:");
        double c = in.nextInt();
        double adegrees = (Math.toDegrees(Math.acos(a/c)));
        double bdegrees = (Math.toDegrees(Math.asin(b/c)));
        if ((a+b > c & b+c > a)&(a/c < 1 & b/c < 1)) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольника с такими сторонами не существует.");
        }

        System.out.println(adegrees);
        System.out.println(bdegrees);
        System.out.println(180-(adegrees+bdegrees));

    }

}
