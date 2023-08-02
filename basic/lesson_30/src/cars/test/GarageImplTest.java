package cars.test;

import java.util.Arrays;
import cars.dao.Garage;
import cars.dao.GarageImpl;
import cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {
    Garage garage;
    Car[] cars;

   @BeforeEach
   void setUp() {
       garage = new GarageImpl(6);
       cars = new Car[5];
       cars[0] = new Car("BV 100","Audi", "BVB", 2.0, "Silver");
       cars[1] = new Car("BV 101","Mercedes", "BVB",3.5, "Blue");
       cars[2] = new Car("BV 102", "Opel", "BSR", 1.8, "White");
       cars[3] = new Car("BV 103", "BMW", "RES",2.8, "Blue" );
       cars[4] = new Car("BV 104","Audi", "BVB", 1.8, "White");

       for (Car car : cars) {
           garage.addCar(car);
       }
   }

    @Test
    void addCarTest() {
        assertFalse(garage.addCar(null));
        assertEquals(5,garage.size());
        Car car = new Car("BV 105","Opel","BVB",2.0,"Green");
        assertTrue(garage.addCar(car));
        assertEquals(6,garage.size());
        car = new Car("BV 106","Mazda","Company2",2.0,"Green");
        assertFalse(garage.addCar(car));
    }

    @Test
    void removeCarTest() {
        assertEquals(5,garage.size());
        assertEquals(cars[0],garage.removeCar("BV 100"));
        assertEquals(4,garage.size());
    }

    @Test
    void findCarByRegNumberTest() {
        assertEquals(cars[0],garage.findCarByRegNumber("BV 100"));
        assertEquals(null,garage.findCarByRegNumber(""));
    }

    @Test
    void findCarsByModelTest() {
       Car[] expected = {cars[0],cars[4]};
       assertArrayEquals(expected,garage.findCarsByModel("Audi"));
    }

    @Test
    void findCarsByCompanyTest() {
       Car[] expected = {cars[0],cars[1],cars[4]};
       assertArrayEquals(expected, garage.findCarsByCompany("BVB"));
    }

    @Test
    void findCarsByEngine() {
        Car[] expected = {cars[0],cars[1],cars[3]};
        assertArrayEquals(expected, garage.findCarsByEngine(2.0,3.5));
    }

    @Test
    void findCarsByColorTest() {
       Car[] expected = {cars[2],cars[4]};
       assertArrayEquals(expected, garage.findCarsByColor("White"));
    }
}