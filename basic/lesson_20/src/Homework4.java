public class Homework4 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int a = -10;
        int b = 10;
        for (int i = 0; i < num.length; i++) {
            int n = (int)(Math.random() * (b - a + 1) + a);
            num[i] = n;
        }
        printArray(num);
        System.out.println();
        printNegativeArray(num);
        printPositiveArray(num);
        printEvenArray(num);
        printZeroArray(num);

    }

    //________Methods________
    public static void printArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" | ");
        }
    }
    public static void printNegativeArray (int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        System.out.println("Кол-во отрциательных чисел: "+count);
    }
    public static void printPositiveArray (int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        System.out.println("Кол-во положительных чисел: "+count);
    }
    public static void printEvenArray (int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Кол-во четных чисел: "+count);
    }
    public static void printZeroArray (int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        System.out.println("Кол-во нулей: "+count);
    }

}
