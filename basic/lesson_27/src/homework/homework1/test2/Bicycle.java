package homework.homework1.test2;

public class Bicycle implements Vehicle {
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
    public void applyBrakes(int decrement) { // decrement = уменьшение | снижение
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Speed: "+speed + " gear: "+gear);
    }
}
