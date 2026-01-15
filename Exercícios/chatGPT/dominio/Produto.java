package Exercícios.chatGPT.dominio;

public class Produto {
    private String nome;
    private double price;
    private double tax;
    private double discount;

    {
        tax = 20;
        discount = 10;
    }

    public Produto(){
    }

    public Produto(String nome, double price) {
        this.nome = nome;
        this.price = price;
    }

    public String toStrig(){
        return "Product data: \n" + "Name: " + getNome() + "\nOriginal price: " + getPrice() + "\nPrice with tax: " + priceTax() + "\nPrice with discount: " + priceDiscount();
    }

    public double priceTax(){
        return this.price + price * 20/100;
    }

    public double priceDiscount(){
        return this.price - price * 10/100;
    }
    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }
}
