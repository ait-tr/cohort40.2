package homeworks.l22.animal;

public class Cat extends Animal { //Cat IS-A Animal
    public String name;
    public String color;

   public Cat(int weight, String name, String color) {
       super(weight);
       this.name = name;
       this.color = color;
    }
    public String toString(){
       return "Cat | " + weight + " | " + name + " | " + color + " | ";
    }
}
