package cons_04.task_2;

public class Main {

    public static void main(String[] args) {

        // Вывести в консоль числа от 2 до 5
        for (int i = 2; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println();

        // Вывести в консоль числа от 5 до 2
        for (int i = 5; i >= 2; i--) {
            System.out.println(i);
        }

        System.out.println();

        // Вывести в консоль степени двойки от 1024 до 0
        for (int i = 1024; i > 0; i = i / 2) {
            System.out.println(i);
        }

        System.out.println();

        // Вывести в консоль нечётные числа от 1 до 19
        for (int i = 1; i < 20; i += 2) {
            System.out.println(i);
        }
    }
}