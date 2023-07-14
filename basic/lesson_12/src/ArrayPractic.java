import java.util.Arrays;
public class ArrayPractic {
    public static void main(String[] args) {
        System.out.println("Array practice");
//Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
//Найдите минимальный элемент массива и его индекс.

        int[] marks = {-7, 2, 5, 48, 5, 3, 5, 4, 1};

        int l = marks.length;
        System.out.println("Длина массива: "+l);

        //System.out.println(Arrays.toString(marks)); // так распечатается ссылка в памяти на массив
        int maxIndex = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[4]+ " | ");
            maxIndex = i;
        }
        System.out.println();
        System.out.println("====================");
        System.out.println(marks[3]);
        System.out.println("====================");
        System.out.println("last index: "+maxIndex);

    }
}
