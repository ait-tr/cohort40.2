package cons_08.task_02;

public class Animal {

    private int weight;

    public void printInfo() {
        System.out.println("Это животное");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private void test() {
        System.out.println("Это тестовый метод");
    }
}