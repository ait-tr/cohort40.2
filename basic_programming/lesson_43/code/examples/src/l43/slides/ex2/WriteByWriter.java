package l43.slides.ex2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// BufferedWriter используется для буферизированной записи
// текста в файл. Метод write() используется для записи
// текста, а newLine() для добавления новой строки.
public class WriteByWriter {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("output.txt")) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Привет, мир!"); // Записываем строку в файл
            bw.newLine(); // Добавляем новую строку
            bw.write("До свидания, мир!");
            bw.flush();  // Скидываем буфферизированные данные непосредственно в файл
        } catch (IOException e) {
            System.out.print("Ошибка ввода вывода");
        }
    }
}

