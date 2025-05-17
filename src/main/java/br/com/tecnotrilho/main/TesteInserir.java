package br.com.tecnotrilho.main;

import br.com.tecnotrilho.beans.*;
import br.com.tecnotrilho.dao.*;

import javax.swing.*;
import java.sql.SQLException;

public class TesteInserir {

    // String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    // int
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double
    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // Inserir agendamento

        Agendamento objAgendamento = new Agendamento();

        AgendamentoDAO objAgendamentoDAO = new AgendamentoDAO();

        objAgendamento.setIdAgendamento(inteiro("Id do Agendamento"));
        objAgendamento.setDataAgendamento(texto("Data do agendamento"));
        objAgendamento.setPrioridade(texto("Nível de Prioridade"));
        objAgendamento.setDescricao(texto("Descrição"));

        System.out.println(objAgendamentoDAO.inserir(objAgendamento));


        // Inserir componente

        Componente objComponente = new Componente();

        ComponenteDAO objComponenteDAO = new ComponenteDAO();

        objComponente.setIdComponente(inteiro("Id do Componente"));
        objComponente.setNomeComponente(texto("Nome do componente"));
        objComponente.setDescricaoComponente(texto("Descrição do componente"));
        objComponente.setTempoUso(inteiro("Tempo de Uso"));
        objComponente.setLocalComponente(texto("Local"));

        System.out.println(objComponenteDAO.inserir(objComponente));

        // Inserir Estação

        Estacao objEstacao = new Estacao();

        EstacaoDAO objEstacaoDAO = new EstacaoDAO();

        objEstacao.setIdEstacao(inteiro("Id da estação"));
        objEstacao.setNomeEstacao(texto("Nome da estação"));
        objEstacao.setLocalEstacao(texto("Local da estação"));

        System.out.println(objEstacaoDAO.inserir(objEstacao));

        // Inserir Linha

        Linha objLinha = new Linha();

        LinhaDAO objLinhaDAO = new LinhaDAO();

        objLinha.setIdLinha(inteiro("Id da linha"));
        objLinha.setNomeLinha(texto("Nome da linha"));
        objLinha.setSentidoLinha(texto("Sentido da linha"));

        System.out.println(objLinhaDAO.inserir(objLinha));

        // Inserir Manutenção

        Manutencao objManutencao = new Manutencao();

        ManutencaoDAO objManutencaoDAO = new ManutencaoDAO();

        objManutencao.setIdManutencao(inteiro("Id da manutenção"));
        objManutencao.setDataManutencao(texto("Data da manutenção"));
        objManutencao.setTipoManutencao(texto("Tipo de manutenção"));
        objManutencao.setDescricaoManutencao(texto("Descrição da manutenção"));
        objManutencao.setTempoInativo(inteiro("Tempo inativo"));
        objManutencao.setCausaFalha(texto("Causa falha"));

        System.out.println(objManutencaoDAO.inserir(objManutencao));

        // Inserir Operador

        Operador objOperador = new Operador();

        OperadorDAO objOperadorDAO = new OperadorDAO();

        objOperador.setIdOperador(inteiro("Id do operador"));
        objOperador.setNomeOperador(texto("Nome do operador"));
        objOperador.setTelefoneOperador(texto("Telefone do operador"));

        System.out.println(objOperadorDAO.inserir(objOperador));

        // Inserir Relatório

        Relatorio objRelatorio = new Relatorio();

        RelatorioDAO objRelatorioDAO = new RelatorioDAO();

        objRelatorio.setIdRelatorio(inteiro("Id relatório"));
        objRelatorio.setDataRelatorio(texto("Data do relatório"));
        objRelatorio.setDescricaoRelatorio(texto("Descrição"));
        objRelatorio.setStatusRelatorio(texto("Status do relatório"));

        System.out.println(objRelatorioDAO.inserir(objRelatorio));

        // Inserir Tecnico

        Tecnico objTecnico = new Tecnico();

        TecnicoDAO objTecnicoDAO = new TecnicoDAO();

        objTecnico.setIdTecnico(inteiro("Id Técnico"));
        objTecnico.setNomeTecnico(texto("Nome do Técnico"));
        objTecnico.setTelefoneTecnico(texto("Telefone do Técnico"));
        objTecnico.setCargo(texto("CARGO"));

        System.out.println(objTecnicoDAO.inserir(objTecnico));
    }
}
