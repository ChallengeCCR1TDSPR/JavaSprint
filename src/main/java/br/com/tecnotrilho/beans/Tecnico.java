package br.com.tecnotrilho.beans;

public class Tecnico {
    private int idTecnico;
    private String nomeTecnico;
    private String telefoneTecnico;
    private String cargo;

    public Tecnico() {
        super();
    }

    public Tecnico(int idTecnico, String nomeTecnico, String telefoneTecnico, String cargo) {
        super();
        this.idTecnico = idTecnico;
        this.nomeTecnico = nomeTecnico;
        this.telefoneTecnico = telefoneTecnico;
        this.cargo = cargo;
    }

    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public String getTelefoneTecnico() {
        return telefoneTecnico;
    }

    public void setTelefoneTecnico(String telefoneTecnico) {
        this.telefoneTecnico = telefoneTecnico;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "idTecnico=" + idTecnico +
                ", nomeTecnico='" + nomeTecnico + '\'' +
                ", telefoneTecnico='" + telefoneTecnico + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
