package practice;

public class Classwork {

    public static void main(String[] args) throws InterruptedException {
        //task1();
        //      task2();
    //  task3();
//        task4();
        task5();
    }

    /**
     * Задача 1: Создать два потока, один поток должен выводить четные числа от 0 до 10, а другой - нечетные числа от 1 до 9.
     */
    public static void task1() throws InterruptedException {
        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() { // переопределяем метод run()
                for (int i = 0; i < 10; i++) {  // пробегаем до 10
                    if (i % 2 == 0) { // проходим по условию и вытаскивам только четные.
                        System.out.println("Thread "+i+" is Even.");
                    }
                }
            }
        });

        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() { // переопределяем метод run()
                for (int i = 0; i < 9; i++) { // пробегаем до 9
                    if (!(i % 2 == 0)) { // проходим по условию и вытаскивам только нечетные.
                        System.out.println("Thread "+i+" is Odd.");
                    }
                }
            }
        });

        evenThread.start(); // .start() - запуск потока в параллель
        evenThread.join(); // .join() - ожидание пока поток (evenThread) не завершит свою работу
        oddThread.start();
    }

    /**
     * Задача 2: Создать поток, который выводит числа от 1 до 5 с интервалом в 1 секунду, после чего главный поток выводит "Завершено".
     */
    public static void task2() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        Thread.sleep(250);
                        System.out.println("Thread 2 + "+i);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();
        thread.join();

        System.out.println("Завершено");
    }

    /**
     * Задача 3: Создать поток, который ждет 5 секунд перед тем как вывести "Поток завершен", главный поток должен дождаться завершения этого потока.
     */
    public static void task3() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Поток завершен");
            }
        });

        thread.start();
        System.out.println("Finish!");


    }

    /**
     * Задача 4: Создать два потока, которые выводят "Поток 1" и "Поток 2" соответственно, каждые 1 и 3 секунды.
     */
    public static void task4() {
        Thread thread1 = null;

        Thread thread2 = null;

        thread1.start();
        thread2.start();
    }

    /**
     * Задача 5: Создать поток, который выводит числа от 10 до 1, после чего главный поток выводит "Старт".
     */
    public static void task5() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 10; i > 0; i--) {
                        System.out.println("Thread: " + i);

                }
            }
        });
        thread.start();
        thread.join();
        System.out.println("MAIN Thread JOIN NOW!!!!!!!!!!!");
        System.out.println("Good Night");
        System.out.println("...");
    }
}
