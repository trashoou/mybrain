package homework.duplicate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateFinderTest {

    @Test
    void testCountDuplicatesSwitchCase() {
        int[] array = {1,2,3,4,5,5,6,7,8,8,9,10};
        int numberToCheck = 5;
        int duplicatesCount = DuplicateFinder.countDuplicatesSwitchCase(array,numberToCheck);
        assertEquals(2,duplicatesCount);
    }
}