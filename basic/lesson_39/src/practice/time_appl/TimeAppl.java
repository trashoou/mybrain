package practice.time_appl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class TimeAppl {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now(); // устанавливает сегодняшнюю дату
        System.out.println(currentDate); // выводит переменную 'currentDate' = которая определяет сегодняшнее число.

        LocalTime currentTime = LocalTime.now(); // уставнавливает текущее время
        System.out.println(currentTime); // выводит переменную 'currentTime' = которая определяет текущее время.

        LocalDateTime localDateTime = LocalDateTime.now(); // уставнавливает текущее время и дату
        System.out.println(localDateTime); // выводит переменную 'localDateTime' = которая определяет текущее время и дату.

        LocalDate gagarin = LocalDate.of(1961,4,12);
        System.out.println("Day of week: "+gagarin.getDayOfWeek()+"| Day of month: "+gagarin.getDayOfMonth()+"| Day of year " + gagarin.getDayOfYear());

        System.out.println(gagarin.isBefore(currentDate)); // true
        System.out.println(gagarin.isAfter(currentDate)); // false
        System.out.println(ChronoUnit.DAYS.between(gagarin,localDateTime));

        System.out.println("======Traveling in Time======");
        LocalDate newDate = currentDate.plusDays(40);
        System.out.println(newDate);

        newDate = currentDate.minusWeeks(12);
        newDate = newDate.minusDays(8);
        System.out.println(ChronoUnit.DAYS.between(newDate,currentDate));

        // 2 month ago
        newDate = currentDate.minusMonths(2);
        System.out.println(newDate);

        // operations with ChronoUnits
        System.out.println(localDateTime.plus(9,ChronoUnit.CENTURIES));

        newDate = currentDate.plus(10,ChronoUnit.CENTURIES);
        System.out.println("After 10 centuries: "+newDate);

        // получение интервала времени
        LocalDate lenin = LocalDate.of(1870,4,22);
        long res = ChronoUnit.YEARS.between(gagarin,lenin);

        System.out.println("День рождение Ленина - день старта Гагарина (в годах): "+res);

        System.out.println("Compare LocalDate");
        System.out.println(lenin.compareTo(gagarin)); // сравнение дат

        LocalDate[] dates = {gagarin,currentDate, lenin};
        Arrays.sort(dates);
        System.out.println(Arrays.toString(dates));


        System.out.println("======Date Formatter======");
        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        System.out.println(gagarin.format(df));
        df = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(gagarin.format(df));

        String date1 = "06/07/2023";
        String date2 = "2023-02-02";

        LocalDate localDate1 = dateParse(date1);
        System.out.println(localDate1);
        LocalDate localDate2 = dateParse(date2);
        System.out.println(localDate2);

    }
    private static LocalDate dateParse(String date) {
        //DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");
        return LocalDate.parse(date, df);
//        if (date.contains("-")) {
//            return LocalDate.parse(date);
//        } else {
//            return LocalDate.parse(date, df);
//        }


    }
}
