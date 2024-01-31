package cons_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] arguments) {

        System.out.println();

        // 12   "12"
        // 12 + 12 = 24
        // "12" + "12" = "1212"

        // "Hello"   "14"

        // 14

        String hello = "Hello_World!!";

        // Метод charAt возвращает символ из строки,
        // который находится по тому индексу, который
        // мы передали в метод в качестве входящего параметра
        char result = hello.charAt(6);
        int a = 7;
        System.out.println(result);

        // Метод equals возвращает true, если строка, у которой он вызван,
        // и строка, которую мы передали в метод, одинаковы.
        // Иначе метод вернёт false
        boolean result1 = hello.equals(arguments[0]);
        System.out.println("Результат сравнения строк - " + result1);

        Scanner scanner = new Scanner(System.in);

        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();

        System.out.println("" + a1 + " " + a2 + " " + s);
    }
}