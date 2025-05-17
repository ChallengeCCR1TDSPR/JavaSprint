package br.com.tecnotrilho.dao;

import br.com.tecnotrilho.beans.Relatorio;
import br.com.tecnotrilho.conexoes.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RelatorioDAO {
    public Connection minhaConexao = (new ConexaoFactory()).conexao();

    public RelatorioDAO() throws SQLException, ClassNotFoundException {
    }

    public String inserir(Relatorio relatorio) {
        String sql = "INSERT INTO t_fiap_relatorio (ID_RELATORIO, DT_RELATORIO, DS_RELATORIO, STATUS) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = this.minhaConexao.prepareStatement(sql)) {
            stmt.setInt(1, relatorio.getIdRelatorio());
            stmt.setString(2, relatorio.getDataRelatorio());
            stmt.setString(3, relatorio.getDescricaoRelatorio());
            stmt.setString(4, relatorio.getStatusRelatorio());
            stmt.execute();
            return "Relatorio cadastrado com sucesso!";
        } catch (SQLException e) {
            return "Erro ao cadastrar relatório: " + e.getMessage();
        }
    }
}
