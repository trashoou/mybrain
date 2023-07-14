import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
//В сберкассу на трёхпроцентный вклад положили S рублей.
// Какой станет сумма вклада через N лет?
        Scanner in = new Scanner(System.in);
        System.out.println("Введите предпочитаемую сумму вклада(руб.):");
        double sum = in.nextInt();
        System.out.println("На сколько лет вы бы хотели вложить сумму:");
        double year = in.nextInt();
        double sum1 = sum;
        while (year>0) {
            sum1 = (sum1 /100) * 3;
            sum = sum + sum1;
            year--;
        }
        System.out.println("Ваша сумма через 5 лет: "+sum);
    }
}