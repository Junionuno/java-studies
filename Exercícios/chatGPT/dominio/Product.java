package Exercícios.chatGPT.dominio;

public class Product {
    public String nome;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int amount){
        quantity += amount;
    }

    public void removeProducts(int amount){
        quantity -= amount;
    }

    public String imprime(){
        return "Name: " + this.nome + "| Price: " + this.price + "| Quantity: " + this.quantity;
    }
}
