package l45.slides;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(
            "Текущие дата и время: " + now
        );

        LocalDateTime specificDateTime = LocalDateTime.of(
            2024, 3, 18, 13, 45
        );
        System.out.println(
            "Конкретные дата и время: " + specificDateTime
        );

        LocalDateTime later = now.plusHours(2)
            .plusMinutes(30)
            .minusMinutes(2);
        System.out.println(
            "Позже на 2 часа 28 минут: " + later
        );
    }
}
