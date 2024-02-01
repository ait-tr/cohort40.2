package cons_04.task_1;

public class Main {

    public static void main(String[] args) {

        // 1 способ - передаём в метод значения переменных
        int x = 3;
        int y = 5;

        int result = getSum(x, y);
        System.out.println("Результат - " + result);

        // 2 способ - передаём в метод конкретные значения (литералы)

        result = getSum(15, 22);
        System.out.println("Результат - " + result);
    }

    public static int getSum(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }
}