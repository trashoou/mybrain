package student_code;

public class StudentCode {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());


        Thread.currentThread().setPriority(8);
        System.out.println(Thread.currentThread().getPriority());

        Thread.currentThread().setName("Super MAIN!!!!!");
        System.out.println(Thread.currentThread().getName());

        Thread thread = new Thread() {
            public void run() {
                Thread.currentThread().setName("child thread");
                System.out.println("child thread getName(): "+Thread.currentThread().getName());
                System.out.println("child thread getPriority(): "+Thread.currentThread().getPriority());
            }
        };

        thread.start();

        System.out.println("child thread getName(): (from main) "+thread.getName());
    }
}
