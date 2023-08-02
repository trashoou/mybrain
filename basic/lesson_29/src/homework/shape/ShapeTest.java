package homework.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    private Rectangle rectangle;
    private Trapezoid trapezoid;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(4.0,5.0);
        trapezoid = new Trapezoid(5.0,7.0,3.0,4.0,4.0);
    }

    @Test
    void testRectangle() {
        assertEquals(20.0, rectangle.calcArea());

        assertEquals(18.0, rectangle.calcPerimeter());
    }

    @Test
    void calcPerimeter() {
        assertEquals(18.0, trapezoid.calcArea());

        assertEquals(20.0, trapezoid.calcPerimeter());
    }
}