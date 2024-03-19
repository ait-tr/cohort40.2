package l44.prev_homework;


// записать в файл “Hello world, I’m тут ваше имя” (если его нет, он будет создан)
//прочитать этот файл и вывести его содержимое

import java.io.*;
import java.util.Scanner;

class Minimum01 {
    public static void main(String[] args) {
        String filename = "resources/hw.43.02.180324.txt";

        writeTextByStream("Hello world, I'm Karl\nI'm from Armenia", filename);
        String text = readText(filename);
        System.out.print(text);
    }

    public static void writeText(String text, String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write(text);
            bw.flush();  // необходимо чтобы точно данные записались в файл
        } catch (IOException e) {
            System.out.println("IO error happened");
        }
    }

    public static String readText(String filename) {
        String text = "";

        try (Scanner scanner = new Scanner(new FileInputStream(filename))) {
            while (scanner.hasNext()) {
                text = text + scanner.nextLine() + "\n";
            }
        } catch (IOException e) {
            System.out.println("IO error happened");
        }

        return text;
    }

    public static void writeTextByStream(String text, String filename) {
        try (FileOutputStream stream = new FileOutputStream(filename)) {
            byte[] bytes = text.getBytes();
            stream.write(bytes);
        } catch (IOException e) {
            System.out.println("IO error happened");
        }
    }
}
