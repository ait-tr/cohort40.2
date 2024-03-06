package cons_10.example04;

public class Printer<T> {
    private T lastPrinted;

    public void print(T obj) {
        System.out.println(obj.toString());
        lastPrinted = obj;
    }

    public T getLastPrinted() {
        return lastPrinted;
    }
}
