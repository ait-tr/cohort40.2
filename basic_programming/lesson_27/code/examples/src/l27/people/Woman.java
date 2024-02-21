package l27.people;

public class Woman extends Person {
    public Woman(String name, int age){
        super("Woman", name, age);
    }

    @Override
    public void talk() {
        System.out.println("Что что? я была в наушниках");
        // ...
    }

    @Override
    public void startFriendship() {
        System.out.println("Я на улице не знакомлюсь");
        // ...
    }

    @Override
    public void askHelp() {
        System.out.println("Чем я могла бы вам помочь?");
        // ...
    }
}