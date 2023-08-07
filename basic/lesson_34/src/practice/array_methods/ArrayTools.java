package practice.array_methods;

import java.util.Comparator;
import java.util.function.Predicate;

public class ArrayTools {
    // печать массива
    public static void printArray(Object[] arr) {
        for (Object element : arr) {
            System.out.println(element);
        }
        System.out.println("==================================");
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

    // bubbleSort
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) { // Этот метод применик к типам (классам), в которых есть Comparable<T>
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0){ // результат сравнения двух соседних элементов > 0
                    // перестановка элементов массива местами
                    T t =arr[j]; // уберегли j-ый элеммент от затирания, убрав его во временную переменную
                    arr[j] = arr[j + 1]; // j+1 - элемент перенесли в j-ый
                    arr[j + 1] = t; // в j+1 - элемент поставили t
                }
            }
        }
    }
    // bubbleSort by Comparator

    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (comparator.compare(arr[j],arr[j + 1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

}
