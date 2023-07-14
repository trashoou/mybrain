import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //Задача 3
//В первый день спортсмен пробежал s километров,
//а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
//Определите номер дня, на который пробег спортсмена составит не менее target километров.
//Программа получает на вход действительные числа s и target
//и должна вывести одно натуральное число.
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько километров пробегает спортсмен в день:");
        double s = in.nextDouble();
        System.out.println("Введите желамое кол-во километров в итоге:");
        double target = in.nextDouble();

        int day = 1;
        double s1 = s;

        while (s1 < target) {
            s1 += s1 * 0.10;
            day++;
        }
        System.out.println("На "+day+" дне, спорстсмен достиг "+target+" километров.");
    }
}

