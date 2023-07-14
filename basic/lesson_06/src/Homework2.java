import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Включили Scanner
        System.out.println("Введите длину радиуса:"); // сообщение пользователю
        double pi = Math.PI; // создаем переменную с числом PI
        double r = in.nextDouble(); // создаем ввод для пользователя типа double

        double s = square(pi, r); // используем метод написанный на 14,15 строке
        System.out.println("Площадь круга = " + s); // выводим результат

    }

    public static double square (double x, double y) { // создаем метод
        return x * (y * y); // создаём функцию метода
    }

}
