package cons_06.task_1;

import cons_06.task_2.*;

public class DogTest {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setAge(7);

        Dog dog2 = new Dog();
        dog2.setAge(5);

        Dog dog3 = new Dog();
        dog3.setAge(3);

        Test1 test1 = new Test1();
        Test2 test2 = new Test2();
        Test3 test3 = new Test3();

        Dog dog4 = new Dog("Бобик");
    }
}