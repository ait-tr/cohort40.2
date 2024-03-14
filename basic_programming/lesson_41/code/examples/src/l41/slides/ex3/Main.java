package l41.slides.ex3;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(0, 10)
                .filter(i -> i % 2 == 0)
                .peek(e -> System.out.println(e))
                .map(i -> i + 20)
                .forEach(i -> System.out.println(i));
    }
}
