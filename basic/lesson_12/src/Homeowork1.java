import java.util.Scanner;

public class Homeowork1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
//Выведите на печать температуру, которая была во вторник и затем в четверг.
//Найти среднюю температуру за прошлую неделю.
        System.out.println("Введите температуру за прошедшую неделю(Пн,Вт,Ср,Чт,Пт,Сб,Вс):");
        int [] t = new int[7];
        for (int i = 0; i < 7; i++) {
            t[i] = in.nextInt();
        }
        int avgSum = (t[0]+t[1]+t[2]+t[3]+t[4]+t[5]+t[6])/7;
        System.out.println("Температура во вторник: "+t[1]);
        System.out.println("Температура в четверг: "+t[3]);
        System.out.println("Средняя температура за прошлую неделю: "+avgSum);
    }

}

