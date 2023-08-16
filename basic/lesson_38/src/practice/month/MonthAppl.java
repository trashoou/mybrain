package practice.month;

public class MonthAppl {
    public static void main(String[] args) {
//        Month[] months = Month.values();
//        for (Month month : Month.values()) {
//            System.out.println(month.name() + ": " + month.getDays());
//        }

        Month month = Month.DEC;
        System.out.println(month);
        System.out.println(month.plusMonth(3));
        System.out.println(11 % 12);
        System.out.println(month.getDays());
        System.out.println(month.addValueOfMonth(5));
        System.out.println(month.getName(14));
    }
}
