package homework.quad.model;

public class QuadraticEquation {
    public Double a,b,c;
    public QuadraticEquation(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void display () {
        if (b < 0) {
            System.out.printf("Quadratic equation: %.0fx² - %.0fx + %.0f = 0", a, -b, c);
        } else {
            System.out.printf("Quadratic equation: %.0fx² + %.0fx + %.0f = 0", a, b, c);
        }
        System.out.println();
    }

    public double discriminantCalculation (Double a, Double b, Double c) {
        Double D = b*b - 4 * a *c;
        System.out.println("Discriminant = "+D);
        return D;
    }

    public boolean oneRoot (Double D) {
        if (D == 0) {
            return true;
        }
        return false;
    }
    public boolean twoRoots (Double D) {
        if (D > 0) {
            return true;
        }
        return false;
    }
    public boolean noRoots (Double D) {
        if (D < 0) {
            return true;
        }
        return false;
    }


    public void determiningTheNumberOfRoots (Double D) {
        if (D>0) {
            System.out.println("The equation has two roots");
        } else if (D==0) {
            System.out.println("The equation has one root");
        } else {
            System.out.println("The equation has no roots");
        }
        System.out.println();
    }
}

