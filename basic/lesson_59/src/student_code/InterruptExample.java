package student_code;

public class InterruptExample {
    public static void main(String[] args) {
        // Создаем и запускаем поток, который может быть прерван
        Thread sleepingThread = new Thread(createSleepingRunnable());
        sleepingThread.start();

        // Ждем 2 секунды и затем прерываем sleepingThread
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sleepingThread.interrupt();

        if (sleepingThread.isInterrupted()) {
            System.out.println("Thread "+ sleepingThread.getName() + " has already interrupted");
        } else {
            System.out.println("Thread "+ sleepingThread.getName() + " was not interrupted");
            sleepingThread.stop();
            System.out.println(sleepingThread.getName());
        }
    }



    // Метод, создающий Runnable, который "спит" и обрабатывает прерывание
    private static Runnable createSleepingRunnable() {
        return () -> {
            try {
                // Поток "спит" 10 секунд или до тех пор, пока его не прервут
                System.out.println("Going to sleep");
                Thread.sleep(10000);
                System.out.println("Woke up naturally");
            } catch (InterruptedException e) {
                // Если поток был прерван во время сна, он войдет сюда
                System.out.println("Was interrupted while sleeping");
            }
            Thread.currentThread().interrupt();
        };
    }
}
