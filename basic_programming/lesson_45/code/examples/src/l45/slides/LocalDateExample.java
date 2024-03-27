package l45.slides;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Сегодняшняя дата: " + today);

        LocalDate specificDate = LocalDate.of(2024, 3, 16);
        System.out.println("Конкретная дата: " + specificDate);

        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Завтрашняя дата: " + tomorrow);

        LocalDate yesterday = today.minusDays(1);
        System.out.println("Вчерашняя дата: " + yesterday);
    }
}
