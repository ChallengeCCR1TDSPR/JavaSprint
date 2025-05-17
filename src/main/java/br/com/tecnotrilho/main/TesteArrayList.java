package br.com.tecnotrilho.main;

import br.com.tecnotrilho.beans.*;

import javax.swing.*;
import java.util.ArrayList;

public class TesteArrayList {

    // String - para texto
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    // int - para inteiro
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double - para número real
    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        // Agendamento

        ArrayList<Agendamento> listaAgendamento = new ArrayList<Agendamento>();

        Agendamento objAgendamento = null;

        do {

            objAgendamento = new Agendamento();
            objAgendamento.setIdAgendamento(inteiro("Id do Agendamento"));
            objAgendamento.setDataAgendamento(texto("Data do agendamento"));
            objAgendamento.setPrioridade(texto("Nível de Prioridade"));
            objAgendamento.setDescricao(texto("Descrição"));

            listaAgendamento.add(objAgendamento);

        }while( JOptionPane.showConfirmDialog(null,
                "Fazer mais agendamentos?",
                "Agendamento...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE )  == 0);

        for(Agendamento a : listaAgendamento){
            System.out.println(
                    "\n\nID: " + a.getIdAgendamento() +
                            "\nData: " + a.getDataAgendamento() +
                            "\nPrioridade: " + a.getPrioridade() +
                            "\nDescrição: " + a.getDescricao()
            );
        }

        // Componente

        ArrayList<Componente> listaComponente = new ArrayList<Componente>();

        Componente objComponente = null;

        do {

            objComponente = new Componente();
            objComponente.setIdComponente(inteiro("Id do Componente"));
            objComponente.setNomeComponente(texto("Nome do componente"));
            objComponente.setDescricaoComponente(texto("Descrição do componente"));
            objComponente.setTempoUso(inteiro("Tempo de Uso"));
            objComponente.setLocalComponente(texto("Local"));

            listaComponente.add(objComponente);

        }while( JOptionPane.showConfirmDialog(null,
                "Adicionar mais componentes?",
                "Carregando...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE )  == 0);

        for(Componente a : listaComponente){
            System.out.println(
                    "\n\nID: " + a.getIdComponente() +
                            "\nNome: " + a.getNomeComponente() +
                            "\nDescrição: " + a.getDescricaoComponente() +
                            "\nTempo de uso: " + a.getTempoUso() +
                            "\nLocal: " + a.getLocalComponente()
            );
        }

        // Estação

        ArrayList<Estacao> listaEstacao = new ArrayList<Estacao>();

        Estacao objEstacao = null;

        do {
            objEstacao = new Estacao();
            objEstacao.setIdEstacao(inteiro("Id da estação"));
            objEstacao.setNomeEstacao(texto("Nome da estação"));
            objEstacao.setLocalEstacao(texto("Local da estação"));

            listaEstacao.add(objEstacao);

        }while( JOptionPane.showConfirmDialog(null,
                "Adicionar mais estações?",
                "Carregando...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE )  == 0);

        for(Estacao a : listaEstacao){
            System.out.println(
                    "\n\nID: " + a.getIdEstacao() +
                            "\nNome da estação: " + a.getNomeEstacao() +
                            "\nLocal da estação: " + a.getLocalEstacao()
            );
        }

        // Linha

        ArrayList<Linha> listaLinha = new ArrayList<Linha>();

        Linha objLinha = null;

        do {
            objLinha = new Linha();
            objLinha.setIdLinha(inteiro("Id da linha"));
            objLinha.setNomeLinha(texto("Nome da linha"));
            objLinha.setSentidoLinha(texto("Sentido da linha"));

            listaLinha.add(objLinha);

        }while( JOptionPane.showConfirmDialog(null,
                "Adicionar mais linhas?",
                "Carregando...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE )  == 0);

        for(Linha a : listaLinha){
            System.out.println(
                    "\n\nID: " + a.getIdLinha() +
                            "\nNome da linha: " + a.getNomeLinha() +
                            "\nLocal da linha: " + a.getSentidoLinha()
            );
        }

        //Manuteção

        ArrayList<Manutencao> listaManutencao = new ArrayList<Manutencao>();

        Manutencao objManutencao = null;

        do {
            objManutencao = new Manutencao();
            objManutencao.setIdManutencao(inteiro("Id da manutenção"));
            objManutencao.setDataManutencao(texto("Data da manutenção"));
            objManutencao.setTipoManutencao(texto("Tipo de manutenção"));
            objManutencao.setDescricaoManutencao(texto("Descrição da manutenção"));
            objManutencao.setTempoInativo(inteiro("Tempo inativo"));
            objManutencao.setCausaFalha(texto("Causa falha"));

            listaManutencao.add(objManutencao);

        }while( JOptionPane.showConfirmDialog(null,
                "Adicionar manutenção?",
                "Carregando...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE )  == 0);

        for(Manutencao a : listaManutencao){
            System.out.println(
                    "\n\nID: " + a.getIdManutencao() +
                            "\nData da manutenção: " + a.getDataManutencao() +
                            "\nTipo de manutenção: " + a.getTipoManutencao() +
                            "\nDescrição da manutenção: " + a.getDescricaoManutencao() +
                            "\nTempo Inativo: " + a.getTempoInativo() +
                            "\nCausa falha: " + a.getCausaFalha()
            );
        }

        //Operador

        ArrayList<Operador> listaOperador = new ArrayList<Operador>();

        Operador objOperador = null;

        do {
            objOperador = new Operador();
            objOperador.setIdOperador(inteiro("Id do operador"));
            objOperador.setNomeOperador(texto("Nome do operador"));
            objOperador.setTelefoneOperador(texto("Telefone do operador"));

            listaOperador.add(objOperador);

        }while( JOptionPane.showConfirmDialog(null,
                "Adicionar operador?",
                "Carregando...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE )  == 0);

        for(Operador a : listaOperador){
            System.out.println(
                    "\n\nID: " + a.getIdOperador() +
                            "\nNome do operador: " + a.getNomeOperador() +
                            "\nTelefone do operador: " + a.getTelefoneOperador()
            );
        }

        // Relatorio

        ArrayList<Relatorio> listaRelatorio = new ArrayList<Relatorio>();

        Relatorio objRelatorio = null;

        do {
            objRelatorio = new Relatorio();
            objRelatorio.setIdRelatorio(inteiro("Id relatório"));
            objRelatorio.setDataRelatorio(texto("Data do relatório"));
            objRelatorio.setDescricaoRelatorio(texto("Descrição"));
            objRelatorio.setStatusRelatorio(texto("Status do relatório"));

            listaRelatorio.add(objRelatorio);

        }while( JOptionPane.showConfirmDialog(null,
                "Adicionar outro relatório?",
                "Carregando...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE )  == 0);

        for(Relatorio a : listaRelatorio){
            System.out.println(
                    "\n\nID: " + a.getIdRelatorio() +
                            "\nData do relatório: " + a.getDataRelatorio() +
                            "\nDescrição do relatório: " + a.getDescricaoRelatorio() +
                            "\nStatus do relatório: " + a.getStatusRelatorio()
            );
        }

        // Tecnico

        ArrayList<Tecnico> listaTecnico = new ArrayList<Tecnico>();

        Tecnico objTecnico = null;

        do {
            objTecnico = new Tecnico();
            objTecnico.setIdTecnico(inteiro("Id Técnico"));
            objTecnico.setNomeTecnico(texto("Nome do Técnico"));
            objTecnico.setTelefoneTecnico(texto("Telefone do Técnico"));
            objTecnico.setCargo(texto("CARGO"));

            listaTecnico.add(objTecnico);

        }while( JOptionPane.showConfirmDialog(null,
                "Adicionar outro relatório?",
                "Carregando...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE )  == 0);

        for(Tecnico a : listaTecnico){
            System.out.println(
                    "\n\nID: " + a.getIdTecnico() +
                            "\nNome do Técnico: " + a.getNomeTecnico() +
                            "\nTelefone do Técnico: " + a.getTelefoneTecnico() +
                            "\nCargo do Técnico: " + a.getCargo()
            );
        }
    }
}
