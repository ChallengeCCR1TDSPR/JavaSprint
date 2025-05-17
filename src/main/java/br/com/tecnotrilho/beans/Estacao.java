package br.com.tecnotrilho.beans;

public class Estacao {
    private int idEstacao;
    private String nomeEstacao;
    private String localEstacao;

    public Estacao() {
        super();
    }

    public Estacao(int idEstacao, String nomeEstacao, String localEstacao) {
        super();
        this.idEstacao = idEstacao;
        this.nomeEstacao = nomeEstacao;
        this.localEstacao = localEstacao;
    }

    public int getIdEstacao() {
        return idEstacao;
    }

    public void setIdEstacao(int idEstacao) {
        this.idEstacao = idEstacao;
    }

    public String getNomeEstacao() {
        return nomeEstacao;
    }

    public void setNomeEstacao(String nomeEstacao) {
        this.nomeEstacao = nomeEstacao;
    }

    public String getLocalEstacao() {
        return localEstacao;
    }

    public void setLocalEstacao(String localEstacao) {
        this.localEstacao = localEstacao;
    }

    @Override
    public String toString() {
        return "Estacao{" +
                "idEstacao=" + idEstacao +
                ", nomeEstacao='" + nomeEstacao + '\'' +
                ", localEstacao='" + localEstacao + '\'' +
                '}';
    }
}