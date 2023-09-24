package practice;





import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetPracticeTest {


    @Test
    public void testUnknown() {
        // Создаем первое множество
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        set1.add("D");

        // Создаем второе множество
        Set<String> set2 = new HashSet<>();
        set2.add("C");
        set2.add("D");
        set2.add("E");
        set2.add("F");

        // Вызываем метод unknown для получения разности множеств
        Set<String> result = SetPractice.unknown(set1, set2);

        // Ожидаем, что результат будет содержать элементы "A" и "B"
        Set<String> expected = new HashSet<>();
        expected.add("A");
        expected.add("B");

        // Проверяем, что результат совпадает с ожидаемым
        assertEquals(expected, result);
    }
}