package l23.people;

public class BadBoy extends Human {
    public BadBoy(String name, int age) {
        isMale = true;  // всегда true для BadBoy
        this.name = name;
        this.age = age;
    }

    public void applySkill() {
        takePhone();
    }

    public void takePhone() {
        System.out.println("Я отбираю ваш телефон");
    }
}
