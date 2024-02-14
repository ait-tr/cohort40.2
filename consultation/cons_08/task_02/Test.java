package cons_08.task_02;

public class Test {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.printInfo();

        Tiger tiger = new Tiger();
        tiger.printInfo();

        tiger.sleep();

        tiger.setWeight(200);
        System.out.println("Вес - " + tiger.getWeight());
    }
}