package l43.slides.ex1;

import java.io.FileInputStream;
import java.io.IOException;

// FileInputStream используется для чтения данных из файла.
// Метод read() возвращает следующий байт данных или -1,
// если достигнут конец файла
public class ReadWithTryResourcesByStream {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("resources/file.txt")) {
            do {
                // Чтение по одному байту за итерацию
                int i = fis.read();
                if (i == -1) // когда кончились данные
                    break;
                // Вывод прочитанных данных на экран
                System.out.print((char) i);
            } while (true);
        } catch (IOException e) {
            System.out.print("Ошибка ввода вывода");
        }
    }
}

