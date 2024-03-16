package l43.slides.ex1;

import java.io.FileInputStream;
import java.io.IOException;

// плохой пример
// FileInputStream используется для чтения данных из файла.
// Метод read() возвращает следующий байт данных или -1,
// если достигнут конец файла
public class ReadWithOutTryResourcesByStream {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // Открытие файла
            fis = new FileInputStream("example.txt");

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
        } finally {
            if (fis != null) {
                try {
                    fis.close(); // Закрытие FileInputStream
                } catch (IOException e) {
                    System.out.print("Ошибка ввода вывода");
                }
            }
        }
    }
}

