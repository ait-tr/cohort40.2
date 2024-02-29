package l33.impovisation.ex3;

class Box<T, T2> {
    private T content; // Поле "content" типа T
    private T2 content2; // Поле "content" типа T

    // Метод для установки значения поля "content"
    public void set(T content, T2 content2) {
        this.content = content;
        this.content2 = content2;
    }

    // Метод для получения значения поля "content"
    public T get() {
        return content;
    }

    // Метод для получения значения поля "content"
    public T2 get2() {
        return content2;
    }
}
