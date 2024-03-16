package l42.slides.ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(
                new FileReader("path/to/file.txt")
            )
        ) {
            // Чтение файла
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Обработка исключения
            System.out.print("Не получилось считать файл");
            e.printStackTrace();
        }
    }
}
