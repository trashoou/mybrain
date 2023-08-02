package practice.company.model;

import java.util.Objects;

public abstract class Employee {
    protected static double minWage = 30; // ставка в евро
    protected final int id; // это хорошо
    protected String firstname;
    protected String lastname;
    protected double hours;

    public Employee(int id, String firstname, String lastname, double hours) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        // воспользуемся классом  StringBuilder - это "класс-обёртка" для класса String
        final StringBuilder sb = new StringBuilder("Employee");
        sb.append("id = ").append(id);
        sb.append(", firstName = ").append(firstname).append('\'');
        sb.append(", lastname = ").append(lastname).append('\'');
        sb.append(", hours = ").append(hours);
        sb.append(", Salary = ").append(calcSalary());
        return sb.toString();
    }
    public abstract double calcSalary();
}