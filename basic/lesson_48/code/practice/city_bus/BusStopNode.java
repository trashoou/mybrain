package practice.city_bus;

public class BusStopNode {
    String stopName;
    BusStopNode next;
    BusStopNode prev;

    private double range;

    public void setRange(double range) {
        this.range = range;
    }

    public double getRange() {
        return range;
    }

    public BusStopNode(String stopName) {
        this.stopName = stopName;
        this.next = null;
        this.prev = null;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public BusStopNode getNext() {
        return next;
    }

    public void setNext(BusStopNode next) {
        this.next = next;
    }

    public BusStopNode getPrev() {
        return prev;
    }

    public void setPrev(BusStopNode prev) {
        this.prev = prev;
    }
}

