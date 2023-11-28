package DataHora;

/*
 * Principais tipos do Java 8+
 * Data-hora local:
 *  - LocalDate
 *  - LocalDateTime
 * Data-hora global:
 *  - Instant
 * Duração:
 *  - Duration
 * Outros:
 *  - ZoneId
 *  - ChronoUnit
 */

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciacao {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Instanciação
        LocalDate dia01 = LocalDate.now();
        LocalDateTime dia02 = LocalDateTime.now();
        Instant dia03 = Instant.now();

        LocalDate dia04 = LocalDate.parse("2023-11-27");
        LocalDateTime dia05 = LocalDateTime.parse("2023-11-27T21:48:54");
        Instant dia06 = Instant.parse("2023-11-27T21:48:54Z");
        Instant dia07 = Instant.parse("2023-11-27T21:48:54-03:00");


        LocalDate dia08 = LocalDate.parse("27/11/2023", fmt1);
        LocalDateTime dia09 = LocalDateTime.parse("27/11/2023 01:30", fmt2);
        LocalDateTime dia10 = LocalDateTime.of(2023, 11, 27, 1, 30);

        System.out.println(dia01);
        System.out.println(dia02);
        System.out.println(dia03);
        System.out.println(dia04);
        System.out.println(dia05);
        System.out.println(dia06);
        System.out.println(dia07);
        System.out.println(dia08);
        System.out.println(dia09);
        System.out.println(dia10);


    }
}
