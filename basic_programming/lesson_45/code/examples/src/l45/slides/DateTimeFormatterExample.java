package l45.slides;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        String formattedDate = today.format(formatter);
        System.out.println("Отформатированная дата: " + formattedDate);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd.MM.yy HH:mm:ss");
        String formattedDate2 = now.format(formatter2);
        System.out.println("Отформатированная дата-время: " + formattedDate2);

        LocalDate date = LocalDate.of(2024, 1 ,1);
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("d.M.yy");
        String formattedDate3 = date.format(formatter3);
        System.out.println("Отформатированная дата: " + formattedDate3);
    }
}
