package homeworks.l22;

import homeworks.l22.animal.Cat;
import homeworks.l22.animal.Cow;
import homeworks.l22.animal.Dog;
import homeworks.l22.people.Man;
import homeworks.l22.people.Woman;
import homeworks.l22.transport.Bike;
import homeworks.l22.transport.Bus;
import homeworks.l22.transport.Car;

public class L22Main {
    public static void main(String[] args){

        Cat cat = new Cat(5,"Musya", "red");
        System.out.println(cat);
        cat.printWhoAmI();

        Cow cow = new Cow(150, "Buryonka", "braun");
        System.out.println(cow);
        cow.printWhoAmI();

        Dog dog = new Dog(10, "Sharick", "dvornyaga");
        System.out.println(dog);
        dog.printWhoAmI();

        Bike bike = new Bike("Aist",1999,"blue");
        System.out.println(bike);
        bike.printWhoAmI();

        Car car = new Car("Volkswagen",2014,"silver");
        System.out.println(car);
        car.printWhoAmI();

        Bus bus = new Bus("Setra",2020,60);
        System.out.println(bus);
        bus.printWhoAmI();

        Man man = new Man("Vasya",39,"Businessman");
        System.out.println(man);
        man.printWhoAmI();

        Woman woman = new Woman("Masha", 33, "teacher", "Java");
        System.out.println(woman);
        woman.printWhoAmI();
    }
}
