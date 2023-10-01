package student_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StudentCode {
    public static void main(String[] args) {

        List<String> input = Arrays.asList("apple", "banana", "cherry");
        List<Integer> output = new ArrayList<>();


//        for(String s : input) {
//            output.add(s.length());
//        }

        input.stream()
                .map(i -> i.length())
                .forEach(i -> output.add(i));

        System.out.println(output);


    }
}
