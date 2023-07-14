import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("If - else practice - NEXT - NEXT");
// Задание 3:
//Написать метод, выводящий на экран максимальное из трех целых чисел.
//Числа должны вводится с клавиатуры.
        Scanner in = new Scanner(System.in);
        //Алгоритм:
        //Шаг 1 - объявить переменную max
        //Шаг 2 - присвоим max = a (любую из наших переменных)
        //Шаг 3 - сравним b и max, если b > то max = b
        //Шаг 4 - сравним c и max, если c > то max = b
        
        System.out.println("Input 1rd number");
        int a = in.nextInt();
        System.out.println("Input 2rd number");
        int b = in.nextInt();
        System.out.println("Input 3rd number");
        int c = in.nextInt();

        int maximum = maxABC(a,b,c);


        System.out.println("Max from " + a + ", " + b + ", " + c + " is: " + maximum);
    }
    public static int maxABC(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }
}
