package Exercícios.chatGPT.test;

import java.time.LocalDate;
import java.time.Month;

public class exercicio37 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        LocalDate evento = LocalDate.of(2026, Month.MAY, 15);

        if (hoje.isBefore(evento)){
            System.out.println("O evento ainda vai acontecer!");
        }else{
            System.out.println("O evento já aconteceu.");
        }

        System.out.println(evento.getDayOfWeek());
        System.out.println(evento.getMonth());
        System.out.println(evento.getYear());
    }
}
