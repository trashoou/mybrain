package lesson_28.src.lesson_27.src.practice.tests;

import lesson_28.src.lesson_27.src.practice.dao.Company;
import lesson_28.src.lesson_27.src.practice.dao.CompanyImpl;
import lesson_28.src.lesson_27.src.practice.employee.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class CompanyImplTest {

    Company company; // мы создали объект класса Company
    Employee[] firma;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(4);
        firma = new Employee[4]; // пытаемся добавить существующего
        firma[0] = new Manager(100, "John","Smith",174,5000,5);
        firma[1] = new SalesManager(101, "Bread", "Pitt", 174, 300000, 0.1);
        firma[2] = new SalesManager(102, "Julia", "Roberts", 174, 300000, 0.1);
        firma[3] = new WageEmployee(103, "Robert", "Douny Jr.", 80,20 );

        for (int i = 0; i < firma.length; i++) {
            company.addEmployee(firma[i]);
        }
    }

    @Test
    void addEmployee() {
        assertFalse(company.addEmployee(null));
        assertFalse(company.addEmployee(firma[0]));
        assertFalse(company.addEmployee(firma[1]));
        assertFalse(company.addEmployee(firma[2]));
        assertFalse(company.addEmployee(firma[3]));
        assertEquals(4,company.size());
        Employee employee = new SalesManager(106,"Peter","Petrov",180,40000,0.1);
        assertTrue(company.addEmployee(employee));
        assertEquals(5,company.size());
        assertFalse(company.addEmployee(firma[3]));
        employee = new SalesManager(106,"Vasia","Ivanov",180,40000,0.1);
        assertFalse(company.addEmployee(employee));
    }
    @Test
    void removeEmployee() {
        company.addEmployee(firma[2]);
        System.out.println(company.size());
        assertEquals(firma[2], company.removeEmployee(102));
        System.out.println(company.size());
    }

    @Test
    void findEmployee() {
        System.out.println(company.size());
        assertEquals(firma[1], company.findEmployee(101));
    }

    @Test
    void size() {
        System.out.println(company.size());
        assertEquals(4,company.size());
    }

    @Test
    void printEmployees() {
        company.printEmployees();
    }
}
