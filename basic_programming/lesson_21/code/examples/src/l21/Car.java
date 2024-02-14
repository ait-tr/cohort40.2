package l21;

public class Car {
    private String vendor;
    private int productionYear;

    public Car(String vendor, int productionYear){
        this.vendor = vendor;
        this.productionYear = productionYear;
    }

    public String toString() {
        return "Car: " + this.vendor + " - " + productionYear;
    }
}