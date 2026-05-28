package Exercícios.chatGPT.dominio3;

import java.util.Objects;

public class Part {
    private String name;
    private String category;
    private int quantity;

    public Part(String nome, String category, int quantity) {
        this.name = nome;
        this.category = category;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Part{" +
                "nome='" + name + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Part part = (Part) obj;
        return name != null && name.equalsIgnoreCase(part.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name != null ? name.toLowerCase() : null);
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
