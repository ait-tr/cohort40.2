package l29.linkedlist;

import java.util.LinkedList;


class LinkedListExample {
    public static void main(String[] args) {
        // Создание экземпляра LinkedList
        LinkedList<String> names = new LinkedList<String>();

        // Добавление элементов
        names.add("Alice");
        names.add("Bob");
        names.addLast("Charlie"); // Добавление в конец списка
        names.addFirst("Diana");  // Добавление в начало списка

        // Доступ к элементам
        String firstElement = names.getFirst(); // Получение первого элемента
        String lastElement = names.getLast();   // Получение последнего элемента
        String thirdElement = names.get(3);     // Получение третьего элемента

        System.out.println("First: " + firstElement + ", Last: " + lastElement + ", Third: " + thirdElement);

        // Удаление элементов
        names.removeFirst(); // Удаление первого элемента
        names.removeLast();  // Удаление последнего элемента
        names.remove("Diana");  // Удаление по объекту

        // Перебор элементов с использованием улучшенного цикла for
        for (String name : names) {
            System.out.println(name);
        }

        // Добавление элемента по индексу
        names.add(1, "Eve");

        // Удаление элемента по индексу
        names.remove(1);

        // Проверка на наличие элемента
        if (names.contains("Alice")) {
            System.out.println("Alice is in the list");
        }

        // Получение размера списка
        int size = names.size();
        System.out.println("Size of the list: " + size);

        // Очистка списка
        names.clear();
    }
}

