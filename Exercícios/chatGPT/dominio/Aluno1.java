package Exercícios.chatGPT.dominio;

public class Aluno1 {
    private String nome;
    private Curso curso;

    public Aluno1(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno1 " +
                "nome = " + nome + " Curso: " + getCurso();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
