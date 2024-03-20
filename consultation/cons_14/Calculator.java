package cons_14;

public class Calculator {

    public static double solve(String op, double a, double b) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("No such operation: " + op);
        }
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Wrong input");
            return;
        }
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        try {
            double res = solve(args[1], a, b);
            System.out.println("Result: " + res);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Cant divide by zero!");
        }
    }
    // sample command in power shell to launch the app:
    // java Calculator 4 + 5
}
