package Exercícios.curso.dominio;

public class ContaCorrente extends Conta implements Tributavel{
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double calculaTributos() {
        return this.obterSaldo()  * 0.01;
    }
}
