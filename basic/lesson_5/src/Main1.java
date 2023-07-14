import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Включили Scanner
        System.out.println("Задачи на вычисления");

        //Написать программу для вычисления средней стомости поездки по транспортному проездному.
        // Попросить пользователя ввести стоимость проездного на месяц и количество рабочих дней в месяце.
        // Считая, что в рабочий день в среднем две поездки, и 1.5 поездки в выходной
        // , посчитать и округлить общее число поездок в месяц
        // и посчитать среднюю стоимость одной поездки по проездному.

        System.out.println("Input cost of City ticket: ");
        double priceMonatKarte = in.nextDouble(); // считываем от пользователя стоимость проездного
        System.out.println("Input number of working days in current month: ");
        int workingDays = in.nextInt();

        int trip = workingDays * 2;  // количество поездок в рабочие дни
        int holyDays = 31 - workingDays;

        int holyDayTrip = (int)Math.round(1.5 * holyDays); // количество поездок в выходные дни

        //trip = trip + holyDayTrip; // так не очень хорошо, но можно
        int trips; // общее количество поездок
        trips = trip + holyDayTrip;

        System.out.println("Number of trips in May: " + trips);

        double averageTripPrice = priceMonatKarte/trips; // вычисляем среднюю стоимость

        System.out.println("Average price = " + averageTripPrice);
        System.out.printf("Average price = %.2f", averageTripPrice);
        //System.out.println();
        System.out.println("Vvod:");
        int s = in.nextInt();
        int s1;
        s1 = (int) Math.sqrt(s);
        System.out.println(s1);

    }


}
// - нахожднеие угла в треугольнике по двум имеющимся
// Сумма углов в треугольника = 180 градусов
//System.out.println("Вычисление угла треугольника по двум другим:");
//        System.out.println("Input 1st angle: "); // запрос величины 1-го угла
//        int a1 = in.nextInt(); // считываем значение угла с клавиатуры
//
//        System.out.println("Input 2nd angle: "); // запрос величины 2-го угла
//        int a2 = in.nextInt(); // считываем значение угла с клавиатуры
//
//        int a3 = 180 - a1 - a2; // сумма углов в треугольнике 180 градусов
//
//        System.out.println("3rd angle in trianlge is : " + a3);

//----------------------------------

//System.out.println("Calculate length and area of circle.");
//
//        System.out.println("Input radius of circle: ");
//        double r = in.nextDouble();
//
//        double l = 2 * Math.PI * r; // вычислили длину окружности
//        double s = Math.PI * r * r; // вычислили площадь
//        float s1 = (float) (Math.PI * Math.pow(r, 2)); // вычислили площадь другим способом
//
//        System.out.println("Length of circle: " + l);
//        System.out.println("Area of circle: " + s);
//        System.out.println("Area of circle: " + s1);
