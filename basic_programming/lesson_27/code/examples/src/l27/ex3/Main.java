package l27.ex3;

interface Drawable {
    void draw();

    default void resize() {
        System.out.println("Изменяем размер");
    }
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }

    // Метод resize не обязательно переопределять
}
