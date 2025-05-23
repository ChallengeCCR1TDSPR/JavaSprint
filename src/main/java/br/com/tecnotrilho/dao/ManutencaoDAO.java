package br.com.tecnotrilho.dao;

import br.com.tecnotrilho.beans.Manutencao;
import br.com.tecnotrilho.conexoes.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ManutencaoDAO {
    public Connection minhaConexao = (new ConexaoFactory()).conexao();

    public ManutencaoDAO() throws SQLException, ClassNotFoundException {
    }

    public String inserir(Manutencao manutencao) {
        String sql = "INSERT INTO t_fiap_manut (ID_MANUT, DT_MANUT, TIPO_MANUT, DS_MANUT, TEMPO_INATIVO, CAUSA_FALHA) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = this.minhaConexao.prepareStatement(sql)) {
            LocalDate localDate = LocalDate.parse(manutencao.getDataManutencao());
            stmt.setInt(1, manutencao.getIdManutencao());
            stmt.setDate(2, java.sql.Date.valueOf(localDate));
            stmt.setString(3, manutencao.getTipoManutencao());
            stmt.setString(4, manutencao.getDescricaoManutencao());
            stmt.setInt(5, manutencao.getTempoInativo());
            stmt.setString(6, manutencao.getCausaFalha());
            stmt.execute();
            return "Manutenção cadastrada com sucesso!";
        } catch (SQLException e) {
            return "Erro ao cadastrar manutenção: " + e.getMessage();
        }
    }

    public List<Manutencao> listar() {
        List<Manutencao> lista = new ArrayList<>();
        String sql = "SELECT * FROM t_fiap_manut";

        try (PreparedStatement stmt = minhaConexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Manutencao m = new Manutencao();
                m.setIdManutencao(rs.getInt("ID_MANUT"));
                m.setDataManutencao(rs.getString("DT_MANUT"));
                m.setTipoManutencao(rs.getString("TIPO_MANUT"));
                m.setDescricaoManutencao(rs.getString("DS_MANUT"));
                m.setTempoInativo(rs.getInt("TEMPO_INATIVO"));
                m.setCausaFalha(rs.getString("CAUSA_FALHA"));
                lista.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public String atualizar(Manutencao manutencao) {
        String sql = "UPDATE t_fiap_manut SET DT_MANUT = ?, TIPO_MANUT = ?, DS_MANUT = ?, TEMPO_INATIVO = ?, CAUSA_FALHA = ? WHERE ID_MANUT = ?";

        try (PreparedStatement stmt = this.minhaConexao.prepareStatement(sql)) {
            stmt.setString(1, manutencao.getDataManutencao());
            stmt.setString(2, manutencao.getTipoManutencao());
            stmt.setString(3, manutencao.getDescricaoManutencao());
            stmt.setInt(4, manutencao.getTempoInativo());
            stmt.setString(5, manutencao.getCausaFalha());
            stmt.setInt(6, manutencao.getIdManutencao());
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                return "Manutenção atualizada com sucesso!";
            } else {
                return "Manutenção não encontrada para atualizar.";
            }
        } catch (SQLException e) {
            return "Erro ao atualizar manutenção: " + e.getMessage();
        }
    }

    public String deletar(int idManutencao) {
        String sql = "DELETE FROM t_fiap_manut WHERE ID_MANUT = ?";

        try (PreparedStatement stmt = this.minhaConexao.prepareStatement(sql)) {
            stmt.setInt(1, idManutencao);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                return "Manutenção deletada com sucesso!";
            } else {
                return "Manutenção não encontrada para deletar.";
            }
        } catch (SQLException e) {
            return "Erro ao deletar manutenção: " + e.getMessage();
        }
    }


}
