package l26;


// абстрактный класс
abstract class Animal {
    abstract void makeSound(); // Абстрактный метод

    void breathe() {
        System.out.println("Animal is breathing");
    }
}



/*


class vs interface

class - множественное наследование недоступно
interface - можете реализовать сразу несколько интерфейсов

> да, а что такое интерфейсы?

контракт взаимодействия с объектом того или иного типа




* */


class Dog extends Animal {
    void swim() {
        System.out.println("Swim");
    }

    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}


class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

abstract class AnimalInSky extends Animal {
}


public class AnimalsExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();

        Animal myCat = new Cat();
        Cat myCat2 = new Cat();
//        Animal myAnimal = new Animal();
    }
}


class Main1 {
    public static void main(String[] args) {

    }
}


class Computer {
    void enable() {
        System.out.println("computer is enabled");
    }

    void disable() {
        System.out.println("computer is disabled");
    }
}


class ComputerWithoutProtection extends Computer {
    void removeHDD() {
        System.out.println("hdd is removed");
    }

    void insertHDD() {
        System.out.println("hdd is inserted");
    }

    // взрываем компьютер по кнопке
    void blowUp() {
        System.out.println("Computer is blown up");
    }
}


class PolymorphismExampleComputer {
    public static void main(String[] args) {
        ComputerWithoutProtection computerWithoutProtection = new ComputerWithoutProtection();
        // компьютер надо показать бабушке чтобы она его включила и не взорвала
        // закрываем крышку компьютера
        Computer computer = (Computer) computerWithoutProtection;
        System.out.println("пришла бабушка");
        System.out.println("показываем бабушке компьютер и просим включить, ее действия:");
        computer.enable();
    }
}


class PolymorphismExampleFewComputer {
    public static void main(String[] args) {
        ComputerWithoutProtection computerWithoutProtection1 = new ComputerWithoutProtection();
        ComputerWithoutProtection computerWithoutProtection2 = new ComputerWithoutProtection();

        // компьютер надо показать бабушке чтобы она его включила и не взорвала
        // закрываем крышку компьютера
        Computer[] office = {
                (Computer) computerWithoutProtection1,
                (Computer) computerWithoutProtection2
        };

        System.out.println("пришла бабушка");
        System.out.println("показываем бабушке компьютеры и просим включить их, ее действия:");
        for (Computer comp : office) {
            comp.enable();
        }
    }
}


class PolymorphismExampleComputerBadWay {
    public static void main(String[] args) {
        ComputerWithoutProtection computerWithoutProtection = new ComputerWithoutProtection();
        // компьютер надо показать бабушке чтобы она его включила и не взорвала
        // закрываем крышку компьютера
        System.out.println("пришла бабушка");
        System.out.println("показываем бабушке компьютер и просим включить, ее действия:");
        computerWithoutProtection.blowUp();
    }
}
