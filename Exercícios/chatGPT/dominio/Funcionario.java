package Exercícios.chatGPT.dominio;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome){
        this.nome = nome;
    }
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularSalario(){
        return salario;
    }

    public String toString(){
        return "Salário total: " + calcularSalario();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

