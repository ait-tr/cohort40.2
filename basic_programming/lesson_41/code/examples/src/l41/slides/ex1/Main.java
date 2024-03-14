package l41.slides.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Qwerty");
        words.add("QWE");
        words.add("QWEQWE");

        long count = words.stream()
                        .filter(s -> s.length() > 5)
                        .count();
        // without streams:
        // long count = 0;
        // for (String s : words) {
        //     if (s.length() > 5) {
        //         count++;
        //     }
        // }
    }
}
