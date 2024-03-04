package cons_09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Map<String, Double> prices = new HashMap<>();
        prices.put("Apples", 4.0);
        prices.put("Bananas", 5.5);
        prices.put("Oranges", 5.0);

        String pick = new Scanner(System.in).next();

        if (prices.containsKey(pick)) {
            double price = prices.get(pick);
            System.out.println("Item " + pick + " is for " + price + " euro");
        } else {
            System.out.println("We dont have item " + pick);
        }
    }
}
