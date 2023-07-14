public class Homework3 {
    public static void main(String[] args) {
//Задача 3. На столе лежат n монеток.
// Некоторые из них лежат вверх решкой, а некоторые – гербом.
// Определите минимальное число монеток, которые нужно перевернуть,
// чтобы все монетки были повернуты вверх одной и той же стороной.

        int[] coin = {1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1};
        System.out.println("1 = Орел | 0 = Решка");
        for (int i = 0; i < coin.length; i++) {
            System.out.print(coin[i]+" | ");
        }
        System.out.println();
        // 1 = орел; 0 = решка;

        // нахождение кол-ва монет орла/решки
        int count1 = 0;
        int count0 = 0;
        for (int i = 0; i < coin.length; i++) {
            if (coin[i] == 1) {
                count1++;
            }
            if (coin[i] == 0) {
                count0++;
            }
        }
        // проверка, если 1 - орла, меньше чем 0 - решки, переворачиваем монетку на сторону решки
        if (count1 < count0) {
            for (int i = 0; i < coin.length; i++) {
                if (coin[i] == 1) {
                    coin[i] = 0;
                }
            }
            System.out.println("Минимальное число монеток, которые нужно перевернуть: "+count1);
        }
        // проверка, если 0 - решки, меньше чем 1 - орла, переворачиваем монетку на сторону орла
        if (count0 < count1) {
            for (int i = 0; i < coin.length; i++) {
                if (coin[i] == 0) {
                    coin[i] = 1;
                }
            }
            System.out.println("Минимальное число монеток, которые нужно перевернуть: "+count0);
        }
        // вывод массива
        for (int i = 0; i < coin.length; i++) {
            System.out.print(coin[i]+" | ");
        }
    }
}
