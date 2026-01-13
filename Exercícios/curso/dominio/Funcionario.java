package Exercícios.curso.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idadde: " + this.idade);
        System.out.print("Salários: ");
        if (salarios == null){
            return;
        }
        for (double s : salarios){
            System.out.print(s + " ");
        };
    }

    public void media(){
        double soma = 0;
        if (salarios == null){
            return;
        }
        for (double salario : salarios) {
            soma += salario;
        }
        double media = soma / salarios.length;
        System.out.println("\nMédia: " + media);
    }
}
