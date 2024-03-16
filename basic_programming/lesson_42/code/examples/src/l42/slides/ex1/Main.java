package l42.slides.ex1;

class Main001 {
    public static void main(String[] args) {
        int i = 10 / 0;
    }
}


class Main002 {
    public static boolean isInt(String str) {
        // try-catch блоку
        // NumberFormatException
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
        // вернуть true если строчка сверху работает без ошибок
        // иначе вернуть false
    }

    public static void main(String[] args) {
        System.out.println(isInt("qwerty"));
        System.out.println(isInt("1234"));
        System.out.println(isInt("1234-1212"));
    }
}


public class Main {
    public static void main(String[] args) {
        String str = null;

        try {
            // Этот код может вызвать ArithmeticException из-за деления на ноль
            System.out.println("Пытаемся поделить на 0");
            str.length();
            int result = 10 / 0;
            System.out.println("У нас удалось поделить на 0");
        } catch (ArithmeticException e) { // 1
            // Этот код выполнится когда возникнет исключение ArithmeticException
            System.out.println("Произошла арифметическая ошибка");
        } catch (NullPointerException e) { // 2
            // Этот код выполнится когда возникнет исключение Exception
            System.out.println("Произошла NullPointerException ошибка");
        } catch (Exception e) { // 3
            // Этот код выполнится когда возникнет исключение Exception
            System.out.println("Произошла ошибка");
        } finally {
            // Этот код выполнится всегда
            System.out.println("Блок finally выполнен");
        }
    }
}


class Main11 {
    // обязуем обработать исключение ArithmeticException при вызове метода.
    // если throws не указан - обработка необязательна
    public static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Доступ запрещен - вам меньше 18 лет.");
        } else {
            System.out.println("Доступ разрешен.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(14);
        } catch (ArithmeticException e) {
            System.out.println("К сожалению доступ запрещен [14]");
        }

        try {
            checkAge(18);
        } catch (ArithmeticException e) {
            System.out.print("К сожалению доступ запрещен [18]");
        }

        try {
            checkAge(81);
        } catch (ArithmeticException e) {
            System.out.print("К сожалению доступ запрещен [81]");
        }
    }
}