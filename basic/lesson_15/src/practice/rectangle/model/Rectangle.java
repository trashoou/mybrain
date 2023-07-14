package practice.rectangle.model;

// этот файл и есть капсула для класса Rectangle
// Название файлка Класса - всегда с большой буквы.

// Шаг 1 - определяем поля класса
public class Rectangle {
    // длина
    public double a;

    // ширина
    public double b;

    // Шаг 2 - определяем методы

    // Конструктор класса Rectangle
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    // метод для вычисления периметра
    public double perimeter(double a,double b) {
        return 2*a +2*b;
    }

    public double square(double a,double b) {
        return a*b;
    }

}

