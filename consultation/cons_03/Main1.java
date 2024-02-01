package cons_03;

import cons_01.pack_01.Cat;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {

        String hello = "Hello World!";
        Cat cat = new Cat();

        System.out.println(hello.toLowerCase());

        int[] array = getArray(7);
        System.out.println(Arrays.toString(array));

        array = getArray(15);
        System.out.println(Arrays.toString(array));

        array = getArray(22);
        System.out.println(Arrays.toString(array));
    }

    // 5 -> [1, 2, 3, 4, 5]
    public static int[] getArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = i + 1;
        }
        return result;
    }
}