package l23.people;

public class People {
    public String gender;
    String name;
    public int age;

    public People(String gender, String name, int age){
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return gender + ", " + this.name + ", " + age;
    }
}
