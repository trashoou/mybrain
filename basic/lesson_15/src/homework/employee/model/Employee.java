package homework.employee.model;
//Задача 2. Создать класс Работник (Employee) c полями:
//уникальный номер
//имя
//фамилия
//пол
//зарплата
//уровень налогообложения
//Создать приложение FirmaAppl в котором принять на работу несколько сотрудников.
public class Employee {
    public int personalNumber;
    public String name;
    public String lastName;
    public String gender;
    public double salary;
    public int taxLevel;


    public Employee(int personalNumber, String name, String lastName, String gender, double salary,int taxLevel) {
        this.personalNumber = personalNumber;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.salary = salary;
        this.taxLevel = taxLevel;

    }
    public void display () {
        System.out.println("Персональный номер "+personalNumber);
        System.out.println("Имя "+name);
        System.out.println("Фамилия "+lastName);
        System.out.println("Пол "+gender);
        System.out.println("Зарплата "+salary);
        System.out.println("Уровень налогообложения "+taxLevel);
        System.out.println();
    }
}
