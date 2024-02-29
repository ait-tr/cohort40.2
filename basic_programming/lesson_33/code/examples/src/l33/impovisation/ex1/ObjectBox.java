package l33.impovisation.ex1;

// Объявление обычного класса ObjectBox
public class ObjectBox {
    private Object content; // Поле "content" типа Object

    // Метод для установки значения поля "content"
    public void set(Object content) {
        this.content = content;
    }

    // Метод для получения значения поля "content"
    public Object get() {
        return content;
    }
}


class Main05 {
    public static void main(String[] args) {
        ObjectBox objBox = new ObjectBox();
        objBox.set(345678);
        System.out.println(objBox.get());
        Object obj = objBox.get();
        int data = (int) objBox.get();
    }
}
