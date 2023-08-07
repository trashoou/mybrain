package homework.employee.dao;

import homework.employee.model.Employee;
import homework.employee.model.Engineer;
import homework.employee.model.Worker;

import java.util.Arrays;
import java.util.function.Predicate;

public class CompanyImpl implements Company {
    Employee[] employees;
    int size;
    public CompanyImpl (int capacity) {
        employees = new Employee[capacity];
    }
    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || size == employees.length) {
            return false;
        }
        employees[size] = employee;
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                Employee victim = employees[i];
                employees[i] = employees[size - 1];
                employees[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public <T> T findByPredicate(T[] arr, Predicate<T> predicate) {
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])) {
                return arr[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printArray() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println("==================================");
    }

    @Override
    public Employee[] printArrayByExperience(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (employees[i].getExperience() > 5){
                System.out.println(employees[i]);
            }
        }
        return null;
    }

    @Override
    public Employee[] printArrayBySalary(Object[] arr, double netto) {
        Employee[] result = new Employee[size];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Engineer) {
                double salary = ((Engineer) arr[i]).calcSalary();
                if (salary < netto) {
                    result[count] = (Employee) arr[i];
                    count++;
                }
            } else if (arr[i] instanceof Worker) {
                double salary = ((Worker) arr[i]).calcSalary();
                if (salary < netto) {
                    result[count] = (Employee) arr[i];
                    count++;
                }
            }
        }
        return result;
    }




    @Override
    public Employee[] printArrayByEducation(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (employees[i].getEducation().equals("higher")) {
                System.out.println(employees[i]);
            }
        }
        return null;
    }
}

