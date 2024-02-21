package l27.people;


public abstract class Person implements IPerson {
    public String gender;
    String name;
    public int age;

    public Person(String gender, String name, int age){
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public void doNothing() {
        System.out.println("ничего не делаю");
    }

    @Override
    public String toString() {
        return gender + ", " + this.name + ", " + age;
    }
}
