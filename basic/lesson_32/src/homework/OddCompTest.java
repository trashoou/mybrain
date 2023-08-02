package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OddCompTest {

    @Test
    void OddCompTest() {
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(numbers,new OddComp());
        printArray(numbers);
    }

    public void printArray (Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" | ");
        }
    }
}