import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
       System.out.println(
           "Приветствуем в\n" +
           "CurrencyConverter!\n" +
           "\n" +
           "\n" +
           "Выберите исходную валюту:\n" +
           "1. EURO\n" +
           "2. USD\n" +
           "3. TL"
       );

       Scanner scanner = new Scanner(System.in);

       System.out.print("Введите номер: ");
       int currencyFrom = scanner.nextInt();

       if (currencyFrom == 1) {
           System.out.println("FROM: euro");
       } else if (currencyFrom == 2) {
           System.out.println("FROM: american dollars");
       } else if (currencyFrom == 3) {
           System.out.println("FROM: Turkish lir");
       } else {
           System.out.println("unknown currency, bye!");
           System.exit(-1);
       }
    }
}
