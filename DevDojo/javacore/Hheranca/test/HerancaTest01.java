package DevDojo.javacore.Hheranca.test;

import DevDojo.javacore.Hheranca.dominio.Endereco;
import DevDojo.javacore.Hheranca.dominio.Funcionario;
import DevDojo.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("34007-684");
        endereco.setRua("Rua Kalama");

        Pessoa pessoa = new Pessoa("Geraldo", "123456789");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Junio", "987654321");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2700);

        System.out.println("-----------------");
        funcionario.imprime();

    }
}
