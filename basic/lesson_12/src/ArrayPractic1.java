public class ArrayPractic1 {
    public static void main(String[] args) {
        System.out.println("Array practice");
//Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
//Найдите минимальный элемент массива и его индекс.

        int[] numbers = {75, 34, -15, -123, 57, -145, 86, 77, 48, -59};

        int min = numbers[0]; // в качестве минимума пока временно назначили 1-й элеммент массива (под индексом 0)
        int pointer = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min) {
                min = numbers[i]; // находим минимальный элемент
                pointer = i; // сохраняем его номер в переменной pointer
            }
        }
        System.out.println("Минимальный элемент массива: "+min);
        System.out.println("Индекс минимального элемента массива: "+pointer);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " | ");
        }
    }
}
