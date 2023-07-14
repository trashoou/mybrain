public class Homeowork2 {
    public static void main(String[] args) {

//Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
//Найдите максимальный элемент массива и его индекс.
        int[] marks = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        int max = marks[0];
        int maxIndex = 0;

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимальниый элемент: "+max);
        System.out.println("Индекс максимального элемента: "+maxIndex);
    }

}

