package student_code;

import java.util.Stack;

public class StudentCode {
    public static void main(String[] args) {
        //Queue queue = new LinkedList();
        Stack<Integer> stack = new Stack<>();

        // push - adding element on peek of Stack
        // peek of Stack = end of Stack.
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(7);

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println("Stack is empty or not ? "+stack.isEmpty());
        System.out.println("'7' contains stack ? "+stack.contains(7));
        System.out.println("'70' contains stack ? "+stack.contains(70));
        System.out.println("search '7' : "+stack.search(7));
        System.out.println(stack.pop()); // remove 7
        System.out.println(stack.pop()); // remove 4
        System.out.println(stack.pop()); // remove 3
        System.out.println(stack); // print stack - [1, 2]

        // return peek element from stack
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack);

        stack.clear();
        System.out.println(stack);
        System.out.println(stack.isEmpty());

        stack.push(17);
        stack.push(34);
        stack.push(76);
        stack.push(14);
        stack.push(90);
        stack.push(77);

        for (Integer i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();

        // с учетом того, что в основе стенка лежит массив, можно получить доступ по индексу:
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();

        // но тк основная задача стека - возвращать элемент с вершины стека, самым логичным кажется следующий цикл:
        while (!stack.isEmpty()) { // пока (!стек.пуст), те пока стек не пустой
            int x = stack.pop();
            System.out.print(stack.pop()+ " ");
        }
        System.out.println();
        System.out.println(stack);
    }
}
