package cons_07.task_02;

import cons_07.task_01.Person;

public class Main {

    public static void main(String[] args) {

        String[] fruits = {"Banana", "Orange", "Apple", "Peach", "Pear"};

        // Вывести названия фруктов каждый с новой строки

//        for (int i = 0; i < fruits.length; i++) {
//            System.out.println(fruits[i]);
//        }

//        for (String currentFruit : fruits) {
//            System.out.println(currentFruit);
//        }

        // Вывести названия фруктов каждый с новой строки,
        // при этом нумеруя строки, например - 1. Banana

//        for (int i = 0; i < fruits.length; i++) {
//            System.out.println(i + 1 + ". " + fruits[i]);
//        }
        printAge(new Person("John", 25));
    }

    // Написать метод, который на вход принимает объект человека,
    // выводит его возраст в консоль до тех пор, пока возраст не
    // достигнет 20, при этом увеличивая возраст на 1

    public static void printAge(Person person) {
        while (person.getAge() <= 20) {
            System.out.println("Возраст - " + person.getAge());
            person.setAge(person.getAge() + 1);
        }
    }
}