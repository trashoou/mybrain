import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {
        //Задача 1
//Программа получает на вход строку и число повторений этой строки
//Программа должна вывести эту строку нужное количество раз.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String st = in.nextLine();
        System.out.println("Введите желаемое количество повторений: ");
        int n = in.nextInt();
        int o = 0;
        while (n > o) {
            System.out.println(st);
            o++;
        }
    }
}
