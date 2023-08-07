package homework.employee.model;

import java.util.Objects;

public abstract class Employee implements Comparable<Employee> {
    protected static double minWage = 30;
    private String name;
    private int yearOfBirth;
    private int experience;
    protected double hours;
    private String education;

    private double baseSalary;


    public Employee(String name, int yearOfBirth, int experience, double hours, String education, double baseSalary) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.experience = experience;
        this.hours = hours;
        this.education = education;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public static double getMinWage() {
        return minWage;
    }

    public static void setMinWage(double minWage) {
        Employee.minWage = minWage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return yearOfBirth == employee.yearOfBirth && experience == employee.experience && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth, experience);
    }

    public abstract double calcSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", experience=" + experience +
                ", hours=" + hours +
                ", education='" + education + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
