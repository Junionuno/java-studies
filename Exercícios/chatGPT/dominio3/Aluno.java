package Exercícios.chatGPT.dominio3;

import java.util.Objects;

public class Aluno {
    private String nome;
    private String matricula;
    private String plano;

    public Aluno(String nome, String matricula, String plano) {
        this.nome = nome;
        this.matricula = matricula;
        this.plano = plano;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Aluno aluno = (Aluno) obj;
        return Objects.equals(matricula, aluno.getMatricula()) && Objects.equals(nome, aluno.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }
}
