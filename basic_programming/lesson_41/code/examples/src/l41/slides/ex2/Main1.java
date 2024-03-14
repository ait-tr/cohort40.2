package l41.slides.ex2;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {
        // задали массив
        String[] strings = {"apple", "banana", "pineapple"};
        // создали конвеер из массива
        Stream<String> objectStream = Arrays.stream(strings);
        // задекларировали действия на конвеере
        objectStream = objectStream
                .filter(s -> s.contains("p"))
                .map(s -> "$" + s);

        // какой то код...

        // вызываем терминальную операцию, то есть запускаем конвеер
        objectStream.forEach(s -> System.out.println(s));
    }
}
