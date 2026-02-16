package DevDojo.javacore.Oexceptions.exception.test;

import DevDojo.javacore.Oexceptions.exception.dominio.LoginInvalidoException;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String userNameDB = "Goku";
        String passwordDB = "ssj";
        System.out.print("Usuário: ");
        String userNameDigitado = sc.nextLine();
        System.out.print("Senha: ");
        String passwordDigitado = sc.nextLine();

        if (!userNameDB.equals(userNameDigitado) || !passwordDB.equals(passwordDigitado)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
        System.out.println("Login válido.");

    }
}
