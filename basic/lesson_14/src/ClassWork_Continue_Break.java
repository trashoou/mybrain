public class ClassWork_Continue_Break {
    public static void main(String[] args) {
        //Напечатать каждый второй элемент массива
        //Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
        int[] num = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38}; // задали массив

        for (int i = 0; i < num.length; i++) {
            if (i % 3 == 0) { // проверяем индекс элемента массива на четкость
                continue;
            }
            System.out.print(num[i] + " , ");
        }



        // Найти первый делитель введенного числа
    }
}
