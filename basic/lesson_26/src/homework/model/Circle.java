package homework.model;

public class Circle extends Shape {

    public Circle(double radius) {
        this.side = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * side * side;
    }
    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * side;
    }
}
