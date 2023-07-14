package homework.quad.controller;

import homework.quad.model.QuadraticEquation;

public class QuadraticEquationAppl {
    public static void main(String[] args) {
        QuadraticEquation qe1 = new QuadraticEquation(1.0,2.0,3.0);
        qe1.display();
        double d = qe1.discriminantCalculation(qe1.a, qe1.b, qe1.c);
        qe1.determiningTheNumberOfRoots(d);

        QuadraticEquation qe2 = new QuadraticEquation(0.0,2.0,3.0);
        qe2.display();
        d = qe2.discriminantCalculation(qe2.a, qe2.b, qe2.c);
        qe2.determiningTheNumberOfRoots(d);


        QuadraticEquation qe3 = new QuadraticEquation(1.0,-6.0,9.0);
        qe3.display();
        d = qe3.discriminantCalculation(qe3.a, qe3.b, qe3.c);
        qe3.determiningTheNumberOfRoots(d);
    }
}
