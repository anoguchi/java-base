package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataGlobalToLocal {
    public static void main(String[] args) {

        LocalDate dia01 = LocalDate.parse("2022-07-20");
        LocalDateTime dia02 = LocalDateTime.parse("2023-11-28T13:16:34");
        Instant dia03 = Instant.parse("2023-11-28T13:16:34Z");
        Instant dia04 = Instant.now();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDate resultado01 = LocalDate.ofInstant(dia03, ZoneId.systemDefault());
        LocalDateTime resultado02 = LocalDateTime.ofInstant(dia03, ZoneId.systemDefault());
        LocalDateTime resultado03 = LocalDateTime.ofInstant(dia04, ZoneId.of("Japan"));


        System.out.println(resultado01);
        System.out.println(resultado02);
        System.out.println("Instant: " + dia04);
        System.out.println(resultado03);
        System.out.println(dia02.getDayOfWeek());
        System.out.println(dia02.getHour());
        System.out.println(fmt1.format(dia04));
        System.out.println(dia04.atZone(ZoneId.systemDefault()).getDayOfMonth());





//        for (String stringZone : ZoneId.getAvailableZoneIds()) {
//            System.out.println(stringZone);
//        }

    }
}
