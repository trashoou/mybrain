package myhw;

import java.util.ArrayList;
import java.util.List;

@java.lang.FunctionalInterface
interface Action<T> {
    void execute(T t);
}

@java.lang.FunctionalInterface
interface Condition<T> {
    boolean test(T t);
}

@java.lang.FunctionalInterface
interface Provider<R> {
    R provide();
}

public class FunctionalInterface {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Пример 1: Используем Action для вывода числа
        Action<Integer> printNumber = num -> System.out.println("Number: " + num);
        numbers.forEach(printNumber::execute);

        // Пример 2: Используем Condition для проверки числа
        Condition<Integer> isEven = num -> num % 2 == 0;
        for (Integer num : numbers) {
            if (isEven.test(num)) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
        }

        // Пример 3: Используем Provider для создания нового числа
        Provider<Integer> generateRandomNumber = () -> (int) (Math.random() * 100);
        Integer randomNum = generateRandomNumber.provide();
        System.out.println("Random number: " + randomNum);
    }
}
