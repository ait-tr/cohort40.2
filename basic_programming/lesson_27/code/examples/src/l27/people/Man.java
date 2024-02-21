package l27.people;

public class Man extends Person {

    public Man(String name, int age){
        super("Man", name, age);
    }

    @Override
    public void talk() {
        System.out.println(
            "С удовольствием с вами бы погболтал, " +
            "но у меня очень много работы"
        );
        // ...
    }

    @Override
    public void startFriendship() {
        System.out.println("У меня есть время вечером, пойдем гулять");
        // ...
    }

    @Override
    public void askHelp() {
        System.out.println("Чем я могу вам помочь?");
        // ...
    }

}