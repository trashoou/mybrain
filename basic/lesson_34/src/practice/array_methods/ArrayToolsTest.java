package practice.array_methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.model.Soldier;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsTest {
    Integer[] arrNum;
    String[] arrStr;
    Soldier[] soldiers;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[] {9, 7, 4, 7, 2, 5, 9, 1, 0};
        arrStr = new String[] {"one", "two", "three", "four", "five"};
        soldiers = new Soldier[]{
                new Soldier("John",182,82.3,91),
                new Soldier("Peter",175,77.1,75),
                new Soldier("Robin",182,69.3,92),
                new Soldier("Mary",159,55.1,91),
                new Soldier("Anna",175,55.0,88)
        };
    }

    @Test
    void testPrintArray() {
        System.out.println("==========testPrintArray==========");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);
        ArrayTools.printArray(soldiers);
    }

    @Test
    void testSearch() {
        System.out.println("==========testSearch==========");
        //для целых чисел
        System.out.println("--for Integer--");
        ArrayTools.printArray(arrNum);
        Integer res = ArrayTools.search(arrNum,7);
        System.out.println(res);
        assertEquals(1,res);
        assertEquals(-1,ArrayTools.search(arrNum,100));
        // для строки
        System.out.println("--for String--");
        ArrayTools.printArray(arrStr);
        int index = ArrayTools.search(arrStr,"four");
        assertEquals(3,index);
        assertEquals(-1,ArrayTools.search(arrStr,"six"));
        // для Soldiers
        System.out.println("--for Soldiers--");
        ArrayTools.printArray(soldiers);
        Soldier testSoldier = new Soldier("Anna",162,55.0,88);
        int indexOfSoldier = ArrayTools.search(soldiers,testSoldier);
        assertEquals(4,indexOfSoldier);
    }

    @Test
    void searchBoolean() {
    }

    @Test
    void findByPredicate() {
        System.out.println("==========testFindByPredicate==========");
        // для целых чисел
        ArrayTools.printArray(arrNum);
        Integer res = ArrayTools.findByPredicate(arrNum, n -> n > 5 && n < 10 );
        System.out.println(res);
        res = ArrayTools.findByPredicate(arrNum, n -> n%2 == 0);
        System.out.println(res);
        // Для строк
        ArrayTools.printArray(arrStr);
        String str = ArrayTools.findByPredicate(arrStr, s -> s == "two");
        System.out.println(str);
        assertEquals("two", str);
        str = ArrayTools.findByPredicate(arrStr,s -> s.length() == 5);
        System.out.println(str);
        //для Soldier
        ArrayTools.printArray(soldiers);
        Soldier soldier = ArrayTools.findByPredicate(soldiers, soldier1 -> soldier1.getHeight()< 180);
        System.out.println(soldier);
        assertEquals(soldiers[1],soldier);
    }

    @Test
    void testBubbleSort() {
        System.out.println("===========testBubbleSort===========");
        ArrayTools.printArray(arrNum);
        ArrayTools.bubbleSort(arrNum);
        ArrayTools.printArray(arrNum);
        Integer[] expected = new Integer[] {0, 1, 2, 4, 5, 7, 7, 9, 9};
        assertArrayEquals(expected,arrNum);
        ArrayTools.bubbleSort(arrStr);
        ArrayTools.printArray(arrStr);
        ArrayTools.printArray(soldiers);
        ArrayTools.bubbleSort(soldiers);
        ArrayTools.printArray(soldiers);
    }

    @Test
    void testBubbleSortComparator() {
        System.out.println("===========testBubbleSort===========");
//        ArrayTools.printArray(soldiers);
//        //Arrays.sort(soldiers, (s1, s2 -> s1.getName().compareTo(s2.getName()));
//        Comparator<Soldier> comparator = new Comparator<Soldier>() {
//            @Override
//            public int compare(Soldier o1, Soldier o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        };
//        ArrayTools.bubbleSort(soldiers, comparator);
//        ArrayTools.printArray(soldiers);
        ArrayTools.printArray(arrNum);
        ArrayTools.bubbleSort(arrNum,Integer::compareTo);
        ArrayTools.printArray(arrNum);

        ArrayTools.printArray(arrStr);
        ArrayTools.bubbleSort(arrStr,String::compareTo);
        ArrayTools.printArray(arrStr);
    }

    @Test
    void testCompareHeight_Weight(){
        System.out.println("=========Unsorted array=========");
        ArrayTools.printArray(soldiers);
        Comparator<Soldier> comparator = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                int compareHeight = -(o1.getHeight() - o2.getHeight());
                if (compareHeight != 0) {
                    return compareHeight;
                } else {
                    return (int) -(o1.getWeight() - o2.getWeight());
                }
            }
        };
        Arrays.sort(soldiers,comparator);
        System.out.println("=========Sorted array=========");
        ArrayTools.printArray(soldiers);

    }
}