package sistema.model;

public abstract class Ticket {
    private int capacidadeHistorico;
    private Usuario usuarioSistema;

    private int id;
    private String titulo;
    private String descricao;
    private Usuario criador;
    private Usuario responsavel;
    private Prioridade prioridade;
    private StatusTicket status;
    private String[] historico;
    private int totalEventosHistorico;
}