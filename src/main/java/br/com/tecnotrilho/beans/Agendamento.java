package br.com.tecnotrilho.beans;

public class Agendamento {
    private int idAgendamento;
    private String dataAgendamento;
    private String prioridade;
    private String descricao;

    public Agendamento() {
        super();
    }

    public Agendamento(int idAgendamento, String dataAgendamento, String prioridade, String descricao) {
        super();
        this.idAgendamento = idAgendamento;
        this.dataAgendamento = dataAgendamento;
        this.prioridade = prioridade;
        this.descricao = descricao;
    }

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "idAgendamento=" + idAgendamento +
                ", dataAgendamento='" + dataAgendamento + '\'' +
                ", prioridade='" + prioridade + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}