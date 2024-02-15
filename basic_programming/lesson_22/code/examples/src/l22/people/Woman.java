package homeworks.l22.people;

import java.util.Scanner;

public class Woman extends People {
    String business;
    String hobby;
    public Woman(String name, int age, String business, String hobby) {
        super(name, age);
        this.business = business;
        this.hobby = hobby;

    }
    public String toString(){
        return "Woman | " + name + " | " + age + " | " + business + " | " + hobby;
    }
}
