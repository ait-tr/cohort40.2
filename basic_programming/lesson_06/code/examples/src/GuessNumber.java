import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt() % 6;
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "Я загадал число от 0 до 5, \n" +
            "если вы угадаете его, \n" +
            "то получите подарок!"
        );
        System.out.print("Ваш вариант: ");
        int guessNumber = scanner.nextInt();

        if (guessNumber == secretNumber) {
            System.out.println("Вы угадали и ваш приз это букет цветов: \uD83D\uDC90");
        } else if (guessNumber + 1 == secretNumber | guessNumber - 1 == secretNumber ) {
            System.out.println("Вы почти угадали, ваш утешительный приз это цветок: \uD83C\uDF37");
        } else {
            System.out.println("К сожалению вы не угадали, держите пиво: \uD83C\uDF7A");
        }
    }
}