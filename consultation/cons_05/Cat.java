package cons_05;

/**
 * Это класс, описывающий кота.
 * Класс позволяет создавать сколько угодно
 * объектов этого класса (то есть сколько угодно котов).
 */
public class Cat {

    /**
     * Переменные, определённые внутри класса, но не внутри метода,
     * называются полями класса и определяют, какие характеристики
     * или какое состояние будет у объектов, созданных на базе этого класса.
     * То есть то, каким является наш объект.
     */
    String color;
    int age;
    static int legs_count = 4;

    /**
     * true, если кот голоден, false - если сыт.
     */
    boolean hungry;

    /**
     * Методы определяют поведение объектов,
     * то есть то, что объект умеет делать.
     */
    public void sayMeow() {
        System.out.println(color + " кот говорит: Мяу!");
    }

    /**
     * Статический метод принадлежит классу и вызывается у класса, а не у объекта
     */
    public static void info() {
        System.out.println("Все коты любят покушать.");
//        System.out.println("Цвет - " + color);
    }

    public void isCatHungry() {
        if (hungry) {
            System.out.println(color + " кот голоден!");
        } else {
            System.out.println(color + " кот сыт и доволен!");
        }
    }

    public void feedCat() {
        hungry = false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                '}';
    }
}