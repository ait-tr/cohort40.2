package l36.slides.ex3;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        // Добавление элементов в очередь
        queue.offer("Apple");
        queue.offer("Banana");
        System.out.println(queue);

        // Удаление и возврат первого элемента ("Apple")
        System.out.println(queue.poll());
        // то же что и выше, но вызовет ошибку если пустая очередь
        System.out.println(queue.element());

        System.out.println(queue);

        // Просмотр (но не удаление)
        // первого элемента ("Banana")
        System.out.println(queue.peek());
        // то же что и выше, но вызовет ошибку если пустая очередь
        System.out.println(queue.element());

        System.out.println(queue);
    }
}


