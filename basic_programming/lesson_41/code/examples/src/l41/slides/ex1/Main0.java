package l41.slides.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main0 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "pineapple");

        // ex1
        for (String fruit : fruits) {
            int strLength = fruit.length();
            System.out.println(strLength);
        }
        System.out.println("----------");
        // ex2
        for (String fruit : fruits) {
            String newStr = "$" + fruit;
            System.out.println(newStr);
        }
        System.out.println("----------");
        // ex3
        for (String fruit : fruits) {
            if (!fruit.contains("p")) {
                continue;
            }

            String newStr = "$" + fruit;
            System.out.println(newStr);
        }
    }
}
