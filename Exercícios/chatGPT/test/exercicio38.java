package Exercícios.chatGPT.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class exercicio38 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2025, Month.AUGUST, 15);
        birthday = birthday.plusWeeks(4);
        birthday = birthday.minusYears(10);
        System.out.println(birthday);

        LocalTime abertura = LocalTime.of(8, 0, 0);
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime data = birthday.atTime(abertura);
        System.out.println("Aniversário: " + data);
    }
}
