package homework;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hw {
    public static void main(String[] args) {
        Map<String,LocalDate> persons = new HashMap<>();
        persons.put("Vasya",LocalDate.of(2002,6,12));
        persons.put("Nadya",LocalDate.of(2001,2,3));
        persons.put("Dima",LocalDate.of(2003,3,30));
        persons.put("Yana",LocalDate.of(2004,4,22));
        persons.put("Sasha",LocalDate.of(2000,7,26));

        System.out.println("Birthday Vasya is: "+persons.get("Vasya"));
        System.out.println("Removed: "+persons.remove("Vasya"));
        System.out.println(persons.containsKey("Vasya")+" cause 'Vasya' was removed.");
        System.out.println(persons.containsKey("Yana")+" cause 'Yana' still in list.");

        for (String name : persons.keySet()) {
            System.out.println(name+" | ");
        }
        persons.clear();
        System.out.println("==========");
        System.out.println("List 'persons' is empty ? "+persons.isEmpty());
    }
}
