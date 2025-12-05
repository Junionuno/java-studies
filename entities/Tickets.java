package entities;

public class Tickets {
    private String name;
    private double price;
    private int quantity;

    public Tickets(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Tickets(String name, double price, int initialQuantity){
        this.name = name;
        this.price = price;
        addTickets(initialQuantity);
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void addTickets(int amount){
        quantity += amount;
    }

    public void sellTickets(int amount){
        if(quantity < amount){
            System.out.println("Quantidade de ingressos indisponível.");
        }else{
            quantity -= amount;
        };
    }

    public String toString(){
        return "|Nome do evento: " + name
                + " | Valor do ingresso: " + String.format("%.2f", price)
                + " | Ingressos disponíveis: " + quantity + " |";
    }

}
