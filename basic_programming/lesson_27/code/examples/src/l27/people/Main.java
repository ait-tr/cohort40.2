package l27.people;


public class Main {
    public static void main(String[] args) {
        Person person1 = new Man("karl", 99);
        Person person2 = new Woman("karolina", 66);

//        IPerson person1 = new Man("karl", 99);
//        IPerson person2 = new Woman("karolina", 66);

        person2.askHelp();
        person1.askHelp();
        person2.talk();
        person1.talk();
        person1.startFriendship();
        person2.startFriendship();

        person1.doNothing();
        person2.doNothing();
    }
}
