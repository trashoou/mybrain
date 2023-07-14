public class factorial {
    public static void main(String[] args) {
        System.out.println("Factorial calculation");
        int n = 13;
        int f = Factorial(n);
        System.out.println("n! = " +f);
    }
    // Methods
    public static int Factorial (int n) {
        int res = 1; // переменная для накопления результата
        int i = 1; // начальное значение
        while (i < n) {  // пока параметр цикла i меньше n
            res = res * i; // вычисление факториала
            i++; // увеличиваем параметр цикла

        }
        return res;
    }
}
