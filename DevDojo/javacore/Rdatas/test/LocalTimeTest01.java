package DevDojo.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(21, 59, 43);
        LocalTime now = LocalTime.now();

        System.out.println(time);
        System.out.println(now);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);

        LocalTime aberturaOficina = LocalTime.of(8, 0);
        LocalTime agora = LocalTime.now();

        aberturaOficina = aberturaOficina.plusHours(2);
        if (aberturaOficina.isBefore(agora)){
            System.out.println("Aberto");
        }else {
            System.out.println("Fechado");
        }
    }
}
