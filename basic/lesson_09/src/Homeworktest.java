import java.util.Scanner;

public class  Homeworktest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the text");
        String text = in.nextLine();

        System.out.println("Enter the number of repetitions");
        int n = in.nextInt();
        int i = 0;

        while (n >= i) {
            System.out.println(text);
            i++;
        }

    }
}