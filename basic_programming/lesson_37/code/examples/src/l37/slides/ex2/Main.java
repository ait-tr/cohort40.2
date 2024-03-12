package l37.slides.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CollectionsExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Сортировка списка
        // Сортирует список в алфавитном порядке
        Collections.sort(list);
        System.out.println("Отсортированный список: " + list);

        // Перемешивание списка
        // Меняет порядок элементов в списке на случайный
        Collections.shuffle(list);
        System.out.println("Перемешанный список: " + list);

        // Реверс списка
        // Меняет порядок элементов в списке на обратный
        Collections.reverse(list);
        System.out.println("Список в обратном порядке: " + list);

        // Заполнение списка одинаковыми элементами
        // Заполняет список одинаковыми значениями "Mango"
        Collections.fill(list, "Mango");
        System.out.println("Список после заполнения: " + list);

        // Добавление элементов для демонстрации swap
        list.add("Pineapple");
        list.add("Grape");

        // Обмен элементов
        // Меняет местами элементы с индексами 1 и 4
        Collections.swap(list, 1, 4);
        System.out.println("Список после обмена элементов: " + list);

        // Бинарный поиск по списку
        int result = Collections.binarySearch(list, "Pineapple");
        System.out.println("binarySearch: " + result);
    }
}
