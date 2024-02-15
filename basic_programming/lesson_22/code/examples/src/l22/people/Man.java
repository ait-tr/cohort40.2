package homeworks.l22.people;
import java.util.Scanner;

public class Man extends People {

    String business;

    public Man(String name, int age, String business) {
        super(name, age);
        this.business = business;

    }
    public String toString(){
       return "Man | " + name + " | " + age + " | " + business;
    }
}
