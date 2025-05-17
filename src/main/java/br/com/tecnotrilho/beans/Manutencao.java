package br.com.tecnotrilho.beans;

public class Manutencao {
    private int idManutencao;
    private String dataManutencao;
    private String tipoManutencao;
    private String descricaoManutencao;
    private int tempoInativo;
    private String causaFalha;

    public Manutencao() {
        super();
    }

    public Manutencao(int idManutencao, String dataManutencao, String tipoManutencao, String descricaoManutencao, int tempoInativo, String causaFalha) {
        super();
        this.idManutencao = idManutencao;
        this.dataManutencao = dataManutencao;
        this.tipoManutencao = tipoManutencao;
        this.descricaoManutencao = descricaoManutencao;
        this.tempoInativo = tempoInativo;
        this.causaFalha = causaFalha;
    }

    public int getIdManutencao() {
        return idManutencao;
    }

    public void setIdManutencao(int idManutencao) {
        this.idManutencao = idManutencao;
    }

    public String getDataManutencao() {
        return dataManutencao;
    }

    public void setDataManutencao(String dataManutencao) {
        this.dataManutencao = dataManutencao;
    }

    public String getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
    }

    public String getDescricaoManutencao() {
        return descricaoManutencao;
    }

    public void setDescricaoManutencao(String descricaoManutencao) {
        this.descricaoManutencao = descricaoManutencao;
    }

    public int getTempoInativo() {
        return tempoInativo;
    }

    public void setTempoInativo(int tempoInativo) {
        this.tempoInativo = tempoInativo;
    }

    public String getCausaFalha() {
        return causaFalha;
    }

    public void setCausaFalha(String causaFalha) {
        this.causaFalha = causaFalha;
    }

    @Override
    public String toString() {
        return "Manutencao{" +
                "idManutencao=" + idManutencao +
                ", dataManutencao='" + dataManutencao + '\'' +
                ", tipoManutencao='" + tipoManutencao + '\'' +
                ", descricaoManutencao='" + descricaoManutencao + '\'' +
                ", tempoInativo=" + tempoInativo +
                ", causaFalha='" + causaFalha + '\'' +
                '}';
    }
}
