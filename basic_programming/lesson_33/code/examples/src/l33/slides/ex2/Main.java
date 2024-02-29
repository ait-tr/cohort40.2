package l33.slides.ex2;

import l33.slides.ex1.Box;

// Объявление класса Util с обобщенным методом isEqual
class Util {
    // Обобщенный метод isEqual с типом-параметром T
    public static <T> boolean isEqual(Box<T> box1, Box<T> box2) {
        // Сравнение содержимого двух Box объектов
        return box1.get().equals(box2.get());
    }

    public static <T> void doAnything(Box<T> box1, Box<T> box2) {
        // ...
    }
}

class Main {
    public static void main(String[] args) {
        // Создание двух Box объектов для Integer
        Box<Integer> box1 = new Box<>();
        box1.set(10); // Установка значения для первого Box

        Box<Integer> box2 = new Box<>();
        box2.set(10); // Установка значения для второго Box

        // Вызов обобщенного метода isEqual для сравнения двух Box объектов
        // Возвращает true, если содержимое равно
        boolean isEqual = Util.<Integer>isEqual(box1, box2);
        // то же что и выше
        isEqual = Util.isEqual(box1, box2);

        Box<String> box3 = new Box<>();
        box3.set("Hello"); // Установка значения для третьего Box
        // boolean checked2 = Util.isEqual(box1, box3); // fail
    }
}
