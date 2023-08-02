package homework.cars.dao;


import homework.cars.model.Car;

public class GarageImpl implements Garage {
    Car[] cars;
    int size;
    public GarageImpl(int capacity) {cars = new Car[capacity];}

    @Override
    public boolean addCar(Car car) {
        if (car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null ) {
            return false;
        }
        cars[size] = car;
        size++;
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {
                Car victim = cars[i];
                cars[i] = cars[size - 1];
                cars[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (regNumber.equals(cars[i].getRegNumber())) {
                Car res = cars[i];
                return res;
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        // подсчитать сколько будет найдено
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(model.equals(cars[i].getModel())) {
                count++;
            }
        }
        // заполняем массив результатом
        Car[] res = new Car[count];
        int index=0;
        for (int i = 0; index < res.length; i++) {
            if(model.equals(cars[i].getModel())) {
                res[index] = cars[i];
                index++;
            }
        }

        return res;
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        // подсчитать сколько будет найдено
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(company.equals(cars[i].getCompany())) {
                count++;
            }
        }
        // заполняем массив результатом
        Car[] res = new Car[count];
        int index=0;
        for (int i = 0; index < res.length; i++) {
            if(company.equals(cars[i].getCompany())) {
                res[index] = cars[i];
                index++;
            }
        }

        return res;
    }

    @Override
    public Car[] findCarsByEngine(double min,double max) {
        // подсчитать сколько будет найдено
        int count = 0;
        for (int i = 0; i < size; i++) {
            double engine = cars[i].getEngine();
            if(engine >= min && engine <= max) {
                count++;
            }
        }
        // заполняем массив результатом
        Car[] res = new Car[count];
        int index=0;
        for (int i = 0; index < res.length; i++) {
            double engine = cars[i].getEngine();
            if(engine >= min && engine <= max) {
                res[index] = cars[i];
                index++;
            }
        }

        return res;
    }

    @Override
    public Car[] findCarsByColor(String color) {
        // подсчитать сколько будет найдено
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(color.equals(cars[i].getColor())) {
                count++;
            }
        }
        // заполняем массив результатом
        Car[] res = new Car[count];
        int index=0;
        for (int i = 0; index < res.length; i++) {
            if(color.equals(cars[i].getColor())) {
                res[index] = cars[i];
                index++;
            }
        }

        return res;
    }

    @Override
    public int size() {
        return size;
    }
}
