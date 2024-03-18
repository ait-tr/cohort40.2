package cons_13;

import java.io.File;
import java.io.IOException;

public class Main01 {
    public static void main(String[] args) {
        File file = null;
        System.out.println("Hello");

        if (file == null) {
            throw new IllegalArgumentException("File was null");
        }
        try {
            file.createNewFile();
        } catch (IOException e) { // ловим проверяемое исключение (это обязательно)
            System.out.println("Error: " + e.getMessage());
        } catch (SecurityException e) { // ловим НЕ проверяемое исключение (это не обязательно)
            System.out.println("Security error! " + e.getMessage());
        }


        //System.out.println("Hello");
    }
}
