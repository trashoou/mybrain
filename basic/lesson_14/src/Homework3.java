public class Homework3  {
    public static void main(String[] args) {
        // Хозяйка налепила для гостей 30 пельменей.
        // В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
        // Напишите программу, которая ищет счастливый пельмень.

        int[] pelimen = new int[30];
        int a = 25, b = 35;
        int luckyPelmenNumber = (int) (Math.random() * pelimen.length - 1) + 1;
        int monetka = 15;
        int result = 0;

        for (int i = 0; i < pelimen.length; i++) {
            pelimen[i] = (int) (Math.random() * (b - a + 1) + a);

            if (i == luckyPelmenNumber) {
                result = pelimen[i] + monetka;
                pelimen[i] += monetka;
            }

            System.out.print("| " + (i + 1) + " Пельмень = " + pelimen[i] + " Грамм ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }

        System.out.println(luckyPelmenNumber + 1 + " пельмень является счастливым, с весом " + result + " грамм.");
    }
}

