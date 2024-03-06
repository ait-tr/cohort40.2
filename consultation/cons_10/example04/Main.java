package cons_10.example04;

public class Main {

    /*
    Создать класс принтер, который печатает переменные какого-то типа и сохраняет последнее напечатанное значение (как ссылку)
     */
    public static void main(String[] args) {
        Printer<String> stringPrinter = new Printer<>();
        stringPrinter.print("Hello");
        stringPrinter.print(" world!");

        System.out.println("Last printed: " + stringPrinter.getLastPrinted());

        Printer<Double> numberPrinter = new Printer<>();
        numberPrinter.print(45.5);
        numberPrinter.print(-456.0);
        numberPrinter.print(17.0);

        System.out.println("Last printed: " + numberPrinter.getLastPrinted());
    }
}
