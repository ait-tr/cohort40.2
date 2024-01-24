import java.util.Scanner;

import static java.lang.Math.pow;

public class BinaryTable {
    /*
     * (По желанию) Напишите программу, которая в качестве аргументов
     * командной строки принимает поддерживаемые логические операторы
     * (И, ИЛИ, НЕ) и если ни один не указан, то считайте, что нужно
     * использовать все. По этим логическим операторам постройте
     * таблицу истинности для числа бит, полученного из пользовательского
     * ввода.
     */

    public static void main(String[] args) {
        boolean needAnd, needOr, needNot;
        needAnd = needOr = needNot = false;

        if (args.length > 3) {
            System.out.println("Некорректные аргументы");
            System.exit(-1);
        }

        if (args.length == 0) {
            needAnd = needOr = needNot = true;
        }

        for (String arg : args) {
            if (arg.equals("И")) {
                needAnd = true;
            } else if (arg.equals("ИЛИ")) {
                needOr = true;
            } else if (arg.equals("НЕ")) {
                needNot = true;
            } else {
                System.out.println("Некорректные аргументы");
                System.exit(-1);
            }
        }
        System.out.print("Введите размерность таблицы истоичности: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int i;

        String header = "| ";

        i = 1;
        while (i <= size) {
            header += "x" + i + " | ";
            i = i + 1;
        }

        if (needAnd) {
            header += "AND | ";
        }

        if (needOr) {
            header += "OR | ";
        }

        if (needNot) {
            header += "NOT(x1) | ";
        }

        System.out.println(header);

        i = 0;
        int j;
        String line, binaryNumber;
        boolean andResult, orResult;
        while (i < pow(2, size)) {
            binaryNumber = Integer.toBinaryString(i);
            // следующая строка дополняет нулями слева наше
            // двоичное представление числа до нужного количества
            binaryNumber = String.format("%" + size + "s", binaryNumber)
                    .replaceAll(" ", "0");
            j = 0;
            line = "| ";
            andResult = true;
            orResult = false;
            boolean x1 = false;

            while (j < binaryNumber.length()) {
                String xn = binaryNumber.substring(j, j + 1);
                line += xn + "  | ";
                boolean value = Integer.parseInt(xn) == 1;
                if (needAnd) {
                    andResult &= value;
                }
                if (needOr) {
                    orResult |= value;
                }
                if (j == 0) {
                    x1 = value;
                }
                j = j + 1;
            }

            if (needAnd) {
                line += (andResult ? 1 : 0) + "   |  ";
            }
            if (needOr) {
                line += (orResult ? 1 : 0) + " |  ";
            }
            if (needNot) {
                line += (x1 ? 0 : 1) + "      |";
            }
            System.out.println(line);
            i = i + 1;
        }
    }
}


/*

n <= 10

-------------------------------------------
x1 | x2 | x3 | ... | xn | или | и | не(x1)
-------------------------------------------
0  | 0  | 0  | ... | 0  |  0  | 0 |  1
-------------------------------------------
....
-------------------------------------------
1  | 1  | 1  | ... | 1  |  1  | 1 |  0
-------------------------------------------

* */