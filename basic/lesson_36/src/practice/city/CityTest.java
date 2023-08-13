package practice.city;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CityTest {
    // вызвать тестируемый класс
    City[] cities;

    @BeforeEach
    void setUp() {
        // создать тестовый набор данных

        cities = new City[6]; // создаем массив

        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);
    }

    @Test
    void testCopyOfRange() {
        printArray(cities,"Original array");

        City[] citiesCopyRange = Arrays.copyOfRange(cities,1,cities.length-1);
        printArray(citiesCopyRange,"cities Range copy");
    }

    @Test
    void testSystemArrayCopy() {
        printArray(cities,"Original array");
        City[] citiesCopy = new City[cities.length * 2]; // объявили массив, увеличил его размер в 2 раза
        System.arraycopy(cities,1,citiesCopy,6,cities.length - 2);
        printArray(citiesCopy,"System.arraycopy");

    }

    @Test
    void testInsertAndKeepSorted() {
        printArray(cities,"Original order");
        Arrays.sort(cities);
        printArray(cities,"Natural order");
        City city = new City("SanFrancisco",690_000);
        // откопировать массив в новый массив с длиной + 1
        City[] citiesCopy = Arrays.copyOf(cities,cities.length+1);
        // найти индекс для вставляемого города с помощью BinarySearch
        int index = Arrays.binarySearch(citiesCopy,0,citiesCopy.length-1, city);
        System.out.println(index);
        // определить реальный индекс, на какое место вставлять новый город
        index = index >= 0 ? index : - index - 1; // позиция куда вставлять - см.теорию прошлого урока
        // сдвинуть весь массив вправо на 1 позицию (освобождаем место новому городу)
        System.arraycopy(citiesCopy, index, citiesCopy, index + 1,citiesCopy.length-index-1);
        // поставить новый город на нужное место
        citiesCopy[index] = city;
        // сделать массив опять с именем cities
        cities = citiesCopy;
        // напечатать полученный массив
        printArray(cities,"Order after insert new city");

    }



    // метод для печати массива + строка-анонс списка
    private void printArray(Object[] arr, String title) {
        System.out.println("===== " + title + " =====");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }



}