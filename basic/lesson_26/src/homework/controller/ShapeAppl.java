package homework.controller;

import homework.model.Circle;
import homework.model.Shape;
import homework.model.Square;
import homework.model.Triangle;

public class ShapeAppl {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Circle(3.0);
        shapes[2] = new Triangle(4.0);
        shapes[3] = new Square(6.0);

        System.out.println("=====Homework 2=====");

        double totalArea = 0.0;
        double totalPerimeter = 0.0;

        for (Shape shape :shapes) {
            totalArea += shape.calcArea();
            totalPerimeter += shape.calcPerimeter();
        }

        System.out.println("Total Area: "+ totalArea);
        System.out.println("Total Perimeter: "+ totalPerimeter);

        System.out.println("=====Homework 3=====");
        totalArea = 0.0; // задаем опять нулевое значение, для решения третьей задачи.
        double circleArea = 0.0;
        for (Shape shape :shapes) {
            totalArea += shape.calcArea();
            if (shape instanceof Circle) {
                circleArea += shape.calcArea();
            }
        }

        System.out.println("Total Area: "+ totalArea);
        System.out.println("Total Area of Circles: "+ circleArea);


    }
}
