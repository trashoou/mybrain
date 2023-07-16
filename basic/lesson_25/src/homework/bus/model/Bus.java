package homework.bus.model;

public class Bus {
    private int numberOfRoute;
    private int capacity;
    double routeSpeed;
    private double routeLength;
    private int distance = 0;


    public Bus(int numberOfRoute, int capacity, double routeSpeed, double routeLength) {
        this.numberOfRoute = numberOfRoute;
        this.capacity = capacity;
        this.routeSpeed = routeSpeed;
        this.routeLength = routeLength;
    }

    public int getNumberOfRoute() {return numberOfRoute;}

    public void setNumberOfRoute(int numberOfRoute) {this.numberOfRoute = numberOfRoute;}

    public int getCapacity() {return capacity;}

    public void setCapacity(int capacity) {this.capacity = capacity;}

    public double getRouteSpeed() {return routeSpeed;}

    public void setRouteSpeed(double routeSpeed) {this.routeSpeed = routeSpeed;}

    public double getRouteLength() {return routeLength;}

    public void setRouteLength(double routeLength) {this.routeLength = routeLength;}

    public void go () {
        System.out.println("Bus " + numberOfRoute+" is moving with "+routeSpeed+" km/h");

    }

    public void stop () {
        routeSpeed = 0.0;
        System.out.println("Bus is stopped, speed of bus is "+routeSpeed+" km/h");
    }

    public void speedUp () {
        routeSpeed = routeSpeed + 10;
        System.out.println("Speed of bus is "+routeSpeed+" km/h");
    }

    public void speedDown () {
        routeSpeed = routeSpeed - 10;
        System.out.println("Speed of bus is "+routeSpeed+" km/h");
    }
}
