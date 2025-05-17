package br.com.tecnotrilho.beans;

public class Componente {
    private int idComponente;
    private String nomeComponente;
    private String descricaoComponente;
    private int tempoUso;
    private String localComponente;

    public Componente() {
        super();
    }

    public Componente(int idComponente, String nomeComponente, String descricaoComponente, int tempoUso, String localComponente) {
        super();
        this.idComponente = idComponente;
        this.nomeComponente = nomeComponente;
        this.descricaoComponente = descricaoComponente;
        this.tempoUso = tempoUso;
        this.localComponente = localComponente;
    }

    public int getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
    }

    public String getNomeComponente() {
        return nomeComponente;
    }

    public void setNomeComponente(String nomeComponente) {
        this.nomeComponente = nomeComponente;
    }

    public String getDescricaoComponente() {
        return descricaoComponente;
    }

    public void setDescricaoComponente(String descricaoComponente) {
        this.descricaoComponente = descricaoComponente;
    }

    public int getTempoUso() {
        return tempoUso;
    }

    public void setTempoUso(int tempoUso) {
        this.tempoUso = tempoUso;
    }

    public String getLocalComponente() {
        return localComponente;
    }

    public void setLocalComponente(String localComponente) {
        this.localComponente = localComponente;
    }

    @Override
    public String toString() {
        return "Componente{" +
                "idComponente=" + idComponente +
                ", nomeComponente='" + nomeComponente + '\'' +
                ", descricaoComponente='" + descricaoComponente + '\'' +
                ", tempoUso=" + tempoUso +
                ", localComponente='" + localComponente + '\'' +
                '}';
    }
}
