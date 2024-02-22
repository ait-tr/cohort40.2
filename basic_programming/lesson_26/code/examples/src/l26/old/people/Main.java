package l26.old.people;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Man("karl", 99);
        Person person2 = new Woman("karolina", 66);
//        Person person3 = new Person("Man", "karl", 99);

        person2.askHelp();
        person1.askHelp();
        person2.talk();
        person1.talk();
        person1.startFriendship();
        person2.startFriendship();
    }
}
