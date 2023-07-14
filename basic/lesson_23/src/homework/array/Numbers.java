package homework.array;

public class Numbers {

    // поля класса
    private int num;

    // конструктор


    public Numbers(int num) {
        this.num = num;
    }

    // методы класса
    public int getNum() {return num;}
    public void setNum(int num) {this.num = num;}

    public void randomArray () {
        int [] num = new int[10];
        int a = -10;
        int b = 10;
        for (int i = 0; i < num.length; i++) {
            int n = (int)(Math.random() * (b - a + 1) + a);
            num[i] = n;
        }
    }

    public void printArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"|");
        }
    }
    public int printNegativeArray (int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        System.out.println("Кол-во отрциательных чисел: "+count);
        return count;
    }
    public int printPositiveArray (int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        System.out.println("Кол-во положительных чисел: "+count);
        return count;
    }
    public int printEvenArray (int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Кол-во четных чисел: "+count);
        return count;
    }
    public int printZeroArray (int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        System.out.println("Кол-во нулей: "+count);
        return count;
    }
}
