package student_code;

import java.util.concurrent.atomic.AtomicLong;

class Counter {
    private final AtomicLong value = new AtomicLong();  // Изначальное значение



    public void increment() {
        long oldValue, newValue;
        do {
            oldValue = value.get();  // Получаем текущее значение
            newValue = oldValue + 1;  // Увеличиваем его на 1
        } while (!value.compareAndSet(oldValue, newValue));  // Пытаемся установить новое значение. Если текущее значение не равно oldValue, начинаем сначала


    }


    public long getValue() {
        return value.get();
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.increment();
            }
        });
        long start = System.nanoTime();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final counter value: " + counter.getValue()+". Time: "+(System.nanoTime()-start));  // Выводит 2000, если все инкременты прошли успешно
    }
}
// Time: 54303000     Time: 56750700      Time: 54655800      Time: 65463200
// Time: 19574500     Time: 22276200      Time: 21695100      Time: 19966900