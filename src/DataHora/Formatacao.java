package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatacao {
    public static void main(String[] args) {

        LocalDate dia01 = LocalDate.parse("2023-11-27");
        LocalDateTime dia02 = LocalDateTime.parse("2023-11-27T01:30:23");
        Instant dia03 = Instant.parse("2023-11-27T01:23:23Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println("dia01 = " + dia01.format(fmt1));
        System.out.println("dia01 = " + fmt1.format(dia01));
        System.out.println("dia01 = " + dia01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("dia02 = " + dia02.format(fmt1));
        System.out.println("dia02 = " + dia02.format(fmt2));
        System.out.println("dia02 = " + dia02.format(fmt4));

        System.out.println("dia03 = " + dia03);
        System.out.println("dia03 = " + fmt3.format(dia03));


    }
}
