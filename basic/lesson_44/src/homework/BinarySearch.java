package homework;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Тест 1: Поиск существующего элемента
        assert binarySearch(arr, 6) == 5;

        // Тест 2: Поиск несуществующего элемента
        assert binarySearch(arr, 11) == -1;

        // Тест 3: Поиск в пустом массиве
        assert binarySearch(new int[]{}, 5) == -1;

        // Тест 4: Поиск в массиве из одного элемента
        assert binarySearch(new int[]{7}, 7) == 0;

        System.out.println("Все тесты успешно пройдены!");
    }
}
