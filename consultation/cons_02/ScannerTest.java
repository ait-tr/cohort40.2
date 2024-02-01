package cons_02;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        MyTest test = new MyTest();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String s = scanner.nextLine();
        System.out.println("Вы ввели - " + s);

        int y;

        y = 7;

        System.out.println(y);
    }
}