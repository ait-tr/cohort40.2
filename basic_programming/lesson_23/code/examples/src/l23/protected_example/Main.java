package l23.protected_example;


import l23.protected_example.person.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
//        System.out.println(person.age);  // fail
    }
}


// доступно из методов самого класса
// доступно в рамках всего пакета где лежит класс
// доступно из статических методов дочернего класса в другом пакете


/*
 * public
 *
 * protected
 * private
 * */