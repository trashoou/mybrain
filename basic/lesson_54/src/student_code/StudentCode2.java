package student_code;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class StudentCode2 {
    public static void main(String[] args) {
        //Queue<String> queue = new PriorityQueue<>(); // сама сортирует
        Queue<String> queue = new ArrayDeque<>();

        // методы add и offer очень похожи и выполняют одну и ту же логику - добавляют элемент в конце очереди
        // но, если очередь ограничена размером, то метод add может привести к исключениям, а offer - нет
        // добавляем в конец очереди
        queue.add("one");
        queue.add("two");
        queue.add("three");

        queue.offer("four");
        queue.offer("five");

        System.out.println(queue); // [one, two, three, four, five]

        System.out.println(queue.size()); // 5

        System.out.println(queue.isEmpty()); // false

        System.out.println(queue.contains("four")); // true

        System.out.println(queue.contains("gga")); // false

        // метод poll - аналогичен методу pop в стеке, но предоставит первый элемент:
        // если очередь пуста, получим Null
        System.out.println("queue.poll() "+queue.poll()); // getting first element of queue - [one]
        System.out.println(queue);
        // метод remove - аналогичен методу poll, но может привести к Exception
        System.out.println("queue.remove() "+queue.remove());
        System.out.println(queue);

        // метод peek в Queue аналогичен по логике одноименному методу в Stack,
        // но вернет первый элемент без его удаления:
        System.out.println("queue.peek() "+queue.peek());
        // т.к. ничего не удалили из очереди, то и результат будет аналогичен:
        System.out.println("queue.peek() "+queue.peek());

        // по своей логике абсолютно аналогичен методу peek, но в пустой очереди выброси Exception
        System.out.println("queue.element() "+queue.element());
        System.out.println(queue);

        queue.clear(); // .clear - вернет пустую очередь
        System.out.println(".size "+queue.size());
        System.out.println(".isEmpty "+queue.isEmpty());

        System.out.println("queue.peek() with empty queue "+queue.peek());
        System.out.println("queue.poll() with empty queue "+queue.poll());


        System.out.println("     Test === queue.element()");
        try {
            System.out.println(queue.element());
        } catch (NoSuchElementException e) {
            System.out.println("Cant make queue.element() with empty queue,\nNoSuchElementException has been threw");
        }

        System.out.println("     Test === queue.remove()");
        try {
            System.out.println(queue.remove());
        } catch (NoSuchElementException e) {
            System.out.println("Cant make queue.element() with empty queue,\nNoSuchElementException has been threw");
        }
        // Т.к очередь пуста, для дальнешей демонстрации повторно запооняем её
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.offer("four");
        queue.offer("five");




        // перебор всех элементов в очереди:
        // т.к Queue - часть Collection, то мы можем использовать итератор, для перебора всех элементов
        // порядок элементов сохраниться, ничего из очереди не удаляется
        System.out.println("Queue iteration: ");
        for (String s : queue) {
            System.out.print(s+" ");
        }
        System.out.println("\nОчередь после итерации: "+queue);

        // Интерфейс Queue не предусматривает получение к элементу очереди по индексу,
        // но данная возможность есть в отдельно взятых классах

        // самым логическим верным перебором очереди будет перебор при помощи метода poll,
        // "вынимая" (удаляя) каждый раз первый элемент в очереди:

        while(!queue.isEmpty()) { // пока (!очередь.пуста)
            System.out.print(queue.peek() + " ");
        }
        System.out.println("\nОчередь после перебора всех элементов при помощи метода poll " + queue);






    }
}
