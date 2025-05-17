package br.com.tecnotrilho.dao;

import br.com.tecnotrilho.beans.Agendamento;
import br.com.tecnotrilho.conexoes.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AgendamentoDAO {
    public Connection minhaConexao = (new ConexaoFactory()).conexao();

    public AgendamentoDAO() throws SQLException, ClassNotFoundException {
    }

    public String inserir(Agendamento agendamento) {
        String sql = "INSERT INTO t_fiap_agendamento (ID_AGENDAMENTO, DT_AGENDAMENTO, PRIORIDADE, DS_AGENDAMENTO) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = this.minhaConexao.prepareStatement(sql)) {
            stmt.setInt(1, agendamento.getIdAgendamento());
            stmt.setString(2, agendamento.getDataAgendamento());
            stmt.setString(3, agendamento.getPrioridade());
            stmt.setString(4, agendamento.getDescricao());
            stmt.execute();
            return "Agendamento cadastrado com sucesso!";
        } catch (SQLException e) {
            return "Erro ao cadastrar agendamento: " + e.getMessage();
        }
    }
}
