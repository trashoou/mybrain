package homework.employee.model;

public class Worker extends Employee{

    public Worker(String name, int yearOfBirth, int experience, double hours, String education, double baseSalary) {
        super(name, yearOfBirth, experience, hours, education, baseSalary);
    }

    @Override
    public double calcSalary() {
        return getBaseSalary() * getHours();
    }

    @Override
    public int compareTo(Employee o) {
        if (o instanceof Worker) {
            double thisSalary = this.calcSalary();
            double otherSalary = ((Worker) o).calcSalary();
            return Double.compare(thisSalary, otherSalary);
        }
        // Если передан не Worker, то возвращаем 0 или другое значение, в зависимости от логики
        return 0;
    }
}

