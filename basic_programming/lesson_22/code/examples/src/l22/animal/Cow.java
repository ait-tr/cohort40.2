package homeworks.l22.animal;

public class Cow extends Animal {
    String name;
    String color;

    public Cow (int weight, String name, String color) {
       super (weight);
       this.name = name;
        this.color = color;
    }

    public String toString() {
        return "Cow | " + weight + " | " + name + " | " + color + " | " ;
    }
}
