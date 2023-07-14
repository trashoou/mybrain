package homework.isprime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPrimeTest {

    IsPrime isPrime;

    @BeforeEach
    void setUp() {
        isPrime = new IsPrime(0);
    }

    @Test
    void isPrimeNumberTest() {
        int num = 7;
        assertTrue(isPrime.isPrimeNumber(num));
    }
}