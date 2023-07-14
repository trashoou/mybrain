package homework.quadratic_equation.model;

public class QuadraticEquation {
//Задача 3. ()* Создать класс, описывающий квадратные уравнения с коэффициетами a, b и c. Реализовать в нем методы:
// вычисления дискриминанта b*b - 4 * a *c
// определения количества корней в зависимости от значения дискриминанта
// (d>0 - два корня, d=0 - один корень, d<0 - корней нет) Вызвать методы из приложения QuadraticEquationAppl

    public double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
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

    public double discriminantCalculation (double a, double b, double c) {
        double D = b*b - 4 * a *c;
        System.out.println("Discriminant = "+D);
        return D;
    }
    public void determiningTheNumberOfRoots (double D) {
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
