package l23.protected_example.person;

public class Person {
    private String fname = "John";
    protected String lname = "Doe";
    protected String email = "john@doe.com";
    protected int age = 24;

    public static void main(String[] args) {
        Person person = new Person();
    }
}

