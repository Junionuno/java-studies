package entities;

public class Library {
    private String title;
    private String author;
    private int quantity;

    public Library(String title, String author){
        this.title = title;
        this.author = author;
    }

    public Library(String title, String author, int initialQtd){
        this.title = title;
        this.author = author;
        addBooks(initialQtd);
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getQuantity(){
        return quantity;
    }

    public void addBooks(int amount){
        quantity += amount;
    }

    public void removeBooks(int amount){
        if(amount > quantity){
            System.out.println("Não é possível remover uma quantidade maior do que " + quantity);;
        }else{
            quantity -= amount;
        };
    }

    public String toString(){
        return "Título: " + title
                + ", Autor: " + author +
                ", Quantidade: " + quantity;
    }

}
