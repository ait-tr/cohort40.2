package l31;

import java.util.Arrays;
import java.util.List;

class Main4 {
    public static void main(String[] args) {
        // Пример использования лямбда-выражений с потоками данных
        List<String> strings = Arrays.asList("one", "two", "three");
        strings.stream() // Создание потока данных из списка строк
            .filter(s -> s.startsWith("t")) // Фильтрация строк, начинающихся с "t"
            .forEach(System.out::println); // Вывод отфильтрованных строк

    }
}
