package homework.homework2;

import java.util.Random;

public class Duplicate {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10)+1;
            System.out.print(array[i]+" | ");
        }



        int totalDuplicates = 0;

        System.out.println();
        System.out.println("Элементы, которые встретились более одного раза: ");

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            if (array[i] != -1) {
                for (int j = i + 1; j < array.length ; j++) {
                    if (array[i] == array[j]) {
                        count ++;
                        array[j] = -1;
                    }
                }

                if (count > 1) {
                    totalDuplicates += count;
                    System.out.println("Число "+array[i] + " встретилось "+count+" раз.");
                }
            }
        }
        System.out.println("Всего дубликатов: "+ totalDuplicates);
    }
}
