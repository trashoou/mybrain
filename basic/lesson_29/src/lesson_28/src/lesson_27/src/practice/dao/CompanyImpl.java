package lesson_28.src.lesson_27.src.practice.dao;

import lesson_28.src.lesson_27.src.practice.employee.model.Employee;


public class CompanyImpl implements Company {

    Employee[] employees;

    int size;
    public CompanyImpl(int capacity) {
        employees = new Employee[capacity]; // Создаем пустой массив сотрудников
    }


    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || size == employees.length || findEmployee(employee.getId()) != null) {
            return false;
        }
        employees[size] = employee;
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) { // метод будет возвращать объект employee типа Employee
        // алгоритм удаления сотрудника из массива по его Id
        // ищем в цикле по всем employee (перебираем в цикле, обегаем массив)
        // если нашелся сотрудник с заданным id,
        // 1. сохранить удаляемого сотрудника victim в объектную переменную
        // 2. на место удаленного переносим последнего в массиве
        // 3. последнего затираем с помощью null
        // 4. size-- - уменьшаем размер массива
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
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
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
