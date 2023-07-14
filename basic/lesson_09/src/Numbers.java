import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
//Пользователь вводит натуральное число (целое, положительное).
//Выясните, сколько цифр в числе.

        Scanner in = new Scanner(System.in);
        System.out.println("Input integer and positive number");
        int n = in.nextInt();

        // Алгоритм:
        //нужно число делить нацело на 10 до тех пор пока частное больше 0 (целочисленное деление)
        //245/10 = 24
        //24/10 = 2
        //2/10 = 0 целых
        //на каждом шагу увеличиваем счетчик на 1

        int count = 0;
        int div = n;

        while (div > 0) {
            div = div/10;
            count++;
            System.out.println(count);
        }
        System.out.println("Number of digits is: "+count);
    }
}
