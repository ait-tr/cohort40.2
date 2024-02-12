package cons_07.task_01;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("John", 20);
        Person person2 = new Person("Jack", 25);

        System.out.println("Имя первого человека - " + person1.getName());
        System.out.println("Возраст первого человека - " + person1.getAge());

        person1.setAge(-15);

        System.out.println("Теперь возраст первого человека равен - " + person1.getAge());
    }
}