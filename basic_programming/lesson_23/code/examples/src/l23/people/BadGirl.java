package l23.people;

public class BadGirl extends Human {
    public BadGirl(String name, int age) {
        isMale = false;  // всегда false для BadGirl
        this.name = name;
        this.age = age;
    }

    public void applySkill() {
        System.out.println("Я открываю пиво глазом");
    }
}
