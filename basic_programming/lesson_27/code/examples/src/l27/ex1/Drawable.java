package l27.ex1;

public interface Drawable {
    void draw(); // Метод, который должен быть реализован
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Рисуем квадрат");
    }
}


class Main {
    public static void main(String[] args) {
        Drawable figure = new Circle();
        figure.draw();
        figure = new Square();
        figure.draw();
    }
}
