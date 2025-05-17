package br.com.tecnotrilho.dao;

import br.com.tecnotrilho.beans.Estacao;
import br.com.tecnotrilho.conexoes.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstacaoDAO {
    public Connection minhaConexao = (new ConexaoFactory()).conexao();

    public EstacaoDAO() throws SQLException, ClassNotFoundException {
    }

    public String inserir(Estacao estacao) {
        String sql = "INSERT INTO t_fiap_estacao (ID_ESTACAO, NM_ESTACAO, LOCAL) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = this.minhaConexao.prepareStatement(sql)) {
            stmt.setInt(1, estacao.getIdEstacao());
            stmt.setString(2, estacao.getNomeEstacao());
            stmt.setString(3, estacao.getLocalEstacao());
            stmt.execute();
            return "Estação cadastrada com sucesso!";
        } catch (SQLException e) {
            return "Erro ao cadastrar estação: " + e.getMessage();
        }
    }

    public List<Estacao> listar() {
        List<Estacao> lista = new ArrayList<>();
        String sql = "SELECT * FROM t_fiap_estacao";

        try (PreparedStatement stmt = minhaConexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Estacao estacao = new Estacao(
                        rs.getInt("ID_ESTACAO"),
                        rs.getString("NM_ESTACAO"),
                        rs.getString("LOCAL")
                );
                lista.add(estacao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public String atualizar(Estacao estacao) {
        String sql = "UPDATE t_fiap_estacao SET NM_ESTACAO = ?, LOCAL = ? WHERE ID_ESTACAO = ?";

        try (PreparedStatement stmt = this.minhaConexao.prepareStatement(sql)) {
            stmt.setString(1, estacao.getNomeEstacao());
            stmt.setString(2, estacao.getLocalEstacao());
            stmt.setInt(3, estacao.getIdEstacao());
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                return "Estação atualizada com sucesso!";
            } else {
                return "Estação não encontrada para atualizar.";
            }
        } catch (SQLException e) {
            return "Erro ao atualizar estação: " + e.getMessage();
        }
    }

    public String deletar(int idEstacao) {
        String sql = "DELETE FROM t_fiap_estacao WHERE ID_ESTACAO = ?";

        try (PreparedStatement stmt = this.minhaConexao.prepareStatement(sql)) {
            stmt.setInt(1, idEstacao);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                return "Estação deletada com sucesso!";
            } else {
                return "Estação não encontrada para deletar.";
            }
        } catch (SQLException e) {
            return "Erro ao deletar estação: " + e.getMessage();
        }
    }


}
