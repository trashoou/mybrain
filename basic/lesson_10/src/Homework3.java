import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
//Написать программу, которая принимает с клавиатуры номер месяца и год
//и выводит на экран название месяца и количество дней в нем. (повторение условного оператора)
        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер месяца (от 1 до 12):");
        int month = in.nextInt();

        System.out.println("Введите год:");
        int year = in.nextInt();

        String monthName;
        int daysInMonth;

        switch (month) {
            case 1:
                monthName = "Январь";
                daysInMonth = 31;
                break;
            case 2:
                monthName = "Февраль";
                if (isLeapYear(year)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 3:
                monthName = "Март";
                daysInMonth = 31;
                break;
            case 4:
                monthName = "Апрель";
                daysInMonth = 30;
                break;
            case 5:
                monthName = "Май";
                daysInMonth = 31;
                break;
            case 6:
                monthName = "Июнь";
                daysInMonth = 30;
                break;
            case 7:
                monthName = "Июль";
                daysInMonth = 31;
                break;
            case 8:
                monthName = "Август";
                daysInMonth = 31;
                break;
            case 9:
                monthName = "Сентябрь";
                daysInMonth = 30;
                break;
            case 10:
                monthName = "Октябрь";
                daysInMonth = 31;
                break;
            case 11:
                monthName = "Ноябрь";
                daysInMonth = 30;
                break;
            case 12:
                monthName = "Декабрь";
                daysInMonth = 31;
                break;
            default:
                monthName = "Неверный номер месяца";
                daysInMonth = 0;
                break;
        }

        System.out.println("Название месяца: " + monthName);
        System.out.println("Количество дней: " + daysInMonth);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
