import java.util.Scanner;
public class Homework4 {
    public static void main(String[] args) {
//Вводится шестизначное число (номер автобусного билета).
//Определите, является ли этот билет "счастливым"
//(сумма первых трех цифр равна сумме трех последних цифр).
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер вашего билета(шестизначное число):");
        int numberOfTicket = in.nextInt();

        int[] numbers = new int[6];

        for (int i = 5; i >= 0; i--) {
            numbers[i] = numberOfTicket % 10;
            numberOfTicket /= 10;
        }

        boolean lucky = (numbers[0]+numbers[1]+numbers[2])==(numbers[3]+numbers[4]+ numbers[5]);

        if (lucky) {
            System.out.println("Your ticket is lucky");
        } else {
            System.out.println("Your ticket is unlucky");
        }

    }
}
