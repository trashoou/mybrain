package homework.cube.model;
//Создать класс Cube, описывающий куб cо стороной a.
// Реализовать в нем методы определения периметра p, площади s и объема v.
// Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
// Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.

public class Cube {
    public double a;


    public Cube(double a) {
        this.a = a;
    }
    public double perimeter(double a) {
        return 12*a;
    }
    public double square(double a) {
        return (6*Math.pow(a,2));
    }
    public double volume(double a) {
        return Math.pow(a,3);
    }
}
