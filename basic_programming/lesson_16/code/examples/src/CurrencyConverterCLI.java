import java.util.Scanner;


class CurrencyConverter {
    // поля для хранения доступных валют и курсов
    String[] availableCurrencies;
    double[] currencyRates;

    // конструктор без параметров, используются курсы валют по умолчанию
    CurrencyConverter() {
        this.availableCurrencies = new String[3];
        this.availableCurrencies[0] = "EURO";
        this.availableCurrencies[1] = "USD";
        this.availableCurrencies[2] = "TL";

        this.currencyRates = new double[3];
        this.currencyRates[0] = 1;
        this.currencyRates[1] = 0.92;
        this.currencyRates[2] = 0.03;
    }

    // конструктор принимающий в параметрах курсы вадют
    CurrencyConverter(String[] currencyRates) {
        this();
        if (currencyRates.length == 3) {
            this.currencyRates[0] = Double.parseDouble(currencyRates[0]);
            this.currencyRates[1] = Double.parseDouble(currencyRates[1]);
            this.currencyRates[2] = Double.parseDouble(currencyRates[2]);
        }
    }

    // метод из старой версии программы, switch заменили на цикл for
    public double getRateValue(String currency) {
        for (int i = 0; i < this.availableCurrencies.length; i = i + 1) {
            if (this.availableCurrencies[i].equalsIgnoreCase(currency))
                return this.currencyRates[i];
        }
        return -1;
    }

    // расчет конечной суммы и его округление
    public double convert(String currencyFrom, String currencyTo, double sum) {
        double x = getRateValue(currencyFrom);
        double y = getRateValue(currencyTo);

        double finalSum = sum * x / y;
        // Округляем до двух знаков до запятой, округление вниз
        int roundedTotal = (int) (finalSum * 100);
        finalSum = (double) roundedTotal / 100;
        return finalSum;
    }

    // проверка валюты: поддерживается ли переданная в параметры валюта
    public boolean isCorrectCurrency(String currency) {
        for (String s: this.availableCurrencies) {
            if (s.equalsIgnoreCase(currency))
                return true;
        }
        return false;
    }

    // вывод списка поддерживаемых валют
    public void printCurrencies() {
        // Выводим доступные валюты
        for (String availableCurrency: availableCurrencies)
            System.out.println("* " + availableCurrency);
    }
}


public class CurrencyConverterCLI {
    public static void main(String[] args) {
        CurrencyConverter converter = args.length == 3 ? new CurrencyConverter(args) : new CurrencyConverter();

        Scanner scanner = new Scanner(System.in);
        String currencyFrom, currencyTo;

        printIntro(converter);

        do {
            System.out.print("\nВыберите исходную валюту: ");
            currencyFrom = scanner.nextLine();

            if (currencyFrom.equalsIgnoreCase("exit")) {
                System.out.println("Досвидания!");
                continue;
            }

            // проверка корректности значения валюты
            if (!converter.isCorrectCurrency(currencyFrom)) {
                System.out.println("Некорректное значение, попробуйте еще раз!");
                continue;
            }

            System.out.print("Выберите конечную валюту: ");
            currencyTo = scanner.nextLine();

            // проверка корректности значения валюты
            if (!converter.isCorrectCurrency(currencyTo)) {
                System.out.println("Некорректное значение, попробуйте еще раз!");
                continue;
            }

            System.out.print("Введите сумму в изначальной валюте: ");
            double initSum = Double.parseDouble(scanner.nextLine());

            // расчет результата
            double finalSum = converter.convert(currencyFrom, currencyTo, initSum);

            System.out.println("Вы получите: " + finalSum);
        } while (!currencyFrom.equalsIgnoreCase("exit"));
    }

    // вывод приветственного сообщения
    public static void printIntro(CurrencyConverter converter) {
        System.out.print(
                "Приветствуем в l16.CurrencyConverter!\n" +
                        "Доступные валюты:\n"
        );

        converter.printCurrencies();

        System.out.println("Или введите exit, чтобы завершить программу");
    }
}
