package l24;

class Soda {
    private String name; // Название напитка
    private int volume;  // Объем напитка в миллилитрах

    // Конструктор для инициализации объектов класса Soda
    public Soda(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    // Переопределение метода toString для представления
    // объекта Soda в удобочитаемом формате
    @Override
    public String toString() {
        return "Soda{" + "name='" + name + "'" +
                ", volume=" + volume + "ml" + '}';
    }

    public static void main(String[] args) {
        // Создаем объект cola класса Soda
        Soda cola = new Soda("Cola", 500);
        // Печатаем информацию о cola, автоматически
        // вызывается метод toString
        System.out.println(cola.toString());
        System.out.println(cola); // то же самое
    }
}

