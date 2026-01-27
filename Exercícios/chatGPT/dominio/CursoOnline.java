package Exercícios.chatGPT.dominio;

public class CursoOnline extends Curso{
    public static final double descontoOnline = 0.20;

    public double valorTotalOnline() {
        return valorTotal() - (valorTotal() * descontoOnline);
    }

    @Override
    public String toString() {
        return super.toString() + " Valor final Curso online: " + valorTotalOnline();
    }
}
