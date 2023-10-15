package student_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class StudentCode2 {
    private static ArrayList<Integer> arrayList = new ArrayList<>(100_000);
    private static Vector<Integer> vector = new Vector<>(100_000);
    private static CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

    private static int count = 10_000;

    private static void startAdding (List<Integer> list) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < count; i++) {
                list.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < count; i++) {
                list.add(i);
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < count; i++) {
                list.add(i);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
//        long startAL = System.nanoTime();
//        startAdding(arrayList);
//        System.out.println("ArrayList.size: "+ arrayList.size() + ", time to fill ArrayList: "+ (System.nanoTime()-startAL));

//        long startV = System.nanoTime();
//        startAdding(vector);
//        System.out.println("Vector.size: "+ vector.size() + ", time to fill Vector: "+ (System.nanoTime()-startV));
//
        long startCW = System.nanoTime();
        startAdding(copyOnWriteArrayList);
        System.out.println("copyOnWriteArrayList.size: "+ copyOnWriteArrayList.size() + ", time to fill copyOnWriteArrayList: "+ (System.nanoTime()-startCW));
    }

    //   ArrayList.size:          16747, time to fill       ArrayList:      5552399
    //    Vector.size:            30000, time to fill        Vector:        8685300
    // copyOnWriteArrayList.size: 30000, time to fill copyOnWriteArrayList: 350657501

}
