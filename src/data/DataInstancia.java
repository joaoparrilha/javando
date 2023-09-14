package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataInstancia {

    public static void main(String[] args) {

        // Local Date
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();

        // Global Date
        Instant d03 = Instant.now();

        // ISO 8601
        LocalDate d04 = LocalDate.parse("2023-09-10");
        LocalDateTime d05 = LocalDateTime.parse("2023-09-10T01:30:26");
        Instant d06 = Instant.parse("2023-09-10T01:30:26Z");
        //Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        //System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);

    }
}
