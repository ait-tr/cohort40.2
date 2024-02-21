package l27.ex2;


import l27.ex1.Drawable;

public interface Fillable {
    void fill();
}

// Класс Circle теперь реализует два интерфейса: Drawable и Fillable
class Circle implements Drawable, Fillable {
    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }

    @Override
    public void fill() {
        System.out.println("Закрашиваем круг");
    }
}

