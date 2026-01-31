package Exercícios.chatGPT.dominio2;

public enum NivelAcesso implements Permissao{
    ADMIN(1, "Administrador"){
        @Override
        public boolean podeAcessar() {
            return true;
        }
    },
    GERENTE(2, "Gerente"){
        public boolean podeAcessar() {
            return true;
        }
    },
    USUARIO(3, "Usuário"){
        public boolean podeAcessar() {
            return false;
        }
    };

    private int codigo;
    private String titulo;

    NivelAcesso(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }
}
