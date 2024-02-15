package l23.people.v2;

import java.util.Scanner;

public class BadGirl extends Human {

    public BadGirl(String name, int age) {
        // значение для isMale всегда false для BadGirl
        super(name, false, age);
    }

    // ... старые методы
    public void applySkill() {
        super.applySkill();
        System.out.println("зато я красивая");
    }

    public void sleep() {}

}
