import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    //Задача 1.
    // Вычислите гипотенузу по двум катетам. Длину катетов запросите у пользователя.
//        System.out.println("Вычисление гипотенузы по двум катетам ");
//        System.out.println("Введите первый катет: ");
//        double A = in.nextDouble();
//        System.out.println("Введите второй катет: ");
//        double B = in.nextDouble();
//        double C = Math.sqrt(A*A + B*B);
//        System.out.println("Гипотенуза равна: " + C);
    // 3 * 3 = 9
    // 4 * 4 = 16
    // 9 + 16 = 25
    // корень 25 = 5
    //  9 = 3 , 16 = 4

    //Задача 2.
    //Написать программу для перевода градусов по Фаренгейту в шкалу Цельсия.
    //Формула для перевода С = 5*(F-32)/9
//        System.out.println("Перевод градусов по Фаренгейту в шкалу Цельсия.");
//        System.out.println("Введите градус Фаренгейта: ");
//        double F = in.nextDouble();
//        double C;
//        C = 5*(F-32)/9;
//        System.out.println(F + " градуса по Фаренгейту = " + C + " Цельсия");
    //Задача 3.
    //Вычислите площадь треугольника по формуле Герона: p = (a + b + с)/2;
    //                                                  S = sqrt(p*(p-a)(p-b)(p-c));
    // a и b  не больше c
//        System.out.println("Вычисляем площадь треугольника по формуле Герона ");
//        double a, b, c, p, s;
//        a = 4; b = 5; c = 2;
//        p = (a + b + c)/2;
//        s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
//        System.out.println("a = "+a+" b = "+b+" c = "+c);
//        System.out.println("Периметр треугольника = "+p);
//        System.out.println("Площадь треугольника = "+s);
    //Задача 4

        System.out.println("Введите коэффициенты для уравнения");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите a, b и c: ");
        double a, b, c;
        double D;
        a = in.nextDouble(); b = in.nextDouble(); c = in.nextDouble();
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = "+x);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней!");
        }

    }
}
