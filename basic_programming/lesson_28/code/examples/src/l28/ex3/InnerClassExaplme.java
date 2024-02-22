package l28.ex3;


class Car {
    String name;
    private int year;
    Engine myEngine;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
        this.myEngine = this.new Engine();
    }

    class Engine {
        void makeSound() {
            System.out.println("вжжжжжжжжжжжж");
        }

        void start() {
            System.out.println(
                "Запускаем мотор машины " +
                Car.this.name + " " + Car.this.year
            );
        }
    }
}


class Main1 {
    public static void main(String[] args) {
        // engine1 -> car1
        Car car1 = new Car("mazda", 1976);
        //                   this.new Engine();
        Car.Engine engine1 = car1.new Engine();
        engine1.makeSound();
        engine1.start();
    }
}

class Main2 {
    public static void main(String[] args) {
        // engine1 <-> car1
        Car car1 = new Car("mazda", 1976);
        car1.myEngine.makeSound();
        car1.myEngine.start();
    }
}
































