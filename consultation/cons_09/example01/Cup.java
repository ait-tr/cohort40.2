package cons_09.example01;

public class Cup implements Comparable<Cup> {
    private double volume;
    private String color;
    private double price;

    public Cup(double volume, String color, double price) {
        this.volume = volume;
        this.color = color;
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Cup o) {
        if (this.volume < o.volume) {
            return -1;
        }
        else if (this.volume > o.volume) {
            return 1;
        }
        return 0;
    }
}
