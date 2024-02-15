package homeworks.l22.transport;

public class Car extends Transport {

    String color;

    public Car(String mark, int productionYear, String color) {
        super(mark, productionYear);
        this.color = color;
    }
    public String toString(){
        return "Car | " + mark + " | " + productionYear + " | "+ color;
    }
}
