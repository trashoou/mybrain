package homework.shape;

public class Trapezoid extends Shape {
    private double upperBase;
    private double lowerBase;
    private double height;
    private double side1;
    private double side2;

    public Trapezoid(double upperBase, double lowerBase, double height, double side1, double side2) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calcArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public double calcPerimeter() {
        return upperBase + lowerBase + side1 + side2;
    }
}
