package cons_12;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main02 {

    public static void main(String[] args) {
        Supplier<String> helloSupplier = () -> "Hello!";

        Runnable helloFunction = () -> System.out.println(helloSupplier.get());

        helloFunction.run();

        Consumer<String> printer = System.out::println;

        printer.accept(helloSupplier.get());
    }

}
