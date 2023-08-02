package cars.dao;

import cars.model.Car;

public interface Garage {
    public boolean addCar(Car car);
    Car removeCar(String regNumber);
    Car findCarByRegNumber(String regNumber);
    public Car[] findCarsByModel(String model);

    int size();

    public Car[] findCarsByCompany(String company);
    public Car[] findCarsByEngine(double min,double max);
    public Car[] findCarsByColor(String color);

}
