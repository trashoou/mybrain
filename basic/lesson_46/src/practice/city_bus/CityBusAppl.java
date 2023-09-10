package practice.city_bus;

import practice.city_bus.model.Bus;

import java.util.ArrayList;
import java.util.List;

public class CityBusAppl {
    public static void main(String[] args) {
        // Создадим список городских маршрутов.
        // Вывести его на печать в отсортированном виде.
        // Подсчитать общее количество перевозимх за день пассажиров.

        List<Bus> cityBuses = new ArrayList<>();

        cityBuses.add(new Bus("Scania","1000AG", "100",90));
        cityBuses.add(new Bus("MAN","2000AG", "100A",100));
        cityBuses.add(new Bus("Mercedes","5000AG", "25",105));
        cityBuses.add(new Bus("Ikarus","3000AG", "B",80));

        Bus bus1 = new Bus("MAN","2000AG", "100A",100);
        cityBuses.add(bus1);

        System.out.println(cityBuses.size());
        System.out.println("==================");

        for (Bus bus : cityBuses) {
            System.out.println(bus);
        }

        System.out.println("===================");
        cityBuses.sort(Bus::compareTo);
        for (Bus bus : cityBuses) {
            System.out.println(bus);
        }

        System.out.println("=========Total Capacity========");
        int totalCapacity = 0;

        for (Bus bus: cityBuses) {
            totalCapacity += bus.getCapacity();
        }
        System.out.println(totalCapacity);

        Bus pattern = cityBuses.get(4);
        System.out.println(pattern);
        pattern.setModel("Ykarus");
        cityBuses.set(4,pattern);

        for (Bus bus : cityBuses) {
            System.out.println(bus);
        }




    }
}
