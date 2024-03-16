package l43.slides.ex2;

import java.io.FileOutputStream;
import java.io.IOException;

// FileOutputStream используется для записи байтов в файл.
// Мы преобразуем строку в массив байтов и записываем его
// в файл с помощью метода write().
public class WriteByStream {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("resources/file3.txt")) {
            String text = "Привет, мир!";
            // Преобразуем строку в массив байтов
            byte[] textBytes = text.getBytes();
            // Записываем байты в файл
            fos.write(textBytes);
            fos.flush();
        } catch (IOException e) {
            System.out.print("Ошибка ввода вывода");
        }
    }
}

