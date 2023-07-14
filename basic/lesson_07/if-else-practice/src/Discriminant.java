import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        System.out.println("If - else practice - square equation");
//Задание 4:
//Решение квадратного уравнения по коэффициентам квадратного трехчлена а, b и с.

        Scanner in = new Scanner(System.in);
        System.out.println("Input 1rd coefficient");
        int a = in.nextInt();
        System.out.println("Input 2rd coefficient");
        int b = in.nextInt();
        System.out.println("Input 3rd coefficient");
        int c = in.nextInt();

        int d = b*b - 4 * a * c; // calculate discriminant

        if (d < 0 ) {
            System.out.println("There are no roots, d is negative. " +d);
        } else if (d == 0) {
            double x = -b / (2*a);
            System.out.println("X = "+x);
        } else {
            double x1 = (-b + Math.sqrt(d))/(2 * a);
            double x2 = (-b - Math.sqrt(d))/(2 * a);
            System.out.println("X1 = " + x1 + ", X2 = " + x2);
            System.out.println("Thanks and goodbye!");
        }

    }
}
