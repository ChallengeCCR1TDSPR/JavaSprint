package br.com.tecnotrilho.beans;

public class Relatorio {
    private int idRelatorio;
    private String dataRelatorio;
    private String descricaoRelatorio;
    private String statusRelatorio;

    public Relatorio() {
        super();
    }

    public Relatorio(int idRelatorio, String dataRelatorio, String descricaoRelatorio, String statusRelatorio) {
        super();
        this.idRelatorio = idRelatorio;
        this.dataRelatorio = dataRelatorio;
        this.descricaoRelatorio = descricaoRelatorio;
        this.statusRelatorio = statusRelatorio;
    }

    public int getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public String getDataRelatorio() {
        return dataRelatorio;
    }

    public void setDataRelatorio(String dataRelatorio) {
        this.dataRelatorio = dataRelatorio;
    }

    public String getDescricaoRelatorio() {
        return descricaoRelatorio;
    }

    public void setDescricaoRelatorio(String descricaoRelatorio) {
        this.descricaoRelatorio = descricaoRelatorio;
    }

    public String getStatusRelatorio() {
        return statusRelatorio;
    }

    public void setStatusRelatorio(String statusRelatorio) {
        this.statusRelatorio = statusRelatorio;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "idRelatorio=" + idRelatorio +
                ", dataRelatorio='" + dataRelatorio + '\'' +
                ", descricaoRelatorio='" + descricaoRelatorio + '\'' +
                ", statusRelatorio='" + statusRelatorio + '\'' +
                '}';
    }
}
