package myhw;

public class ThreadPriority {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
           while (true) {
               System.out.println(Thread.currentThread().getName() +", Priority: "+Thread.currentThread().getPriority());
           }
        });
        thread1.setPriority(5);

        Thread thread2 = new Thread(() -> {
            while (true) {
                System.out.println(Thread.currentThread().getName() +", Priority: "+Thread.currentThread().getPriority());
            }
        });
        thread1.setPriority(3);

        Thread thread3 = new Thread(() -> {
            while (true) {
                System.out.println(Thread.currentThread().getName() +", Priority: "+Thread.currentThread().getPriority());
            }
        });
        thread1.setPriority(8);
        thread1.setName("Thread-1");
        thread2.setName("Thread-2");
        thread3.setName("Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
