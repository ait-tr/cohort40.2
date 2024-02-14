package cons_08.task_03;

public class Cat {

    private int weight;
    private boolean isHungry;
    private String color;

    public Cat(int weight) {
        this.weight = weight;
        isHungry = true;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void printInfo() {
        System.out.println("Это кот");
        System.out.println("Его вес составляет " + weight);
        System.out.println(isHungry ? "Кот голоден" : "Кот сытый");
    }

    public void feedCat() {
        System.out.println("Кот получил 1 кг еды");
        weight++;
    }

    public void feedCat(int foodQuantity) {
        System.out.println("Кот получил " + foodQuantity + " кг еды");
        weight += foodQuantity;
        if (foodQuantity >= 3) {
            isHungry = false;
        }
    }

    public void feedCat(String foodBrand) {
        System.out.println("Кот получил 1 кг еды " + foodBrand);
        if ("Purina".equals(foodBrand)) {
            System.out.println("Коту очень понравилось!");
        }
        weight += 2;
    }
}