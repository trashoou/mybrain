package homework.employee.dao;

import homework.employee.model.Employee;
import homework.employee.model.Engineer;
import homework.employee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company;
    Employee[] employees;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(4);
        employees = new Employee[4]; // пытаемся добавить существующего
        employees[0] = new Engineer("John Smith",2002,5,175,"secondary",36);
        employees[1] = new Worker("Bread Pitt", 1999, 10, 160, "higher", 40);
        employees[2] = new Engineer("Julia Roberts", 1895,25 ,130,"higher", 45);
        employees[3] = new Worker("Robert Douny Jr.", 2000, 15, 90,"secondary",20 );

        for (Employee employee : employees) {
            company.addEmployee(employee);
        }

    }

    @Test
    void addEmployee() {
        employees[5] = new Engineer("John Smith",2002,5,175,"secondary",36);
        assertTrue(company.addEmployee(employees[5]));
        assertFalse(company.addEmployee(null));
    }

    @Test
    void removeEmployee() {
        company.addEmployee(employees[2]);
        System.out.println(company.size());
        assertEquals(employees[2], company.removeEmployee("Julia Roberts"));
        System.out.println(company.size());
    }

    @Test
    void findByPredicate() {
        company.printArray();
        Employee employee = company.findByPredicate(employees, employee1 -> employee1.getBaseSalary()< 30);
        System.out.println(employee);
        assertEquals(employees[3],employee);
    }

    @Test
    void testPrintArray() {
        company.printArray();
    }

    @Test
    void printArrayByExperience() {
        company.printArrayByExperience(employees);
    }

    @Test
    void printArrayBySalary() {
        double netto = 2000;

        System.out.println("Сотрудники с зарплатой меньше " + netto);
        Employee[] filteredEmployees = company.printArrayBySalary(employees, netto);
        for (Employee employee : filteredEmployees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
        System.out.println(employees[0].calcSalary());
        System.out.println(employees[1].calcSalary());
        System.out.println(employees[2].calcSalary());
        System.out.println(employees[3].calcSalary());

    }

    @Test
    void printArrayByEducation() {
        company.printArrayByEducation(employees);
    }

    @Test
    void testCompareEmployee() {
        System.out.println("=========Unsorted array=========");
        company.printArray();
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int compareEducation = o1.getEducation().compareTo(o2.getEducation());
                int compareSalary = Double.compare(o2.calcSalary(), o1.calcSalary());
                int compareExperience = Integer.compare(o2.getExperience(), o1.getExperience());
                if (compareEducation != 0) {
                    return compareEducation;
                } else if (compareSalary != 0) {
                    return compareSalary;
                    } else if (compareExperience != 0) {
                    return compareExperience;
                } else {
                    return -(o1.getYearOfBirth() - o2.getYearOfBirth());
                }
            }
        };
        Arrays.sort(employees, comparator);
        System.out.println("=========Sorted array=========");
        company.printArray();
    }
}