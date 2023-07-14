import java.io.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)  throws IOException {

        //Вычислите площадь квадрата и объем куба со стороной а.
        //Значение a запросить у пользователя.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // инициализация - включаем BR для чтения

        System.out.println("Введите сторону квадрата: ");
        String num1 = br.readLine(); // читаем в переменную типа String
        System.out.println("Сторона равна: " + num1);

        int n1 = Integer.parseInt(num1);

        System.out.println("Площадь квадрата: " + n1 + "умноженное на " + n1); // сообщение возможно лишнее
        int s = n1 * n1;
        System.out.println("Площадь квадрата равна: " + s); //вычислили площадь

        System.out.println("а объем куба: ");
        //BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сторону куба: ");
        String num2 = br.readLine();
        System.out.println("Ребро куба ровно: " + num2 );
        int n2 = Integer.parseInt(num2);

        // int v = n2 * n2 * n2;
        double v = (int)Math.pow(n2, 3); // тоже так можно вычислить

        System.out.println("Объем куба равен: " + n2 + " умноженное на " + n2 + " и " + " умноженное ");

        System.out.println("Арифметические действия и класс Math");

        int i = 0;
        i++; // увеличение значения i на 1
        i = i +1;
        System.out.println(i);

    }
}