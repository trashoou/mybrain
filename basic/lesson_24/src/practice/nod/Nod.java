package practice.nod;

public class Nod {
    public int nod (Integer a, Integer b) {
        // НОД (18, 24) = 6 , (48, 24) = 24 , НОД (50, 40) = 10
        // шаг 1 - найти меньшее из данных двух чисел
        // шаг 2 - надо перебрать все числа меньшие меньшего из наших данных двух чисел

        Integer nod = 1;
        // шаг 1 - найти меньшее из данных двух чисел
        Integer min = a;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        Integer res = 0;
        while (nod <= min) {
            if (a % nod == 0 && b % nod == 0) {
                res = nod;
            }
            nod++;
        }
        return res;
    }
}
