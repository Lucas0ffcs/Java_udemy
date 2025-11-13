import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class data {
    public static void main(String[] args) {

        //https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d01 = LocalDate.now();
        System.out.println(d01);

        LocalDateTime d02 =  LocalDateTime.now();
        System.out.println(d02);

        Instant d03 = Instant.parse("2023-02-01T01:30:24Z");
        System.out.println(d03);

        LocalDate d04 = LocalDate.parse("2006-10-24");
        System.out.println(d04);

        LocalDateTime d05 = LocalDateTime.parse("2006-10-24T19:25:40");
        System.out.println(d05);


        LocalDate d08 = LocalDate.parse("15/08/2006", fmt1);
        System.out.println(d08);



        LocalDate d10 = LocalDate.of(2023, 02, 01);
        System.out.println(d10);


        System.out.println(d04.format(fmt1));
        ZoneId.getAvailableZoneIds(); //ARMAZENA UMA COLEÇÃO COM TODAS AS REGIÕES DE FUSO HORÁRIO POSSÍVEIS

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());//converte uma data global para um data local
        System.out.println(r1);


        System.out.println(d01.getDayOfMonth());
        System.out.println(d01.getMonthValue());
        System.out.println(d01.getYear(d03, ZoneId));



    }
}
