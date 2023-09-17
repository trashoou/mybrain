package practice;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListImplTest {
    private MyLinkedListImpl myList;

    @BeforeEach
    public void setUp() {
        myList = new MyLinkedListImpl();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");
    }

    @Test
    public void testReverseLinkedList() {

        MyLinkedListImpl reversedList = myList.reverseLinkedList();

        // Проверяем, что список перевернут правильно
        assertArrayEquals(new String[]{"E", "D", "C", "B", "A"}, reversedList.toArray());
    }

    @Test
    public void testReverseLinkedListWithStartIndex() {
        MyLinkedListImpl reversedList = myList.reverseLinkedList(2);

        // Проверяем, что список перевернут с учетом startIndex
        assertArrayEquals(new String[]{"C", "B", "A", "D", "E"}, reversedList.toArray());
    }

    @Test
    public void testReverseLinkedListWithStartAndEndIndex() {
        MyLinkedListImpl reversedList = myList.reverseLinkedList(1, 4);

        // Проверяем, что список перевернут с учетом startIndex и endIndex
        assertArrayEquals(new String[]{"A", "D", "C", "B", "E"}, reversedList.toArray());
    }
}
