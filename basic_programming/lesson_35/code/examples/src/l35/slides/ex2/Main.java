package l35.slides.ex2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 100); // Добавление пары ключ-значение

        System.out.println(map);

        map.put("Banana", 200);

        // Получение значения по ключу
        // Выводит "Цена Apple: 100"
        System.out.println("Цена Apple: " + map.get("Apple"));

        // Итерация по ключам карты
        for (String key : map.keySet()) {
            System.out.println(key + " стоит " + map.get(key));
        }

        System.out.println("Ключи: " + map.keySet());
        System.out.println("Значения: " + map.values());
        System.out.println("Есть ли цена яблок: " + map.containsKey("Apple"));
        System.out.println("Есть ли такая цена на любой продукт: " + map.containsValue(200));
        System.out.println(
                "Ананас стоит: " + map.getOrDefault("Pineapple", 0)
        );
        System.out.println(
                "Яблоко стоит: " + map.getOrDefault("Apple", 0)
        );

        System.out.println(map);

        map.replace("Apple", 500);
        System.out.println("Цена Apple: " + map.get("Apple"));
        System.out.println("Количество: " + map.size());

        System.out.println(map);

        map.put("Apple", 150);  // переопределится старое значение по ключу Apple
        System.out.println("Цена Apple: " + map.get("Apple"));
//        map.remove("Apple")
        System.out.println(map);
    }
}

