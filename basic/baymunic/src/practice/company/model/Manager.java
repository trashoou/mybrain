package practice.company.model;

// manager: base + grade*hours;

public class Manager extends Employee {
    private double baseSalary;
    private int grade;


    public Manager(int id, String firstname, String lastname, double hours, double baseSalary, int grade) {
        super(id, firstname, lastname, hours);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = baseSalary + grade*hours;
        if (salary < hours * minWage) {
            salary = hours * minWage;
        }
        return salary;
    }
}