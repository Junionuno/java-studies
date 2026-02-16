package DevDojo.javacore.Oexceptions.exception.test;

import DevDojo.javacore.Oexceptions.exception.dominio.Funcionario;
import DevDojo.javacore.Oexceptions.exception.dominio.LoginInvalidoException;
import DevDojo.javacore.Oexceptions.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try{
            funcionario.salvar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }

        try{
            pessoa.salvar();
        }catch (LoginInvalidoException | FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
