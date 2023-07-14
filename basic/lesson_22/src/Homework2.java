import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input hours:");
        long n = in.nextLong();
        int s = 3;
        long ameba = 1;
        long cycle = n/s;
        for (int i = 0; i < cycle; i++) {
            ameba = (ameba*2) + ameba;
        }
        System.out.println("After "+n+" hours there is " + ameba + " amoebas");
    }
}
