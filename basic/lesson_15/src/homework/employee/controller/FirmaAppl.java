package homework.employee.controller;

import homework.employee.model.Employee;

public class FirmaAppl {
    public static void main(String[] args) {
        double a = 900.0, b = 2500.0;
        double[] salary = new double[3];
        for (int i = 0; i < 3; i++) {
            salary[i] = (Math.random() * (b - a + 1) + a);
        }

        Employee employee1 = new Employee(1, "Dmitriy","Khramov","male",salary[0],2 );
        Employee employee2 = new Employee(2, "Michael","Rasulov","male",salary[1],4 );
        Employee employee3 = new Employee(3, "Sandor","Ivanyo","male",salary[2],5 );

        employee1.display();
        employee2.display();
        employee3.display();
    }
}
