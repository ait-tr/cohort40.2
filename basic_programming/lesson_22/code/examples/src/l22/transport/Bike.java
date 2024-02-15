package homeworks.l22.transport;

public class Bike extends Transport {
    String color;

    public Bike(String mark, int productionYear, String color) {
        super(mark, productionYear);
        this.color = color;
    }

    public String toString(){
        return "Bike | " + mark + " | " + productionYear + " | "+ color;
    }
}
