package l23.people.v2;

public class Human {
    String name;
    boolean isMale;
    int age;
    // ... старые поля

    public Human(String name, boolean isMale, int age) {
        this.name = name;
        this.isMale = isMale;
        this.age = age;
    }

    // ... старые методы
    public void sayPhrase() {
        System.out.println("Меня звать " + name);
    }
    public void applySkill() {
        System.out.println("Я ничего не умею");
    }
}
