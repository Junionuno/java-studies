package DevDojo.javacore.Rdatas.test;

import Exercícios.curso.dominio.Local;

import java.security.cert.TrustAnchor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2004, Month.AUGUST, 15, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));

        LocalDate estreia = LocalDate.of(2021, 3, 7);
        LocalDate hoje = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(estreia, hoje) + " Anos com a camisa do galo!");
        System.out.println(ChronoUnit.MONTHS.between(estreia, hoje) + " Meses com a camisa do galo!");
        System.out.println(ChronoUnit.WEEKS.between(estreia, hoje) + " Semanas com a camisa do galo!");
    }
}
