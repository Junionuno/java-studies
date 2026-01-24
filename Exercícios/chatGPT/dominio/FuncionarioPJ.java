package Exercícios.chatGPT.dominio;

public class FuncionarioPJ extends Funcionario{
    public FuncionarioPJ(String nome) {
        super(nome);
    }

    public FuncionarioPJ(String nome, double salario) {
        super(nome, salario);
    }

    public double calcularSalario(){
        return getSalario() + 500;
    }
}
