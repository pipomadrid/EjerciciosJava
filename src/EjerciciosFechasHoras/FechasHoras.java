package EjerciciosFechasHoras;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

public class FechasHoras {


    public static void main(String[] args) {
        var f1 = LocalDate.of(2024,1,5);
        var h1 = LocalTime.of(15,23);
        var f2 = LocalDateTime.of(f1,h1);
        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        var f3 = f2.format(df);
        LocalDateTime dt = LocalDateTime.parse("2024-02-26T16:14:01.184");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(f2);
        System.out.println(f3);
        System.out.println(dt.format(f));


        ZoneId zone = ZoneId.of("Europe/Madrid");
        ZoneId zone2 = ZoneId.of("America/New_York");
        ZonedDateTime zdt = ZonedDateTime.of(dt,zone);
        ZonedDateTime zdt2 = ZonedDateTime.of(dt,zone2);
        System.out.println(zdt + " " + zdt2);
        System.out.println(Duration.between(zdt,zdt2));

        var epoch = Instant.ofEpochSecond(2);
    }


}
