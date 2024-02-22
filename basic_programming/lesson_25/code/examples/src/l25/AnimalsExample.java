package l25;

import java.util.Objects;
import java.util.Scanner;

class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }

    void sayHello() {
        System.out.println("Hello");
    }
}


class Dog extends Animal {
    public int color = 5;
    void swim() {}
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


class Human {
    void makeSound() {
        System.out.println("Some sound");
    }

    public int color = 5;
    void swim() {}
}


class PolymorphismExample0 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sayHello();
        cat.sayHello();
    }
}


class PolymorphismExample {
    public static void main(String[] args) {
        int murzikAge;

        // создать объект Dog но
        // воспринимать его как обычное животное
        Animal murzik = new Dog();
        // попытаться получить свойство (поле)
        // у murzik, и убедиться что это невозможно,
        // т.к. murzik - не собака, в нашей интерпретации
        // (мы относимся к музику не как к собаке, а как к животному)
//        murzikAge = murzik.color; // fail
        // аналогично
//        murzikAge = murzik.swim(); // fail

        // объявим новую переменную murzikDog
        // она будет отвечать за восприятие нашего-объекта-собаки
        // в роли собаки
        Dog murzikDog = (Dog) murzik;
        // теперь мы можем видеть все свойства собаки у murzikDog
        murzikAge = murzikDog.color;
        murzikDog.swim();

        Object qwerty = (Object) murzikDog;


        Animal[] animals = {new Animal(), new Dog(), new Cat()};

        for (Animal animal : animals) {
            // Выведет "Woof" для собаки и "Meow" для кошки
            animal.makeSound();
            if (animal.getClass() == Dog.class) {
                Dog dog = (Dog) animals[1];
                dog.swim();
            }
        }


    }
}




public class AnimalsExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();




        Animal myCat = new Cat();
        Object myAnimal = new Animal();
        Object myCatObj = new Cat();
    }
}


class Main1 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        System.out.println(myDog.hashCode());

        Dog myDog2 = new Dog();
        System.out.println(myDog2.hashCode());

        Animal myCat = new Cat();
        System.out.println(myCat.hashCode());

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.hashCode());

        String str1 = "askjaskajs";
        System.out.println(str1.hashCode());

        AnimalsExample ae = new AnimalsExample();
        System.out.println(ae.hashCode());
    }
}


class Main2 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Dog myDog2 = new Dog();
        Animal myCat = new Cat();
        Scanner scanner = new Scanner(System.in);
        String str1 = "askjaskajs";
        AnimalsExample ae = new AnimalsExample();

        Object[] objects = {myDog, myDog2, myCat, scanner, str1, ae};

        for (Object obj: objects) {
            System.out.println(obj.hashCode());
        }
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
