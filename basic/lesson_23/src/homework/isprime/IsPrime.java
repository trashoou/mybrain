package homework.isprime;

public class IsPrime {
    private int num;

    public IsPrime(int num) {
        this.num = num;
    }

    public boolean isPrimeNumber(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) { // эффективное сокращение количества циклов в цикле for
            if (n % i == 0) { // если хотя бы раз разделилось, то
                isPrime = false;// объявим, что число НЕпростое и можно выйти из цикла
            }

        }
        return isPrime;
    }
}
