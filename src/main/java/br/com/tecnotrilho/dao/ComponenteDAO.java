package br.com.tecnotrilho.dao;

import br.com.tecnotrilho.beans.Componente;
import br.com.tecnotrilho.conexoes.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ComponenteDAO {
    public Connection minhaConexao = (new ConexaoFactory()).conexao();

    public ComponenteDAO() throws SQLException, ClassNotFoundException {
    }

    public String inserir(Componente componente) {
        String sql = "INSERT INTO t_fiap_componente (ID_COMPONENTE, NM_COMPONENTE, DS_COMPONENTE, TEMPO_USO, LOCAL_COMPONENTE) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = this.minhaConexao.prepareStatement(sql)) {
            stmt.setInt(1, componente.getIdComponente());
            stmt.setString(2, componente.getNomeComponente());
            stmt.setString(3, componente.getDescricaoComponente());
            stmt.setInt(4, componente.getTempoUso());
            stmt.setString(5, componente.getLocalComponente());
            stmt.execute();
            return "Componente cadastrado com sucesso!";
        } catch (SQLException e) {
            return "Erro ao cadastrar componente: " + e.getMessage();
        }
    }
}
