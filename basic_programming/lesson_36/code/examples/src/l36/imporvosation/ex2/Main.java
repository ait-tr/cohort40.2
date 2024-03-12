package l36.imporvosation.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);

        System.out.println(
            list.stream().filter(o -> o >= 3).findFirst()
        );

        System.out.println(
                Arrays.asList(1,2,4,5)
        );
    }
}
