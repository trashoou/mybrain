package practice.employee.dao;

import practice.employee.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

//**Задание 5.**
//        CompanyImpl реализовать методы для поиска сотрудников по критериям:
//        - имеющих стаж более 5 лет
//        - имеющих зарплату менее 2000 евро
//        - не имеющих высшее образование
//
//        **Задание 6.**
//        Создать компараторы и получить отсортированные списки сотрудников:
//        - по возрасту
//        - по стажу работы в компании
//        - по величине зарплаты
//        - по образованию (выше образованные в начале списка)


class CompanyImplTest {

    CompanyImpl company; // поле, подключение тестируемого класса, создание объектной переменной
    Employee[] employees; // поле типа Employee, это массив, пока он получил только название

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(100); // вызов конструктора
        employees = new Employee[10];
        employees[0] = new Employee(101L, "John", 35, 5, "phd");
        employees[1] = new Employee(102L, "Ann", 30, 5, "hight school");
        employees[2] = new Employee(103L, "Peter", 45, 5, "hight school");
        employees[3] = new Employee(104L, "Robin", 28, 5, "real school");
        employees[4] = new Employee(105L, "Mike", 20, 5, "real school");


        for (int i = 0; i < employees.length; i++) {
            company.addEmployee(employees[i]);
        }

    }

    @Test
    void addEmployee() {
        System.out.println(company.size());
        Engineer engineer = new Engineer(106L,"Stefan",40,0,"3 - high school",900.0,4,160);
        assertTrue(company.addEmployee(engineer)); // тест на добавление
        assertEquals(6,company.size()); // проверка size
        assertFalse(company.addEmployee(null)); // тест на добавление null
        assertFalse(company.addEmployee(engineer)); // тест на добавление дубликата
    }

    @Test
    void removeEmployee() {
        company.printEmployees();
        System.out.println(company.size());
        assertEquals(employees[2],company.removeEmployee(103));
        System.out.println("After removing employee:");
        System.out.println(company.size());
        company.printEmployees();
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

    @Test
    void testSortByExperience() {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o2.getExperience(), o1.getExperience());
            }
        };

        company.printEmployees();
        Arrays.sort(employees,employeeComparator);
        System.out.println();
        company.printEmployees();
    }


}

