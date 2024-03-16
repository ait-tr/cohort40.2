package l42.slides.ex3;

class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}

class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}

// Error не обрабатываем


public class Main {
    public static void myMethod() throws MyCheckedException {
        throw new MyCheckedException("Произошла ошибка");
    }

    public static void myMethod2() throws MyUncheckedException {
        throw new MyUncheckedException("Произошла ошибка");
    }

    public static void main(String[] args) {
        myMethod2();
        try {
            myMethod();
        } catch (MyCheckedException e) {
            throw new RuntimeException(e);
        }
    }
}
