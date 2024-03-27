package l45.slides;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterParseExample {
    public static void main(String[] args) {
        String dateString = "04.07.1776";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
        System.out.println("Разобранная дата: " + parsedDate);

        String dateString2 = "04-07-1776 12:12:43";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime parsedDate2 = LocalDateTime.parse(dateString2, formatter2);
        System.out.println("Разобранная дата-время: " + parsedDate2);
    }
}
