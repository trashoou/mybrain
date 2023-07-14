public class Main {
    public static void main(String[] args) {
        // sum = 1 + 1/2 + 1/3 + ... + 1/10
        int n = 2; // начальное данное к задаче
        // задаем данные
        double i = 1;
        double sum = 0;
        double result = sumOf(n);
        System.out.println("Sum is: "+result);
        // начинаем цикл
            //while (i<=n) {  // пока параметр цикла i меньше или равен n
                //sum = sum + 1/i; // накапливаем сумму
                i++; // увеличиваем параметр цикла
            //}
        //System.out.println("Sum is: "+result);
    }
    // Methods
    public static double sumOf (double n) {
        double i = 1;
        double sum = 0;
        while (i<=n) {  // пока параметр цикла i меньше или равен n
            sum = sum + 1/i; // накапливаем сумму
            i++; // увеличиваем параметр цикла

        }
        return sum;
    }
}
