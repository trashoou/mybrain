import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

public class SetIntersectionTest {
    @Test
    public void testIntersection() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        Set<Integer> result = SetIntersection.intersection(set1, set2);

        Set<Integer> expected = new HashSet<>();
        expected.add(2);
        expected.add(3);

        assertEquals(expected, result);
    }

    @Test
    public void testEmptyIntersection() {
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");

        Set<String> set2 = new HashSet<>();
        set2.add("cherry");
        set2.add("date");

        Set<String> result = SetIntersection.intersection(set1, set2);

        Set<String> expected = new HashSet<>();

        assertEquals(expected, result);
    }
}
