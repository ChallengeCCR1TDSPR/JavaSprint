package br.com.tecnotrilho.beans;

public class Linha {
    private int idLinha;
    private String nomeLinha;
    private String sentidoLinha;

    public Linha() {
        super();
    }

    public Linha(int idLinha, String nomeLinha, String sentidoLinha) {
        super();
        this.idLinha = idLinha;
        this.nomeLinha = nomeLinha;
        this.sentidoLinha = sentidoLinha;
    }

    public int getIdLinha() {
        return idLinha;
    }

    public void setIdLinha(int idLinha) {
        this.idLinha = idLinha;
    }

    public String getNomeLinha() {
        return nomeLinha;
    }

    public void setNomeLinha(String nomeLinha) {
        this.nomeLinha = nomeLinha;
    }

    public String getSentidoLinha() {
        return sentidoLinha;
    }

    public void setSentidoLinha(String sentidoLinha) {
        this.sentidoLinha = sentidoLinha;
    }

    @Override
    public String toString() {
        return "Linha{" +
                "idLinha=" + idLinha +
                ", nomeLinha='" + nomeLinha + '\'' +
                ", sentidoLinha='" + sentidoLinha + '\'' +
                '}';
    }
}