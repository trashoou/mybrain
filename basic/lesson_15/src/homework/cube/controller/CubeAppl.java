package homework.cube.controller;

import homework.cube.model.Cube;
public class CubeAppl {
    public static void main(String[] args) {
        Cube cube1 = new Cube(5);
        double p = cube1.perimeter(5);
        System.out.println("The perimeter of the cube is = "+p);
        double s = cube1.square(5);
        System.out.println("The square of the cube is = "+s);
        double v = cube1.volume(5);
        System.out.println("The volume of a cube is = "+v);
    }
}
