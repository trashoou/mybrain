public class Homework2 {
    public static void main(String[] args) {
//Хозяйка налепила для гостей 30 пельменей, каждый весом от 25 до 35 грамм.
// Напишите программу, которая занесет в массив данные о весе каждого слепленного пельменя.
        int[] pelimen = new int[30];
        int a = 25, b = 35;
        for (int i = 0; i < pelimen.length; i++) {
            pelimen[i] = (int)(Math.random() * (b - a + 1) + a);
            System.out.print((i+1)+" Пельмень = "+pelimen[i]+" Грамм | ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }
}
