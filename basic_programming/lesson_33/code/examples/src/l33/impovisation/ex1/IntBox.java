package l33.impovisation.ex1;

// Объявление обычного класса IntBox
public class IntBox {
    private int content; // Поле "content" типа int

    // Метод для установки значения поля "content"
    public void set(int content) {
        this.content = content;
    }

    // Метод для получения значения поля "content"
    public int get() {
        return content;
    }
}


class Main0 {
    public static void main(String[] args) {
        // Создание экземпляра обобщенного класса Box для String
        IntBox intBox = new IntBox();
        // Установка значения
//        stringBox.set("Hello Generics"); // fail

        // Установка значения
        intBox.set(345678);
        // Выводит 345678
        System.out.println(intBox.get());
    }
}
