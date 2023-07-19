package homework.homework1.test2;

class Bike  implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) { // Gear = механизм
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) { // increment = прирост
        speed = speed + increment;
    }

    @Override // Apply Brakes = Применить тормоза
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: "+speed+" gear: "+gear);
    }
}
