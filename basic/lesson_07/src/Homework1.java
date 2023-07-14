import java.util.Scanner;
public class Homework1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 сторону треугольника:");
        double a = in.nextInt();
        System.out.println("Введите 2 сторону треугольника:");
        double b = in.nextInt();
        System.out.println("Введите 3 сторону треугольника:");
        double c = in.nextInt();

        if (a+b > c && b+c > a) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольника с такими сторонами не существует.");
        }
    }

}