package br.com.tecnotrilho.dao;

import br.com.tecnotrilho.beans.Linha;
import br.com.tecnotrilho.conexoes.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LinhaDAO {
    public Connection minhaConexao = (new ConexaoFactory()).conexao();

    public LinhaDAO() throws SQLException, ClassNotFoundException {
    }

    public String inserir(Linha linha) {
        String sql = "INSERT INTO t_fiap_linha (ID_LINHA, NM_LINHA, SENTIDO) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = this.minhaConexao.prepareStatement(sql)) {
            stmt.setInt(1, linha.getIdLinha());
            stmt.setString(2, linha.getNomeLinha());
            stmt.setString(3, linha.getSentidoLinha());
            stmt.execute();
            return "Linha cadastrada com sucesso!";
        } catch (SQLException e) {
            return "Erro ao cadastrar linha: " + e.getMessage();
        }
    }
}
