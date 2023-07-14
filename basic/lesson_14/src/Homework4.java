public class Homework4 {
    public static void main(String[] args) {
        //Задача 4.(*) (циклы и печать) Распечатать в консоли таблицу умножения.
        int size = 10; // Размер таблицы (от 1 до size)

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int result = i * j;
                System.out.print(i+ " * " + j + " = "+ result + "   \t"); // Выводим результат умножения с табуляцией
            }
            System.out.println(); // Переходим на новую строку после каждого ряда
        }
    }
}

