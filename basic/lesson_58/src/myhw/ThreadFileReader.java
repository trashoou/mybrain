package myhw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThreadFileReader {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            String fileName1 = "hello_world.txt";
            try {
                BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
                String line;
                while ((line = reader1.readLine()) != null ) {
                    System.out.print(line + " ");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(() -> {
            String fileName2 = "how_are_you.txt";
            try {
                BufferedReader reader1 = new BufferedReader(new FileReader(fileName2));
                String line;
                while ((line = reader1.readLine()) != null ) {
                    System.out.print(line + " ");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
    }
}
