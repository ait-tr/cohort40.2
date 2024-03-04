package l35.slides.ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Сравнение основано на возрасте
    @Override
    public int compareTo(Person anotherPerson) {
        return this.age - anotherPerson.age;
    }
}

class NameComparator implements Comparator<Person> {
    // Сравнение основано на именах
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}

class PersonComparator implements Comparator<Person> {
    // Сравнение основано на именах
    @Override
    public int compare(Person p1, Person p2) {
        return p1.compareTo(p2);
    }
}

class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.sort((o1, o2) -> o1.age - o2.age);
        list.sort(new PersonComparator());
        list.sort((o1, o2) -> o1.compareTo(o2));
    }
}