package Exercícios.chatGPT.dominio2;

public class Usuario{
    private String nome;
    private NivelAcesso nivelAcesso;

    public Usuario(String nome, NivelAcesso nivelAcesso) {
        this.nome = nome;
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public String toString() {
        return "Usuario" +
                "Nome = " + nome +
                "\nNivel Acesso = " + nivelAcesso +
                "\nPode acessar? " + (nivelAcesso.podeAcessar()?"SIM":"NÃO");
    }
}
