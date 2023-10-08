package practice;

public class Classwork {

    public static void main(String[] args) throws InterruptedException {
        Classwork tasks = new Classwork();
//       tasks.task1();
        tasks.task2();
//        tasks.task3();
//        tasks.task4();
//        tasks.task5();
    }

    // Задача 1: Создание и старт двух потоков
    public void task1() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            Thread.currentThread().setName("Thread 1");
            System.out.println(Thread.currentThread().getName());
        });

        Thread thread2 = new Thread(() -> {
            Thread.currentThread().setName("Thread 2");
            System.out.println(Thread.currentThread().getName());
        });

        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
        thread1.start();
        thread2.start();
    }

    // Задача 2: Использование метода sleep()
    public void task2() {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Wake up!");
        });
        thread.start();
        if (Thread.currentThread().isInterrupted()) {
            System.out.println("Thread is interrupted");
        } else {
            System.out.println("Thread wasn't interrupted");
        }
    }

    // Задача 3: Установка и получение приоритета потока. создайте поток, установите для него максмально возможный
    // приоритет. Выведите на экран "Task 3: Thread Priority: ..."
    public void task3() {
        Thread thread = null;

        thread.start();
    }

    // Задача 4: Использование join() для ожидания завершения потока. Создайте поток, который печатает числа от 1 до 5
    // с интервалом в 1с, главный поток должен дождаться выполнения этого потока
    public void task4() {
        Thread thread = null;

        thread.start();


        System.out.println("Task 4: Thread has finished execution");
    }

    // Задача 5: Использование потока-демона. Создайте демон-поток, который каждые 500 мс печатает в консоль
    // "Task 5: Daemon Thread is running", дайте поработать данному потоку 2 секунды, потом завршите выполнение
    // главного потока
    public void task5() {
        Thread daemonThread = null;

        daemonThread.start();

        // Позволим демону поработать 2 секунды перед завершением основного потока

        System.out.println("Task 5: Main Thread is finishing and daemon will be terminated");
    }
}
