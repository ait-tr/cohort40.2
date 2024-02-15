package homeworks.l22.animal;

public class Dog extends Animal {
    String name;
    String breed;


    public Dog(int weight, String name, String breed) {
        super (weight);
        this.name = name;
        this.breed = breed;
    }

    public String toString(){
        return "Dog | " + weight + " | " + name + " | " + breed + " | ";

    }
}
