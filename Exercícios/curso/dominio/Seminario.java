package Exercícios.curso.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;
    private Professor professor;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(Aluno[] alunos, String titulo) {
        this.alunos = alunos;
        this.titulo = titulo;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public void imprime(){
        System.out.println("Seminário de: " + this.titulo + "\nCom o professor " + professor.getNome() + "\nNo endereço: " + local.getEndereco() + "\nAlunos inscritos: ");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
