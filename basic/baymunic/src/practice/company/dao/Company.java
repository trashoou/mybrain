package practice.company.dao;


import practice.company.model.Employee;

// dao - Data Access Object
public interface Company {
    // перечень действий = методов

    // нанимаем на работу
    boolean addEmployee(Employee employee);  // метод который дабовляет сотрудника в компании

    // увольнение
    Employee removeEmployee(int id); // метод который удаляет сотрудника из компании

    // найти сотрудника
    Employee findEmployee(int id); // метод - ищем сотрудника в компании

    // размер компании
    int size();

    // печатаем список компании
    void printEmployees();

}