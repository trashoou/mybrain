package homework;

import java.util.Comparator;

public class OddComp implements Comparator<Integer> {

    @Override
    public int compare(Integer num1, Integer num2) {
        // Если оба числа четные или оба нечетные, оставляем их в исходном порядке
        if (num1 % 2 == num2 % 2) {
            return 0;
        }
        // Если первое число четное, а второе - нечетное, то они стоят в правильном порядке
        if (num1 % 2 == 0) {
            return -1;
        }
        // Если первое число нечетное, а второе - четное, то меняем их местами
        return 1;
    }
}
