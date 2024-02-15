package l23.people;

public class Human {
    String name;  // имя
    boolean isMale;  // пол, если true - мужчина, иначе - женщина
    int age; // возраст
    // ... остальные свойства

    public void sayPhrase() {
        System.out.println("Меня звать " + name);
    }
    public void applySkill() {
        System.out.println("Я ничего не умею");
    }
    // ... остальное поведение (методы)
}
