package DevDojo.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
