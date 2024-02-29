package l33.impovisation.ex1;

import l33.slides.ex1.Box;

// Объявление обобщенного класса Box с типом-параметром T
class Utils {
    // метод для получения строкого представления значения коробки
    public static <T> String getBoxValueAsString(Box<T> box) {
        return box.get().toString();
    }

    // преобразовать любой объект к указанному типу
    public static <T> T getValue(Object obj) {
        return (T) obj;
    }
}


class Main {
    public static void main(String[] args) {
        // Создание экземпляра обобщенного класса Box для Integer
        Box<Integer> box = new Box<>();
        // Установка значения
        box.set(38292893);
        // В str будет "38292893"
        String str = Utils.<Integer>getBoxValueAsString(box);

        String myStr = "qwerty";
        Object obj = myStr;
        myStr = Utils.<String>getValue(obj);

        System.out.println(Utils.<String>getValue(obj));
    }
}
