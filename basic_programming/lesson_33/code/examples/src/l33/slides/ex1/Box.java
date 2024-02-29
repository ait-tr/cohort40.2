package l33.slides.ex1;

// Объявление обобщенного класса Box с типом-параметром T
public class Box<T> {
    private T content; // Поле "content" типа T

    // Метод для установки значения поля "content"
    public void set(T content) {
        this.content = content;
    }

    // Метод для получения значения поля "content"
    public T get() {
        return content;
    }
}


class Main {
    static boolean checkBox(Box<String> stringBox) {
        return stringBox.get() != null;
    }

    public static void main(String[] args) {
        // Создание экземпляра обобщенного класса Box для String
        Box<String> stringBox0 = new Box<>();
        // то же самое что выше
        Box<String> stringBox = new Box<String>();
        // Установка значения
        stringBox.set("Hello Generics");
        // Выводит "Hello Generics"
        System.out.println(stringBox.get());
        boolean checked = checkBox(new Box<>());
        System.out.println(checked);

        // Создание экземпляра обобщенного класса Box для int
        Box<Integer> intBox = new Box<Integer>();
        // Установка значения
        intBox.set(345678);
        // Выводит 345678
        System.out.println(intBox.get());
    }
}
