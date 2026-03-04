package Exercícios.chatGPT.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class exercicio42 {
    public static void main(String[] args) {
        LocalDate dataInicioCurso = LocalDate.of(2025, Month.OCTOBER, 10);
        LocalDate hoje = LocalDate.now();

        long dias = ChronoUnit.DAYS.between(dataInicioCurso, hoje);
        long semanas = ChronoUnit.WEEKS.between(dataInicioCurso, hoje);
        long meses = ChronoUnit.MONTHS.between(dataInicioCurso, hoje);

        System.out.println("À " + dias + " dias estudando Java");
        System.out.println("À " +  semanas + " semanas estudando Java");
        System.out.println("À " + meses + " meses estudando Java");
    }
}
