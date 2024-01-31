package cons_02;

import cons_01.pack_01.Cat;

public class MyTest {

    private final int MY_VALUE = 5;

    public void testMyMethod() {
        System.out.println("Hi");
        int myAge = 12;
    }

    public void method2(Cat cat) {
        cat.meow();

        Object obj = new Cat();
    }
}