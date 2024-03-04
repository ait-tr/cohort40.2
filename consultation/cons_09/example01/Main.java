package cons_09.example01;

public class Main {
    public static void main(String[] args) {
        Cup cup1 = new Cup(400, "White", 5);
        Cup cup2 = new Cup(300, "Blue", 7.5);
        // cup 1 compare to cup 2
        int c = cup1.compareTo(cup2);
        // cup1 > cup2
        if (c > 0) {
            System.out.println("Cup 1 is larger!");
        } else if (c < 0) {
            System.out.println("Cup 2 is larger!");
        } else {
            System.out.println("Cups are equal");
        }

        int priceC = new CupPriceComparator().compare(cup1, cup2);
        if (priceC > 0) {
            System.out.println("Cup 1 is more expensive!");
        } else if (priceC < 0) {
            System.out.println("Cup 2 is more expensive!");
        } else {
            System.out.println("Cups' prices are equal");
        }

    }
}
