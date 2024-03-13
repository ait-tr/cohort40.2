package cons_12;

import java.util.Arrays;

public class Main03 {
    public static void main(String[] args) {
        int[] arr = { 4, 8, -5, 1, 3, -1, 654, -21, 324, -16, 564, 65, -165, 16, 51, -65 };

        long size = Arrays.stream(arr)
                .filter(i -> i < 0)
                .count();

        System.out.println(size);

        size = Arrays.stream(arr)
                .filter(i -> i % 2 == 0)
                .count();
        System.out.println(size);
    }
}
