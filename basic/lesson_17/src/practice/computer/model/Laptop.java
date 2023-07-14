package practice.computer.model;

public class Laptop extends Computer {
    private double size;
    private double weight;
    private String color;

    public Laptop(String cpu, int ram, int ssd, String brand, double size, double weight, String color) {
        super(cpu, ram, ssd, brand);
        this.size = size;
        this.weight = weight;
        this.color = color;
    }

    public Laptop(String cpu, int ram, int ssd, String brand, double size, double weight) {
        super(cpu, ram, ssd, brand);
        this.size = size;
        this.weight = weight;
    }

    public void display () {
        super.display();
        System.out.println("Size: "+size+" Weight: "+weight);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
