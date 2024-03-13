package l37.slides.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IterableIteratorExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Получение Iterator
        Iterator<String> iterator = fruits.iterator();

        // Использование Iterator для перебора списка
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next()); // fail

    }
}

