package cons_13;

import java.io.*;

public class Main02 {
    public static void main(String[] args) {

        File file = new File("Hello.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            // происходит Exception chaining
            throw new RuntimeException(e);
        }

        // try-with-resources
        try (FileOutputStream fos = new FileOutputStream(file)) {
            // используем write чтобы записать байты строки в файл
            fos.write("Hello".getBytes()); // получаем массив байт из строки с помощью getBytes
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter fw = new FileWriter(file, true)) {
            // используем append чтобы добавить в файл
            fw.append(" world!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
