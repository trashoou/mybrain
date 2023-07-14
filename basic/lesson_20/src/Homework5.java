public class Homework5 {
    public static void main(String[] args) {
        // Заданный массив
        int[] array = {64, -13, 28, 37, 12, -17, 25, 18, -3, 40};

        // Вызов функции сортировки
        bubbleSort(array);

        // Вывод отсортированного массива
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
//________Methods________
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Обмен значениями
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
