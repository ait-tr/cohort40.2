package l41.slides.ex2;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "pineapple"};

        Stream<String> objectStream = Arrays.stream(strings);
        // то же самое что выше
        // objectStream = Stream.of(strings);
        objectStream
            .filter(s -> s.contains("p"))
            .map(s -> "$" + s)
            .sorted()
            .forEach(s -> System.out.println(s));

        System.out.println("----------");

        IntStream.range(0, 33)
                .filter(i -> i % 2 == 0)
                .filter(i -> i % 3 == 0)
                .map(i -> i + 20)
                .map(i -> i + 20)
                .map(i -> i + 20)
                .map(i -> i + 20)
                .map(i -> i + 20)
                .map(i -> i + 20)
                .map(i -> i + 20)
                .forEach(i -> System.out.println(i));
    }
}
