package br.com.tecnotrilho.dao;

import br.com.tecnotrilho.beans.Tecnico;
import br.com.tecnotrilho.conexoes.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TecnicoDAO {
    public Connection minhaConexao = (new ConexaoFactory()).conexao();

    public TecnicoDAO() throws SQLException, ClassNotFoundException {
    }

    public String inserir(Tecnico tecnico) {
        String sql = "INSERT INTO t_fiap_tecnico (ID_TECNICO, NM_TECNICO, TEL_TECNICO, CARGO) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = this.minhaConexao.prepareStatement(sql)) {
            stmt.setInt(1, tecnico.getIdTecnico());
            stmt.setString(2, tecnico.getNomeTecnico());
            stmt.setString(3, tecnico.getTelefoneTecnico());
            stmt.setString(4, tecnico.getCargo());
            stmt.execute();
            return "Técnico cadastrado com sucesso!";
        } catch (SQLException e) {
            return "Erro ao cadastrar técnico: " + e.getMessage();
        }
    }

    public List<Tecnico> listarTodos() {
        List<Tecnico> tecnicos = new ArrayList<>();
        String sql = "SELECT ID_TECNICO, NM_TECNICO, TEL_TECNICO, CARGO FROM t_fiap_tecnico";

        try (PreparedStatement stmt = this.minhaConexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Tecnico tecnico = new Tecnico();
                tecnico.setIdTecnico(rs.getInt("ID_TECNICO"));
                tecnico.setNomeTecnico(rs.getString("NM_TECNICO"));
                tecnico.setTelefoneTecnico(rs.getString("TEL_TECNICO"));
                tecnico.setCargo(rs.getString("CARGO"));
                tecnicos.add(tecnico);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tecnicos;
    }

    public String atualizar(Tecnico tecnico) {
        String sql = "UPDATE t_fiap_tecnico SET NM_TECNICO = ?, TEL_TECNICO = ?, CARGO = ? WHERE ID_TECNICO = ?";

        try (PreparedStatement stmt = this.minhaConexao.prepareStatement(sql)) {
            stmt.setString(1, tecnico.getNomeTecnico());
            stmt.setString(2, tecnico.getTelefoneTecnico());
            stmt.setString(3, tecnico.getCargo());
            stmt.setInt(4, tecnico.getIdTecnico());
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                return "Técnico atualizado com sucesso!";
            } else {
                return "Técnico não encontrado para atualizar.";
            }
        } catch (SQLException e) {
            return "Erro ao atualizar técnico: " + e.getMessage();
        }
    }

    public String deletar(int idTecnico) {
        String sql = "DELETE FROM t_fiap_tecnico WHERE ID_TECNICO = ?";

        try (PreparedStatement stmt = this.minhaConexao.prepareStatement(sql)) {
            stmt.setInt(1, idTecnico);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                return "Técnico deletado com sucesso!";
            } else {
                return "Técnico não encontrado para deletar.";
            }
        } catch (SQLException e) {
            return "Erro ao deletar técnico: " + e.getMessage();
        }
    }

}
