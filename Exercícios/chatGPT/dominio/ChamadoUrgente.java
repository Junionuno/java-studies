package Exercícios.chatGPT.dominio;

public class ChamadoUrgente extends Chamado {
    public ChamadoUrgente(){
        setStatusInicial(StatusChamado.EM_ANDAMENTO);
    }

    @Override
    public String toString() {
        return super.toString() + "[URGENTE]";
    }
}
