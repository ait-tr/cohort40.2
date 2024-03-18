package cons_13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        // создаем ссылку на файл который будем читать
        File file = new File("Hello.txt");
        // создаем список, в который запишем все что есть в файле (все строки)
        List<String> fileContent = new LinkedList<>();
        // Открываем файловый поток ввода, и создаем на нем сканнер
        try (FileInputStream fis = new FileInputStream(file);
                Scanner scanner = new Scanner(fis)) {
            // читаем пока в сканнере что-то есть
            while (scanner.hasNext()) {
                // читаем одну строку
                String text = scanner.nextLine();
                // сохраняем строку в список
                fileContent.add(text);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // все строки из списка
        for (String line : fileContent) {
            // выводим в консоль
            System.out.println(line);
        }
    }
}
