package cons_06.task_1;

public class Dog {

    private int age;
    private String color;
    private String name;
    private double weight;
    private boolean isHungry;

    public Dog() {

    }

    public Dog(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }
}