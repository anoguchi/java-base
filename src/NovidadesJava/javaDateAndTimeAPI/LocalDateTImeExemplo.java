package NovidadesJava.javaDateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class LocalDateTImeExemplo {

    public static void main(String[] args) {

        LocalDate dataDeHoje = LocalDate.now();
        System.out.println(dataDeHoje);

        LocalDate dataDeOntem = dataDeHoje.minusDays(1);
        System.out.println(dataDeOntem);

        LocalDate hojeMaisDois = dataDeHoje.plusDays(2);
        System.out.println(hojeMaisDois);

        LocalDate dataTransformada = LocalDate.of(2023, 11, 6);
        System.out.println(dataTransformada);

        LocalDateTime horaTransformada = dataTransformada.atTime(22, 20, 19);
        System.out.println(horaTransformada);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime horaTransformada02 = LocalTime.of(22, 12, 50);
        System.out.println(horaTransformada02);

        LocalTime adicionaHoras = horaTransformada02.plusHours(8);
        System.out.println(adicionaHoras);

        LocalTime adicionaMinutos = adicionaHoras.plusMinutes(12);
        System.out.println(adicionaMinutos);

        YearMonth anoMes = YearMonth.now();
        System.out.println(anoMes);

        String anoMesFormatado = anoMes.format(DateTimeFormatter.ofPattern("MM yyyy"));
        System.out.println(anoMesFormatado);

    }

}
