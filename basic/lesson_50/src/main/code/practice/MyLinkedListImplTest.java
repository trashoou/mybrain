package main.code.practice;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyLinkedListImplTest {
    private MyLinkedListImpl linkedList;

    @Before
    public void setUp() {
        linkedList = new MyLinkedListImpl();
        // Добавьте элементы в список для тестирования
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
    }

    @Test
    public void testReverseLinkedList() {
        MyLinkedList reversed = linkedList.reverseLinkedList();
        // Проверяем, что список был перевернут правильно
        assertEquals("C", reversed.get(0));
        assertEquals("B", reversed.get(1));
        assertEquals("A", reversed.get(2));
    }

    @Test
    public void testReverseLinkedListWithStartIndex() {
        MyLinkedList reversed = linkedList.reverseLinkedList(1);
        // Проверяем, что часть списка была перевернута правильно
        assertEquals("B", reversed.get(0));
        assertEquals("C", reversed.get(1));
        assertEquals(null, null);
    }

    @Test
    public void testReverseLinkedListWithStartAndEndIndex() {
        MyLinkedList reversed = linkedList.reverseLinkedList(0, 2);
        // Проверяем, что заданный участок списка был перевернут правильно
        assertEquals("B", reversed.get(0));
        assertEquals("A", reversed.get(1));
        assertEquals("C", reversed.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInvalidStartIndex() {
        linkedList.reverseLinkedList(5); // Попытка перевернуть с неверным startIndex
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInvalidStartAndEndIndex() {
        linkedList.reverseLinkedList(2, 0); // Попытка перевернуть с неверными индексами
    }
}
