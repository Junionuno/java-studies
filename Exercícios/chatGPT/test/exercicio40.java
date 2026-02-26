package Exercícios.chatGPT.test;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class exercicio40 {
    public static void main(String[] args) {
        String dado = "    2026-12-31 | REINALDO LIMA | 15:00    ";

        dado = dado.trim();
        System.out.println(dado);

        String[] partes = dado.split("\\|");
        String data = partes[0].trim();
        String nome = partes[1].trim();
        String hora = partes[2].trim();

        nome = nome.toUpperCase();
        StringBuilder stNome = new StringBuilder(nome);
        stNome = stNome.reverse();
        System.out.println(stNome);

        SimpleDateFormat sdft = new SimpleDateFormat(data);
        LocalDate ld = LocalDate.parse(data);
        LocalTime lt = LocalTime.parse(hora);
        LocalDateTime ldtm = ld.atTime(lt);
        System.out.println(ldtm);

        if (ldtm.getDayOfWeek().equals(DayOfWeek.SUNDAY) || ldtm.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
            ldtm = ldtm.plusDays(2);
        }
        System.out.println("Data final da matrícula: " + ldtm);
    }
}
