package lesson_27.src.practice.tests;

import lesson_27.src.practice.dao.*;
import lesson_27.src.practice.employee.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class CompanyImplTest {

    Company company; // мы создали объект класса Company
    Employee[] firma;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(8);
        firma = new Employee[8]; // пытаемся добавить существующего
        firma[0] = new Manager(100, "John","Smith",174,5000,5);
        firma[1] = new SalesManager(101, "Bread", "Pitt", 174, 300000, 0.1);
        firma[2] = new SalesManager(102, "Julia", "Roberts", 174, 300000, 0.1);
        firma[3] = new WageEmployee(103, "Robert", "Douny Jr.", 80,20 );
        firma[4] = new WageEmployee(104, "Peter", "Petrov", 90,25 );
        firma[5] = new WageEmployee(105, "Vovka", "Vovkovi4", 95,30 );
        firma[6] = new WageEmployee(106, "Vovk", "Vovkovi4", 95,30 );
        firma[7] = new WageEmployee(107, "Vovk", "Vovkovi4", 95,30 );
    }

    @Test
    void addEmployee() {
        assertTrue(company.addEmployee(firma[0]));
        assertTrue(company.addEmployee(firma[1]));
        assertTrue(company.addEmployee(firma[2]));
        assertTrue(company.addEmployee(firma[3]));
        assertTrue(company.addEmployee(firma[4]));
        assertTrue(company.addEmployee(firma[5]));
        assertTrue(company.addEmployee(firma[6]));
        assertFalse(company.addEmployee(null));
        assertFalse(company.addEmployee(firma[7]));
    }
/*
    @Test
    void removeEmployee() {
    }

    @Test
    void findEmployee() {
    }

    @Test
    void size() {
    }

    @Test
    void printEmployees() {

    }

 */
}
