package l36.slides.ex1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> fruitSet = new HashSet<>();
        fruitSet.add("Apple"); // Добавляем "Apple" в Set
        fruitSet.add("Banana"); // Добавляем "Banana" в Set
        fruitSet.add("Apple"); // Попытка добавить "Apple" снова - без эффекта

        System.out.println(fruitSet); // Вывод: [Apple, Banana]
    }
}
