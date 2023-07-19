package homework.model;

public class Square extends Shape {

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    public double calcPerimeter() {
        return 4 * side;
    }
}
