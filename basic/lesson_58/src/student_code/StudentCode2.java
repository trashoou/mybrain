package student_code;

import java.util.ArrayDeque;
import java.util.Queue;

public class StudentCode2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("1 Thread + " + i);
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("2 Thread + " + i);
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread1.start();
        thread2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("3 Main + " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//        System.out.println("===========finish==========");
//
//        Queue<String> direction = new ArrayDeque<>();
//        String message = "{start: Berlin, finish: Milan, date: 25.12.2023}";
//        direction.add(message);
//        direction.poll();

    }
}
