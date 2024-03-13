package cons_12;

public class Main01 {

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        Runnable helloMethod = Main01::sayHello;

        helloMethod.run();
    }
}
