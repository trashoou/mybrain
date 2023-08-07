package practice.array_methods;

import java.util.function.Predicate;

public class ArrayTools {
    // печать массива
    public static void printArray(Object[] arr) {
        for (Object element : arr) {
            System.out.println(element);
        }
        System.out.println("================");
    }

    // поиск объекта в массиве объекта
    public static int search (Object[] arr, Object value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }


    // поиск объекта в массиве объекта возвращает boolean
    public static boolean searchBoolean (Object[] arr, Object value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    // поиск объектов по условию
    public static <T> T findByPredicate(T[] arr, Predicate<T> predicate) { // метод возвращает тип T, из массива типа T[], отбор по предикату
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])) {
                return arr[i];
            }
        }
        return null;
    }

}
