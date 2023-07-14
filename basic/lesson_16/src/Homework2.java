public class Homework2 {
    public static void main(String[] args) {
//Задан массив целых чисел {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}.
//Найдите среднюю величину по всем элементам массива с четными индексами.
        int[] numbers = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};
        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i += 2) {
            sum += numbers[i];
            count++;
        }

        double average = (double) sum / count;
        System.out.println("Average of elements with even indexes: " + average);
    }
}