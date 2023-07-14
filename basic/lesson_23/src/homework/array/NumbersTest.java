package homework.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    Numbers numbers;

    @BeforeEach
    void setUp() {
        numbers = new Numbers(0);
    }

    @Test
    void printNegativeArrayTest() {
        int[] n = {-1,2,-3,4,-5};
        assertEquals(3,numbers.printNegativeArray(n));
    }

    @Test
    void printPositiveArrayTest() {
        int[] n = {-1,2,-3,4,-5};
        assertEquals(2,numbers.printPositiveArray(n));
    }

    @Test
    void printEvenArrayTest() {
        int[] n = {-1,2,-3,4,-5};
        assertEquals(2,numbers.printEvenArray(n));
    }

    @Test
    void printZeroArrayTest() {
        int[] n = {-1,2,-3,4,-5};
        assertEquals(0,numbers.printZeroArray(n));
    }
}