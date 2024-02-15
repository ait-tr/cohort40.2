package l22;


class Transport {
    public String model;
    public int year;

    public Transport(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void printWhoAmI() {
        System.out.println("I'm transport method" + model);
    }
}

// Car IS-A Transport
class Car extends Transport {
    public final int passengersCount;
    public int mileage;

    public Car(String model, int year, int pC) {
        super(model, year);
        this.passengersCount = pC;
        this.mileage = 10000;
    }

    public void printWhoAmIA() {
        System.out.println("I am a car: start printWhoAmIA");
        super.printWhoAmI();
        System.out.println("I am a car: finish printWhoAmIA");
    }

    public void printWhoAmI() {
        System.out.println("I am a car: start printWhoAmI");
        super.printWhoAmI();
        System.out.println("I am a car: finish printWhoAmI");
    }
}


class Main {
    public static void main(String[] args) {
        Car car = new Car("bmw", 2000, 4);

        car.printWhoAmIA();
        car.printWhoAmI();
    }
}