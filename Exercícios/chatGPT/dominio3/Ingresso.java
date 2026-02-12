package Exercícios.chatGPT.dominio3;

public abstract class Ingresso {
    protected double preco;
    protected  String setor;
    protected int idade;

    public Ingresso(double preco, String setor, int idade) {
        this.preco = preco;
        this.setor = setor;
        this.idade = idade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
