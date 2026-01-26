package DevDojo.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_JURIDICA(1),
    PESSOA_FISICA(2);

    private int valor;

    TipoCliente(int valor) {
        this.valor = valor;
    }

    public int getVALOR() {
        return valor;
    }
}
