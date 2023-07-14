package homework.quad.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    QuadraticEquation quadraticEquation;

    @BeforeEach
    void setUp() {
        quadraticEquation = new QuadraticEquation(3.0,4.0,5.0);
    }

    @Test
    void oneRoot() {
        Double d = quadraticEquation.discriminantCalculation(1.0,-6.0,9.0);
        assertTrue(quadraticEquation.oneRoot(d));
    }

    @Test
    void twoRoots() {
        Double d = quadraticEquation.discriminantCalculation(0.0,2.0,3.0);
        assertTrue(quadraticEquation.twoRoots(d));
    }

    @Test
    void noRoots() {
        Double d = quadraticEquation.discriminantCalculation(1.0,2.0,3.0);
        assertTrue(quadraticEquation.noRoots(d));
    }
}