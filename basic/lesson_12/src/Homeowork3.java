import java.util.Arrays;
public class Homeowork3 {
    public static void main(String[] args) {

//Создайте массив из 20 случайных целых чисел в интервале от 10 до 20.
// Выведите массив на печать.
// Поменяйте местами первый и последний элементы массива
// и снова выведите массив на печать.
        int[] marks = {11,13,14,16,20,13,15,17,18,19,20,12,14,16,17,18,19,11,12,17};
        System.out.println("Исходный массив: ");
        for (int i = 0; i< marks.length;i++) {
            int out=marks[i];
            System.out.print(out + " ");
        }

        int r = marks[0];
        marks[0] = marks[marks.length-1];
        marks[marks.length-1] = r;
        System.out.println();
        System.out.println("Массив после обмена первого и последнего элементов:");
        System.out.print(Arrays.toString(marks));
    }

}
/*if (marks.length>0) {
            int r = marks[0];
            marks[0] = marks[marks.length-1];
            marks[marks.length-1] = r;
        }*/

