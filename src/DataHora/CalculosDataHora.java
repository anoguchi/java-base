package DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {

    public static void main(String[] args) {

        LocalDate dia01 = LocalDate.now();
        LocalDateTime dia02 = LocalDateTime.now();
        Instant dia03 = Instant.now();


        LocalDate pastTwoWeeksLocalDate = dia01.minusWeeks(2);
        LocalDate plusTwoWeeksLocalDate = dia01.plusWeeks(2);
        LocalDateTime plusTwoDays = dia02.plusDays(2);
        LocalDateTime minusTenDays = dia02.minusDays(10);
        Instant minusTwoDays = dia03.minus(2, ChronoUnit.DAYS);
        Duration d01 = Duration.between(minusTenDays, plusTwoDays);
        Duration d02 = Duration.between(pastTwoWeeksLocalDate.atTime(0, 0),
                plusTwoWeeksLocalDate.atTime(0, 0));
        Duration d03 = Duration.between(pastTwoWeeksLocalDate.atStartOfDay(),
                plusTwoWeeksLocalDate.atStartOfDay());


        System.out.println(pastTwoWeeksLocalDate);
        System.out.println(plusTwoDays);
        System.out.println(minusTwoDays);
        System.out.println(d01.toDays());
        System.out.println(d02.toDays());
        System.out.println(d03.toDays());

    }
}
