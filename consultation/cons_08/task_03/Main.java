package cons_08.task_03;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat(5);

        cat.printInfo();
        cat.feedCat();
        cat.printInfo();

        cat.feedCat(3);
        cat.printInfo();

        cat.feedCat("Purina");
        cat.printInfo();
    }
}