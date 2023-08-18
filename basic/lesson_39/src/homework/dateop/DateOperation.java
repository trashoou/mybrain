package homework.dateop;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateOperation implements Comparator<String>{

    public static int getAge(String birthDate) {
        LocalDate bd = dateParse(birthDate);

        LocalDate currentDate = LocalDate.now();
        long res = ChronoUnit.YEARS.between(bd,currentDate);
        return (int) res;
    }

    public static String[] sortStringDates(String[] dates) {
        Arrays.sort(dates,new DateOperation());
        return dates;
    }

    @Override
    public int compare(String date1, String date2) {

        LocalDate localDate1 = dateParse(date1);
        LocalDate localDate2 = dateParse(date2);
        return localDate1.compareTo(localDate2);
    }

    private static LocalDate dateParse(String date) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");
        if (date.contains("-")) {
            return LocalDate.parse(date);
        } else {
            return LocalDate.parse(date, df);
        }
    }

//    @Test
//    void sortStringDates() {
//        String[] dates = {"2000-12-01", "10/12/2000", "1970-08-12", "2010-10-05"};
//        String[] expected = {"1970-08-12", " 2000-12-01", "10/12/2000", "2010-10-05"};
//        String[] actual = DateOperation.sortStringDates(dates);
//        assertArrayEquals(expected, actual);
//    }
}

