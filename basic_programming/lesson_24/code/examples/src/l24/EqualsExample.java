package l24;

import java.util.Objects;

class Person {
    private String name;
    private int age;

    private static int stringToInt(String str) {
        return str.hashCode();
    }

    // тут должен быть конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    простой пример:
//    public boolean equals(Person person) {
//        return this.age == person.age && this.name.equals(person.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return 81822 * this.age + 3223822 * stringToInt(this.name);
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Person person = (Person) obj;
        return age == person.age && (
                name == null ? person.name == null : name.equals(person.name)
        );
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Karl", 112);
        Person person2 = new Person("Karl", 112);

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
