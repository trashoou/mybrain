package practice.student_sandbox_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class StudentSandbox3 {
    // приммеры работы Linked
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();


        // в LinkedList 2 коснтруктора - пустой и который принимает экземпляр класса Collections
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        // "one" -> "two" -> "three"

        linkedList.get(1); // two

        linkedList.add(1, "four"); // "one" -> "four" -> "two" -> "three"
        linkedList.set(1, "five"); // "one" -> "five" -> "two" -> "three"

        linkedList.size(); // вернет кол-во элементов в листе (число)

        // arrayList [one] [two] [three] .add(1, "four");
        // [one] [two] [three] [] -> [one] [two] [] [three] -> [one] [] [two] [three] -> [one] [four] [two] [three]

        // file1 -> ArrayList<FUTURES> -> validation -> Collection<FUTURES> afterValidation -> file2


    }
}
