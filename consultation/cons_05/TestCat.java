package cons_05;

public class TestCat {

    public static void main(String[] args) {

        int i = 5;
        Cat cat1 = new Cat();
        cat1.color = "Чёрный";

        Cat cat2 = new Cat();
        cat2.color = "Рыжий";

        System.out.println("Цвет первого кота - " + cat1.color);
        System.out.println("Цвет второго кота - " + cat2.color);
        System.out.println("Первый кот - " + cat1);

        cat1.age = 7;
        cat2.age = 3;

        System.out.println("Возраст первого кота - " + cat1.age);
        System.out.println("Возраст второго кота - " + cat2.age);

        System.out.println("Просим котов помяукать");
        cat1.sayMeow();
        cat2.sayMeow();

        Cat.info();
//        Cat.sayMeow(); мы не можем обращаться к нестатическому методу через класс,
        // т.к. нестатический метод принадлежит объекту и является
        // поведением конкретного объекта

        cat1.legs_count = 5;
        System.out.println("Количество лап - " + cat2.legs_count);

        cat1.age = 12;
        System.out.println("Возраст второго кота - " + cat2.age);

        cat1.hungry = true;
        cat2.hungry = true;

        System.out.println("Проверяем состояние котов:");
        cat1.isCatHungry();
        cat2.isCatHungry();

        System.out.println("Кормим первого кота и снова проверяем состояние");
        cat1.feedCat();
        cat1.isCatHungry();
        cat2.isCatHungry();

        System.out.println("Кормим второго кота");
        cat2.feedCat();
        cat1.isCatHungry();
        cat2.isCatHungry();
    }
}