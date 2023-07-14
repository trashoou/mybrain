import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Запросить у пользователя три стороны треугольника. Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше суммы двух других.
         Сообщить результат пользователю - существует или нет треугольник с введенными сторонами.

         Дополнить задачу о сумме углов треугольника контролем, что вводимые углы не больше 90 градусов.
         */

        System.out.println("Введите длину первой стороны треугольника:");
        double side1 = scanner.nextDouble();

        System.out.println("Введите длину второй стороны треугольника:");
        double side2 = scanner.nextDouble();

        System.out.println("Введите длину третьей стороны треугольника:");
        double side3 = scanner.nextDouble();

        double angle1 = Math.toDegrees(Math.acos((side2 * side2 + side3 * side3 - side1 * side1) / (2 * side2 * side3)));
        double angle2 = Math.toDegrees(Math.acos((side1 * side1 + side3 * side3 - side2 * side2) / (2 * side1 * side3)));
        double angle3 = Math.toDegrees(Math.acos((side1 * side1 + side2 * side2 - side3 * side3) / (2 * side1 * side2)));

        boolean triangleExists = angle1 + angle2 + angle3 == 180;
        if (side1 < side2 + side3 && side2 < side1 + side3 && side3 <side1 + side2) {


            if (triangleExists) {
                System.out.println("Треугольник с введенными сторонами существует.");
                System.out.println("Угол 1: " + angle1 + " градусов");
                System.out.println("Угол 2: " + angle2 + " градусов");
                System.out.println("Угол 3: " + angle3 + " градусов");
            }
            else {
                System.out.println("Треугольник с введенными сторонами не существует.");
            }
        } else {
            System.out.println("Треугольник с введенными сторонами не существует.");
            }



    }
}
