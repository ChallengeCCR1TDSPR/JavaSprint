package br.com.tecnotrilho.beans;

public class Operador {
    private int idOperador;
    private String nomeOperador;
    private String telefoneOperador;

    public Operador() {
        super();
    }

    public Operador(int idOperador, String nomeOperador, String telefoneOperador) {
        super();
        this.idOperador = idOperador;
        this.nomeOperador = nomeOperador;
        this.telefoneOperador = telefoneOperador;
    }

    public int getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(int idOperador) {
        this.idOperador = idOperador;
    }

    public String getNomeOperador() {
        return nomeOperador;
    }

    public void setNomeOperador(String nomeOperador) {
        this.nomeOperador = nomeOperador;
    }

    public String getTelefoneOperador() {
        return telefoneOperador;
    }

    public void setTelefoneOperador(String telefoneOperador) {
        this.telefoneOperador = telefoneOperador;
    }

    @Override
    public String toString() {
        return "Operador{" +
                "idOperador=" + idOperador +
                ", nomeOperador='" + nomeOperador + '\'' +
                ", telefoneOperador='" + telefoneOperador + '\'' +
                '}';
    }
}


