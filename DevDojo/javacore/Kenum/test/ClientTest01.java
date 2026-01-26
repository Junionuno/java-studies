package DevDojo.javacore.Kenum.test;

import DevDojo.javacore.Kenum.dominio.Cliente;
import DevDojo.javacore.Kenum.dominio.TipoCliente;
import DevDojo.javacore.Kenum.dominio.TipoPagamento;

public class ClientTest01 {
    public static void main(String[] args) {
        Cliente cliente1 =new Cliente("Geraldo", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 =new Cliente("Geraldo", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
