package myhw;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample_N1 {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1,100)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> evenDoubledNumbers = numbers.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .collect(Collectors.toList());

        System.out.println(evenDoubledNumbers);
    }
}
