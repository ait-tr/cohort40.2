import java.util.Scanner;
import static java.lang.Math.*;

public class SinX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sin(X), X: ");
        double x = scanner.nextDouble();
        double sinX = sin(x);
        System.out.println("Result: " + sinX);
    }
}
