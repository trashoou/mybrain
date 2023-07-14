public class Homework4 {
    public static void main(String[] args) {
//Найти произведение двузначных нечетных чисел кратных 13.
        int i = 1;
        int k = 13;
        int lastk = 99;
        int odd = 2;
        while (k <= lastk) {
            if (k % 13 == 0) {
                i *= k;
            }
            k += odd;
        }
        System.out.println("Произведение двузначных нечетных чисел, кратных 13 = "+i);

    }
}


