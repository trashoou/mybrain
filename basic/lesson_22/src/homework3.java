import java.util.Scanner;

import static java.lang.System.exit;

public class homework3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("1 - convert fathoms to meters.");
            System.out.println("2 - convert inches to centimeters.");
            System.out.println("3 - convert feet to meters.");
            System.out.println("4 - convert arshins to meters.");
            System.out.println("5 - convert inches to millimeters.");
            System.out.println("0 - exit.");

            int choice = in.nextInt();

            switch (choice) {
                case 1 : {
                    System.out.println("Input fathoms:");
                    int n = in.nextInt();
                    System.out.println(n + " fathoms = "+fathomsToMeters(n));
                    break;
                }
                case 2 : {
                    System.out.println("Input inches:");
                    int n = in.nextInt();
                    System.out.println(n + " inches = "+inchesToCentimeters(n));
                    break;
                }
                case 3 : {
                    System.out.println("Input feet:");
                    int n = in.nextInt();
                    System.out.println(n + " feet = "+feetToMeters(n));
                    break;
                }
                case 4 : {
                    System.out.println("Input arshins:");
                    int n = in.nextInt();
                    System.out.println(n + " arshins = "+arshinsToMeters(n));
                    break;
                }
                case 5 : {
                    System.out.println("Input inches:");
                    int n = in.nextInt();
                    System.out.println(n + " inches = "+inchesToMillimeters(n));
                    break;
                }
                case 0 : {
                    exit(0);
                    break;
                }
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }

    public static double fathomsToMeters (double n) {
        return n * 2.1366;
    }
    public static double inchesToCentimeters (double n) {
        return n * 2.5;
    }
    public static double feetToMeters (double n) {
        return n * 0.3048;
    }
    public static double arshinsToMeters (double n) {
        return n * 0.7112;
    }
    public static double inchesToMillimeters (double n) {
        return n * 25.3995;
    }
}
