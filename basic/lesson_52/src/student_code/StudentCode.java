package student_code;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentCode {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(34, "Ilyas");
        map.put(21, "Alexandru");
        map.put(309, "Dmitriy");
        map.put(45, "Elena");
        map.put(15, "Alla");
        map.put(689, "Natalie");
        map.put(-347, "Radu");
        map.put(0, "Sandor");
        map.put(901, "Sergey");
        map.put(101, "Vyacheslav");
        map.put(null, "AIT");
        map.put(null, "School");

        map.put(764, null);
        map.put(876, null);
        map.put(134, null);

        if (!map.containsKey(34)) {
            map.put(34, "Ilyas Miftakhov");
        }

        Map<Integer, String> anotherMap = new HashMap<>();
        //Map<Integer, String> anotherMap = new HashMap<>(map);
        anotherMap.putAll(map);

        for (Integer i : anotherMap.keySet()) {
            System.out.printf("Key %d : value %s\n", i, anotherMap.get(i));
        }
    }
}
