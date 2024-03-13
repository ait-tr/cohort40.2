package l36.imporvosation.ex1;


/*
аргумент: String data
удалить все дублирующиеся символы сформировав из строки - коллекцию
преобразовать к списку и отсортировать
* */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // какая то строка с повторами
        String data = "asjkaksKJASkjhjeqeiu283823iuSKAJlksjlkwejwoklwlewlekwelwewewewe";
        System.out.println("Изначально: " + data);
        clear(data);
    }

    public static void clear(String data) {
        // создаем set
        Set<Character> chars = new HashSet<>();
        // добавляем каждый символ строки в этот set
        for (char c: data.toCharArray()) {
            // добавятся символы без дублирования
            chars.add(c);
        }
        System.out.println(chars);
    }
}
