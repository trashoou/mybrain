package practice.month;

import practice.seasons.Season;

public enum Month {

    // имена константов в Java всегда задаются заглавными буквами
    JAN(31),FEB(28),MAR(31),APR(30),MAY(31),JUN(30),JUL(31),AUG(31),SEP(30),OCT(31),NOV(30),DEC(31);

    // поле класса
    private int days;


    // конструктор
    Month(int days) { // название класса enum и конструктора - совпадают
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Month plusMonth(int quantity) {
        int index = ordinal(); // взяли текущий номер месяца
        index = index + quantity; // увеличили
        Month[] values = values(); // определили массив values
        return values[index % values.length]; // index разделили с остатком на 12 = values.length
    }

    // метод увеличиваем кол-во месяцев
    public int addValueOfMonth(int quantity) {
        return getDays() + quantity;
    }

    //
    public String getName(int num) {
        Month[] values = values();
        return values[(num-1) % values.length].name();
    }
}
