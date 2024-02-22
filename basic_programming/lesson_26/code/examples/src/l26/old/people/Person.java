package l26.old.people;


public abstract class Person {
    public String gender;
    String name;
    public int age;

    public Person(String gender, String name, int age){
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public abstract void talk();
    public abstract void startFriendship();
    public abstract void askHelp();

    @Override
    public String toString() {
        return gender + ", " + this.name + ", " + age;
    }
}
