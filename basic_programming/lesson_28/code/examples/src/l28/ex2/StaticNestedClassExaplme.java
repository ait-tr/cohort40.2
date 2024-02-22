package l28.ex2;


class Car {
    static String color = "Blue";

    String name;
    private int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    static class Garage {
        String owner;

        Garage(String owner) {
            this.owner = owner;
        }

        boolean checkColor(String color) {
            return Car.color.equals(color);
        }
    }
}


class Main {
    public static void main(String[] args) {
        Car.Garage garage = new Car.Garage("karl");
        garage.checkColor("Red");
    }
}