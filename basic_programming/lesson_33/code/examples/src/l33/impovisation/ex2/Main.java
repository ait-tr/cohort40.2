package l33.impovisation.ex2;


// Объявление обобщенного класса Box с типом-параметром T
class Box<T, K> {
    private T content; // Поле "content" типа T
    private K meta; // Поле "content" типа T

    // Метод для установки значения поля "content"
    public void set(T content) {
        this.content = content;
    }

    // Метод для установки значения поля "content"
    public void set(T content, K meta) {
        this.content = content;
        this.meta = meta;
    }

    // Метод для получения значения поля "content"
    public T getT() {
        return content;
    }

    // Метод для получения значения поля "content"
    public K getK() {
        return meta;
    }
}
