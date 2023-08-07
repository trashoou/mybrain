package practice.city;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {
// вызвать тестируемый класс

    City[] city;
    @BeforeEach
    void setUp() {
        // создать тестовый набор данных
        city = new City[10];
        city[0] = new City("Berlin",3645000,60,"13555");
        city[1] = new City("München",1545000,45,"85555");
        city[2] = new City("Bamberg",400000,35,"96138");
        city[3] = new City("Augsburg",360000,65,"86356");
        city[4] = new City("Hennef",46114,30,"53773");
        city[5] = new City("New York",8800000,80,"10001");
        city[6] = new City("Moscow",15000000,70,"141000");
        city[7] = new City("Moscow",150000,70,"10005");
        city[8] = new City("Berlin",36000,50,"10009");
        city[9] = new City("Berlin",3645000,20,"13555");
    }

    @Test
    void testSort() {
        System.out.println("=========Unsorted array=========");
        printArray(city);
        Arrays.sort(city);
        System.out.println();
        System.out.println("=========Sorted array=========");
        printArray(city);
    }

    @Test
    void testSortComparator() {
        System.out.println("=========Unsorted array=========");
        printArray(city);

        Comparator<City> cityComparator = new Comparator<City>() { // компаратор определяет способ сортировки
            @Override
            public int compare(City o1, City o2) {
                int compareName = o1.getName().compareTo(o2.getName()); // сортировка по алфавиту
                int comparePopulation = -(o1.getPopulation() - o2.getPopulation()); // по размеру популяции
                if (compareName != 0) {
                    return compareName;
                } else if (comparePopulation != 0){
                    return comparePopulation;
                } else {
                    return o1.getPollution() - o2.getPollution();
                }
            }
        };

        Arrays.sort(city,cityComparator);
        System.out.println();
        System.out.println("=========Sorted array=========");
        printArray(city);
    }

    public void printArray (Object[] arr) {
        for (Object name : arr) {
            System.out.println(name);
        }
    }
}