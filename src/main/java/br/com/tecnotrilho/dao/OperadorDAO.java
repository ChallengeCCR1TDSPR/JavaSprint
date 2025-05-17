package br.com.tecnotrilho.dao;

import br.com.tecnotrilho.beans.Operador;
import br.com.tecnotrilho.conexoes.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OperadorDAO {
    public Connection minhaConexao = (new ConexaoFactory()).conexao();

    public OperadorDAO() throws SQLException, ClassNotFoundException {
    }

    public String inserir(Operador operador) {
        String sql = "INSERT INTO t_fiap_operador (ID_OPERADOR, NM_OPERADOR, TEL_OPERADOR) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = this.minhaConexao.prepareStatement(sql)) {
            stmt.setInt(1, operador.getIdOperador());
            stmt.setString(2, operador.getNomeOperador());
            stmt.setString(3, operador.getTelefoneOperador());
            stmt.execute();
            return "Operador cadastrado com sucesso!";
        } catch (SQLException e) {
            return "Erro ao cadastrar operador: " + e.getMessage();
        }
    }
}
