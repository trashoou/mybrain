package practice.company.tests;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.company.dao.Company;
import practice.company.dao.CompanyImpl;
import practice.company.model.Employee;
import practice.company.model.Manager;
import practice.company.model.SalesManager;
import practice.company.model.Worker;

import static org.junit.jupiter.api.Assertions.*;

public class CompanyImplTest {
    Company company; // создали объект класса Company
    Employee[] firm;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(8);
        firm = new Employee[4];
        firm[0] = new Manager(100, "John","Smith",174,5000,5);
        firm[1] = new SalesManager(101, "Bread", "Pitt", 174, 300000, 0.1);
        firm[2] = new SalesManager(102, "Julia", "Roberts", 174, 300000, 0.1);
        firm[3] = new Worker(103, "Robert", "Robert", 80,20 );

    }

    @Test
    void addEmployee() {
        assertFalse(company.addEmployee(null)); // нельзя добавить "пустого" сотрудника
        assertTrue(company.addEmployee(firm[0])); // можно добавить сотрудника
        assertTrue(company.addEmployee(firm[1])); // можно добавить сотрудника
        assertTrue(company.addEmployee(firm[2])); // можно добавить сотрудника
        assertTrue(company.addEmployee(firm[3])); // можно добавить сотрудника
//        assertEquals(4, company.size());
//        Employee employee = new SalesManager(106, "Peter", "Petrov", 180, 40000, 0.1);
//        assertTrue(company.addEmployee(employee));
//        assertEquals(5, company.size());
//        assertFalse(company.addEmployee(firm[3]));// нельзя добавить уже имеющегося сотрудника
//        employee = new SalesManager(106, "Vasia", "Ivanov", 180, 40000, 0.1);
//        assertFalse(company.addEmployee(employee)); //нельзя выйти за размер компании
    }

    @Test
    void removeEmployee() {
        company.addEmployee(firm[2]);
        System.out.println(company.size());
        assertEquals(firm[2], company.removeEmployee(102));
        System.out.println(company.size());
    }

    @Test
    void findEmployee() {

    }

    @Test
    void size() {

    }

    @Test
    void printEmployees() {

        company.printEmployees();
    }


}
