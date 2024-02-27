package l31;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}


class Main30 {
    public static void main(String[] args) {
        Calculator add = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        int result = add.operate(2, 2);
        System.out.println("2 + 2 = " + result);

        Calculator sub = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };
        int result2 = sub.operate(2, 2);
        System.out.println("2 - 2 = " + result2);
    }
}



class Main3 {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        // также можно писать следующие варианты:
        // s -> s.startsWith("t")
        // () -> true

        System.out.println("Сумма 5 и 3 равна " + add.operate(5, 3));
        System.out.println("Разность 5 и 3 равна " + subtract.operate(5, 3));
    }
}


// то же самое что выше
class Main35 {
    public static void main(String[] args) {
        Calculator add = (a, b) -> {
            return a + b;
        };
        Calculator subtract = (a, b) -> {
            return a - b;
        };

        System.out.println("Сумма 5 и 3 равна " + add.operate(5, 3));
        System.out.println("Разность 5 и 3 равна " + subtract.operate(5, 3));
    }
}


/*

* */