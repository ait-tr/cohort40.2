package l36.slides.ex2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Создание HashSet
        Set<String> fruits = new HashSet<>();
        // Добавление элементов: add()
        fruits.add("Apple");
        fruits.add("Banana");
        boolean isNew = fruits.add("Cherry"); // Возвращает true, если элемент был добавлен
        System.out.println("Cherry добавлен? " + isNew);
        isNew = fruits.add("Apple"); // Попытка добавить дубликат "Apple"
        System.out.println("Apple добавлен повторно? " + isNew);

        // Размер набора: size()
        System.out.println("Всего фруктов: " + fruits.size());

        // Проверка наличия элемента: contains()
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Есть ли Apple? " + hasApple);

        // Удаление элемента: remove()
        boolean isRemoved = fruits.remove("Banana");
        System.out.println("Banana удален? " + isRemoved);

        // Проверка пуст ли набор: isEmpty()
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Набор пуст? " + isEmpty);

        // Очистка набора: clear()
        fruits.clear();
        isEmpty = fruits.isEmpty();
        System.out.println("Набор пуст после очистки? " + isEmpty);
    }
}
