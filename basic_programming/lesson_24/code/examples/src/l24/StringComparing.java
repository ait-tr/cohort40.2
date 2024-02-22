package l24;

public class StringComparing {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        // true потому что переменные
        // указывают на один и тот же объект
        System.out.println(str1 == str2);
        // false потому что переменные
        // указывают на разные объекты
        System.out.println(str1 == str3);
        // true потому что сравниваем
        // значения строк
        System.out.println(str1.equals(str3));
    }
}
