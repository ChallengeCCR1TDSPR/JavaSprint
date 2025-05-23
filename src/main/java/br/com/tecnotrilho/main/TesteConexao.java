package br.com.tecnotrilho.main;

import br.com.tecnotrilho.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connection cn = new ConexaoFactory().conexao();

        System.out.println("Está conectado ao banco de dados!");

        cn.close();
    }

}
