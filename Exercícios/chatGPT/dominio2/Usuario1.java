package Exercícios.chatGPT.dominio2;

public class Usuario1 {
    private String nome;
    private NivelAcesso1 nivelAcesso1;

    public Usuario1(String nome, NivelAcesso1 nivelAcesso1) {
        this.nome = nome;
        this.nivelAcesso1 = nivelAcesso1;
    }

    public String verificaAcesso() {
        if (nivelAcesso1 == NivelAcesso1.ADMIN) {
            return "Acesso total!";
        } else if (nivelAcesso1 == NivelAcesso1.GERENTE) {
            return "Acesso parcial!";
        } else {
            return "Acesso limitado!";
        }

    }

    @Override
    public String toString() {
        return "Usuario: " + nome +
                "\nNivel Acesso = " + nivelAcesso1 +
                "\nAcesso: " + verificaAcesso();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelAcesso1 getNivelAcesso1() {
        return nivelAcesso1;
    }
}
