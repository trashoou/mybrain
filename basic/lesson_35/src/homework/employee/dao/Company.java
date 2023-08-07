package homework.employee.dao;

import homework.employee.model.Employee;
import homework.employee.model.Engineer;

import java.util.function.Predicate;

public interface Company {
    public boolean addEmployee(Employee employee); // принять на работу сотрудника
    Employee removeEmployee(String name); // уволить с работы сотрудника
    public <T> T findByPredicate(T[] arr, Predicate<T> predicate); // найти работника в списке сотрудников
    int size();  // определить текущее количество сотрудников;
    void printArray(); // напечатать список сотрудников.

    public Employee[] printArrayByExperience(Object[] arr); // поиск по стажу более 5 лет
    public Employee[] printArrayBySalary(Object[] arr,double netto); // поиск по ЗП не менее 2.000 евро
    public Employee[] printArrayByEducation(Object[] arr); // поиск по высш.образованию




}
