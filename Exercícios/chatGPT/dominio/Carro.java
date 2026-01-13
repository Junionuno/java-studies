package Exercícios.chatGPT.dominio;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public void imprime(){
        System.out.println("Car data: \n" + getMarca() +
                " " + getModelo() + " (" + getAno() + ")" +
                " - $" + getPreco());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco == 0){
            return;
        }
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano == 0){
            return;
        }
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
