package Exercícios.devMagro.dominio;

public class Pagamento {
    protected TipoPagamento tipoPagamento;
    protected double valor;

    public Pagamento(TipoPagamento tipoPagamento, double valor) {
        this.tipoPagamento = tipoPagamento;
        this.valor = valor;
    }

    public void calculaDesconto(){
        if (tipoPagamento == TipoPagamento.PIX){
            this.valor = this.valor - this.valor * 0.15;
        }else if (tipoPagamento == TipoPagamento.CREDITO){
            this.valor = this.valor - this.valor * 0.1;
        }else if (tipoPagamento == TipoPagamento.CREDITO2){
            this.valor = this.valor;
        }else if (tipoPagamento == TipoPagamento.CREDITO3){
            this.valor = this.valor + this.valor * 0.10;
        }
    }

    @Override
    public String toString() {
        return "Pagamento" +
                "\nTipo pagamento = " + tipoPagamento +
                "\nValor = " + valor;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
