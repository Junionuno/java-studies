package Exercícios.chatGPT.dominio;

public class FuncionarioCLT extends Funcionario{
    public FuncionarioCLT(String nome) {
        super(nome);
    }

    public FuncionarioCLT(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return getSalario() - (getSalario() * 0.1);
    }
}
