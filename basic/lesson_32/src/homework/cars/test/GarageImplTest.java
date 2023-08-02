package homework.cars.test;

import homework.cars.dao.Garage;
import homework.cars.dao.GarageImpl;
import homework.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class GarageImplTest {
    Garage garage;
    Car[] cars;

   @BeforeEach
   void setUp() {
       garage = new GarageImpl(6);
       cars = new Car[5];
       cars[0] = new Car("BV 100","Audi", "BVB", 2.0, "Silver", 250000.0);
       cars[1] = new Car("BV 101","Mercedes", "BVB",3.5, "Blue",50000.0);
       cars[2] = new Car("BV 102", "Opel", "BSR", 1.8, "White",10000.0);
       cars[3] = new Car("BV 103", "BMW", "RES",2.8, "Blue",450000.0 );
       cars[4] = new Car("BV 104","Audi", "BVB", 1.8, "White",15000.0);

       for (Car car : cars) {
           garage.addCar(car);
       }
   }

    @Test
    void carsSortByModelTest() {
        System.out.println("======== Cars unsorted ========");
        printArray(cars);
        Arrays.sort(cars); // подвергаем сортировке
        System.out.println();
        System.out.println("======== Cars sorted by model ========");
        printArray(cars);
    }

    @Test
    void carsSortByCompanyTest() {
        System.out.println("======== Cars unsorted ========");
        printArray(cars);
        Arrays.sort(cars); // подвергаем сортировке
        System.out.println();
        System.out.println("======== Cars sorted by company ========");
        printArray(cars);
    }

    @Test
    void carsSortByEngineTest() {
        System.out.println("======== Cars unsorted ========");
        printArray(cars);
        Arrays.sort(cars); // подвергаем сортировке
        System.out.println();
        System.out.println("======== Cars sorted by engine ========");
        printArray(cars);
    }

    @Test
    void carsSortByMileageTest() {
        System.out.println("======== Cars unsorted ========");
        printArray(cars);
        Arrays.sort(cars); // подвергаем сортировке
        System.out.println();
        System.out.println("======== Cars sorted by mileage ========");
        printArray(cars);
    }

    public void printArray (Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}