import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Calculator");
//Написать приложение-калькулятор для 4-х математических действий: +, -, *, /
// Использовать switch ... case на основе int, char

        Scanner in = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        int a = in.nextInt();
        System.out.println("Input 2st number: ");
        int b = in.nextInt();
        System.out.println("Choose operation +, -, *,/ ");
        char operation = in.next().charAt(0); //read number of operation

        switch (operation) {
            case 1 :{
                System.out.println("Sum is " + (a+b));
                break;
            }
            case 2: {
                System.out.println("Subtraction is " + (a-b));
                break;
            }
            case 3: {
                System.out.println("Multiplication is " + (a*b));
                break;
            }
            case 4: {
                System.out.println("Division is " + (a/b));
                break;
            }
            default: {
                System.out.println("Wrong input!");
            }
        } // end of switch

    }
}
