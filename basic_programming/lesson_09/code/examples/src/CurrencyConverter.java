import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        String[] availableCurrencies = {"EURO", "USD", "TL"};
        double[] currencyRates = {1, 0.92, 0.03};

        if (args.length == 3) {
            currencyRates[0] = Double.parseDouble(args[0]);
            currencyRates[1] = Double.parseDouble(args[1]);
            currencyRates[2] = Double.parseDouble(args[2]);
        }

        Scanner scanner = new Scanner(System.in);
        String currencyFrom, currencyTo;

        System.out.print(
            "Приветствуем в CurrencyConverter!\n" +
            "Выберите исходную валюту:\n"
        );

        // Выводим доступные валюты
        for (String availableCurrency: availableCurrencies)
            System.out.println("* " + availableCurrency);

        System.out.println("Или введите exit, чтобы завершить программу");

        do {
            currencyFrom = "";

            System.out.print("\nВыберите исходную валюту: ");
            // Делаем две попытки, чтобы считать изначальную валюту
            // потому что со второго цикла возникает мусорное
            // заполнение буффера
            for (int i = 0; currencyFrom.isEmpty() && i < 2; i++)
                currencyFrom = scanner.nextLine();

            double x, y;

            switch (currencyFrom) {
                case "EURO":
                    x = currencyRates[0];
                    break;
                case "USD":
                    x = currencyRates[1];
                    break;
                case "TL":
                    x = currencyRates[2];
                    break;
                case "EXIT":
                    System.out.println("Досвидания!");
                    continue;
                default:
                    System.out.println("Некорректное значение, попробуйте еще раз!");
                    continue;
            }

            System.out.print("Выберите конечную валюту: ");
            currencyTo = scanner.next();

            switch (currencyTo) {
                case "EURO":
                    y = currencyRates[0];
                    break;
                case "USD":
                    y = currencyRates[1];
                    break;
                case "TL":
                    y = currencyRates[2];
                    break;
                default:
                    System.out.println("Некорректное значение, попробуйте еще раз!");
                    continue;
            }

            System.out.print("Введите сумму в изначальной валюте: ");
            double initSum = scanner.nextDouble();

            double finalSum = initSum * x / y;
            // Округляем до двух знаков до запятой, округление вниз
            int roundedTotal = (int) (finalSum * 100);
            finalSum = (double) roundedTotal / 100;

            System.out.println("Вы получите: " + finalSum);
        } while (!currencyFrom.equalsIgnoreCase("exit"));
    }
}
