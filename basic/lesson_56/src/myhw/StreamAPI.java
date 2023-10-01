package myhw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,3,4,5);
        List<Integer> output = input.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(output);

        List<String> input1 = Arrays.asList("apple", "banana", "cherry");

        List<Integer> output2 = input1.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(output2);

        List<Integer> input2 = Arrays.asList(1, 2, 3, 4, 5);

        long count = input2.stream()
                .filter(i -> i % 2 == 0)
                .count();

        System.out.println(count);
    }
}
