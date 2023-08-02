package homework.duplicate;

public class DuplicateFinder {
    public static int[] generateRandomArray(int size, int maxNumber) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * maxNumber) + 1;
        }
        return array;
    }

    public static int countDuplicatesSwitchCase(int[] array, int number) {
        int count = 0;
        for (int num : array) {
            switch (num) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    if (num == number) {
                        count ++;
                    }
                    break;
                default:
                    break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(120/4);
    }
}
