package cons_14;

import java.io.File;
import java.util.Scanner;

public class MyCalculator {

    public static double calculate(double a, double b, String operation) {
        if (b == 0) {
            throw new ArithmeticException("Cant divide by 0");
        }
        return switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalStateException("This program cant do operation " + operation);
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your math problem or 'exit' to exit");
            String leftArgument = scanner.next();
            // a way to stop the program:
            if (leftArgument.equalsIgnoreCase("exit")) {
                break; // break the loop to end it
            }
            String operator = scanner.next();
            String rightArgument = scanner.next();
            try {
                double res = calculate(Double.parseDouble(leftArgument), Double.parseDouble(rightArgument), operator);
                System.out.println(leftArgument + " " + operator + " " + rightArgument + " = " + res);
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number!");
            } catch (ArithmeticException | IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
