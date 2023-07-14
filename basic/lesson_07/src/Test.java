import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //запросить у пользователя стороны треугольника
        System.out.println("Введите длину первой стороный треугольника: ");
        double side1 = scanner.nextDouble();
        System.out.println("Введите длину второй стороный треугольника: ");
        double side2 = scanner.nextDouble();
        System.out.println("Введите длину третьей стороный треугольника: ");
        double side3 = scanner.nextDouble();

        // проверить выполнимость неравенства треугольника
        if (side1 < side2 + side3 && side2 < side1 + side3 && side3 <side1 + side2) {
            // вычислить углы треугольника
            double angle1 = Math.toDegrees(Math.acos((side2 * side2 + side3 * side3 - side1 * side1)/(2 * side2 *side3)));
            double angle2 = Math.toDegrees(Math.acos((side1 * side1 + side3 * side3 - side2 * side2)/(2 * side1 *side3)));
            double angle3 = 180 - angle1 - angle2;

            // Проверить, что все углы меньше 90 градусов
            if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                System.out.println("Треугольник с введенными сторонами существует.");
                System.out.println("Углы треугольника (в градусах):");
                System.out.println("Угол 1: " + angle1);
                System.out.println("Угол 2: " + angle2);
                System.out.println("Угол 3: " + angle3);
            } else {
                System.out.println("Треугольник с введенными сторонами не существует.");
            }
        } else {
            System.out.println("Треугольник с введенными сторонами не существует.");
        }
    }
}
