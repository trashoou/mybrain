package practice.company.model;

public class Worker extends Employee {

    private double wage; // почасовая ставка

    public Worker(int id, String firstname, String lastname, double hours, double wage) {
        super(id, firstname, lastname, hours);
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }


    @Override
    public double calcSalary() {
        double salary = hours * wage;
        return salary;
    }
}