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

        printIntro(availableCurrencies);

        do {
            System.out.print("\nВыберите исходную валюту: ");
            currencyFrom = scanner.nextLine();

            double x, y;

            x = getRateValue(currencyFrom, currencyRates);
            if (x == -1) {
                System.out.println(
                    currencyFrom.equalsIgnoreCase("exit")?
                        "Досвидания!"
                        :"Некорректное значение, попробуйте еще раз!"
                );
                continue;
            }

            System.out.print("Выберите конечную валюту: ");
            currencyTo = scanner.nextLine();

            y = getRateValue(currencyTo, currencyRates);
            if (y == -1) {
                System.out.println("Некорректное значение, попробуйте еще раз!");
                continue;
            }

            System.out.print("Введите сумму в изначальной валюте: ");
            double initSum = Double.parseDouble(scanner.nextLine());

            double finalSum = initSum * x / y;
            // Округляем до двух знаков до запятой, округление вниз
            int roundedTotal = (int) (finalSum * 100);
            finalSum = (double) roundedTotal / 100;

            System.out.println("Вы получите: " + finalSum);
        } while (!currencyFrom.equalsIgnoreCase("exit"));
    }

    public static void printIntro(String[] availableCurrencies) {
        System.out.print(
            "Приветствуем в CurrencyConverter!\n" +
            "Доступные валюты:\n"
        );

        // Выводим доступные валюты
        for (String availableCurrency: availableCurrencies)
            System.out.println("* " + availableCurrency);

        System.out.println("Или введите exit, чтобы завершить программу");
    }

    public static double getRateValue(String currency, double[] rates) {
        double rate;

        switch (currency) {
            case "EURO":
                rate = rates[0];
                break;
            case "USD":
                rate = rates[1];
                break;
            case "TL":
                rate = rates[2];
                break;
            default:
                System.out.println("Некорректное значение, попробуйте еще раз!");
                rate = -1;
        }

        return rate;
    }
}
