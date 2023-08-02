package lesson_27.src.practice.dao;

import lesson_27.src.practice.employee.model.Employee;


public class CompanyImpl implements Company {

    Employee[] employees;

    int size;
    public CompanyImpl(int capacity) {
        employees = new Employee[capacity]; // Создаем пустой массив сотрудников
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
    public Employee removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size(); i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printEmployees() {

    }
}
