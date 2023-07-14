import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое число из 5 цифр: ");
        String num = br.readLine();
        System.out.println("первая цифра: " + num.charAt(0) + " вторая цифра: " + num.charAt(1) + " третья цифра: " + num.charAt(2) + " четвертая цифра: " + num.charAt(3) + " пятая цифра: " + num.charAt(4));

        System.out.println("Введите длину прямоугольника: ");
        String num1 = br.readLine();
        System.out.println("Вы ввели " + num1 + " - это длина прямоугольника");
        int n1 = Integer.parseInt(num1);

        System.out.println("Введите ширину прямоугольинка: ");
        String num2 = br.readLine();
        System.out.println("Вы ввели " + num2 + " - это ширина прямоугольника");
        int n2 = Integer.parseInt(num2);
        //ПЕРВОЕ И ВТОРОЕ ЗАДАНИЕ НИЖЕ ЗАКОМЕНТИРОВАНО

        //System.out.println("Периметр прямоугольника = " + (n1 + n2)*2 );
        //System.out.println("Площадь прямоугольника = " + (n1 * n2));

    }
}