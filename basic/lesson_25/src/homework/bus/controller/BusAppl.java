package homework.bus.controller;

import homework.bus.model.Bus;

public class BusAppl {
    public static void main(String[] args) {
        Bus bus1 = new Bus(13,15,60,120);
        bus1.go();
        bus1.speedUp();
        bus1.speedDown();
        bus1.stop();
    }
}
