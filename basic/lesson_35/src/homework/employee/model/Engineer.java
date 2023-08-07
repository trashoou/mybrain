package homework.employee.model;

public class Engineer extends Employee {


    public Engineer(String name, int yearOfBirth, int experience, double hours, String education, double baseSalary) {
        super(name, yearOfBirth, experience, hours, education, baseSalary);
    }

    @Override
    public double calcSalary() {
        return getBaseSalary() * getHours();
    }

    @Override
    public int compareTo(Employee o) {
        if (o instanceof Engineer) {
            double thisSalary = this.calcSalary();
            double otherSalary = ((Engineer) o).calcSalary();
            return Double.compare(thisSalary, otherSalary);
        }
        // Если передан не Worker, то возвращаем 0 или другое значение, в зависимости от логики
        return 0;
    }
}

