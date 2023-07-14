import java.util.Scanner;

public class Apples {
    public static void main(String[] args) {
//Задача о яблоках (начальное значение 30 яблок).
// Запустить цикл, в котором яблоки беруться из корзины до тех пор,
// пока они там есть. Последнее сообщение: "Яблоки кончились!".
        Scanner in = new Scanner(System.in);
        int apples = 30;

        int howManyApples;


        System.out.println("We have 30 apples in basket");
        while (apples > 0) {
            System.out.println("How many apples you want to take?");
            howManyApples = in.nextInt();
            apples = apples - howManyApples; // apples = apples - 1;
            System.out.println("In basket left "+apples+"apples.");
        } //end of while
        System.out.println("There is no apple left. Basket is empty.");

    }
}
