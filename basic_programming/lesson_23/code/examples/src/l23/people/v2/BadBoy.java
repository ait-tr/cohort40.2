package l23.people.v2;

public class BadBoy extends Human {
    public BadBoy(String name, int age) {
        // для isMale всегда true для BadBoy
        super(name, true, age);
    }

    public void applySkill() {
        takePhone();
    }

    public void takePhone() {
        System.out.println("Я отбираю ваш телефон");
    }
}
