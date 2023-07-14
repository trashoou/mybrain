public class Main {
    public static void main(String[] args) {
        int product = 1;

        for (int number = 13; number <= 99; number += 2) {
            if (number % 13 == 0) {
                product *= number;
            }
        }

        System.out.println("Произведение двузначных нечетных чисел, кратных 13, равно: " + product);


    }
}