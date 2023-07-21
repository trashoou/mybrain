package practice.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.dao.Company;
import practice.dao.CompanyImpl;
import practice.employee.model.Employee;
import practice.employee.model.Manager;
import practice.employee.model.SalesManager;
import practice.employee.model.WageEmployee;

public class CompanyImplTest {

    Company company; // мы создали объект класса Company
    Employee[] firma;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl();
        firma = new Employee[4];
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
    }

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
}
