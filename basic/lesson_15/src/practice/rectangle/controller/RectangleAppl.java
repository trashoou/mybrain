package practice.rectangle.controller;

import practice.rectangle.model.Rectangle;

public class RectangleAppl {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(10.0,25.0); // создаем объект типа Rectangle
        rectangle1.setA(50);
        rectangle1.setB(100);
        System.out.println("The length of rectangle is = "+rectangle1.a);
        System.out.println("The width of rectangle is = "+rectangle1.b);
        double p = rectangle1.perimeter(rectangle1.a, rectangle1.b);
        System.out.println("The perimeter of rectangle is = "+p);
        double s = rectangle1.square(rectangle1.a, rectangle1.b);
        System.out.println("The square of rectangle is = "+s);


    }
}
