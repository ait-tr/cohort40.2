package cons_10.example03;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Hey");
        set.add("Hello");
        set.add("Hi");
        set.add("Hello world!");

        System.out.println(set);
    }
}
