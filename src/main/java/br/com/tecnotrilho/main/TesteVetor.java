package br.com.tecnotrilho.main;

import br.com.tecnotrilho.beans.*;

import javax.swing.*;

public class  TesteVetor {

    // String - para texto
    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    // int - para inteiro
    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double - para número real
    static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        // Agendamento
        Agendamento[] vetorAgendamento = new Agendamento[2];
        int indiceAgendamento = 0;
        do {
            vetorAgendamento[indiceAgendamento] = new Agendamento();
            vetorAgendamento[indiceAgendamento].setIdAgendamento(inteiro("ID do Agendamento"));
            vetorAgendamento[indiceAgendamento].setDataAgendamento(texto("Data do agendamento"));
            vetorAgendamento[indiceAgendamento].setPrioridade(texto("Prioridade"));
            vetorAgendamento[indiceAgendamento].setDescricao(texto("Descrição"));
            indiceAgendamento++;
        } while (JOptionPane.showConfirmDialog(null, "Fazer mais agendamentos?", "Agendamento...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        for (int i = 0; i < indiceAgendamento; i++) {
            System.out.println("\nID: " + vetorAgendamento[i].getIdAgendamento() + "\nData: " + vetorAgendamento[i].getDataAgendamento() + "\nPrioridade: " + vetorAgendamento[i].getPrioridade() + "\nDescrição: " + vetorAgendamento[i].getDescricao());
        }

        // Componente
        Componente[] vetorComponente = new Componente[2];
        int indiceComponente = 0;
        do {
            vetorComponente[indiceComponente] = new Componente();
            vetorComponente[indiceComponente].setIdComponente(inteiro("ID do Componente"));
            vetorComponente[indiceComponente].setNomeComponente(texto("Nome do Componente"));
            vetorComponente[indiceComponente].setDescricaoComponente(texto("Descrição do Componente"));
            vetorComponente[indiceComponente].setTempoUso(inteiro("Tempo de Uso"));
            vetorComponente[indiceComponente].setLocalComponente(texto("Local"));
            indiceComponente++;
        } while (JOptionPane.showConfirmDialog(null, "Adicionar mais componentes?", "Carregando...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        for (int i = 0; i < indiceComponente; i++) {
            System.out.println("\nID: " + vetorComponente[i].getIdComponente() + "\nNome: " + vetorComponente[i].getNomeComponente() + "\nDescrição: " + vetorComponente[i].getDescricaoComponente() + "\nTempo de Uso: " + vetorComponente[i].getTempoUso() + "\nLocal: " + vetorComponente[i].getLocalComponente());
        }

        // Estação
        Estacao[] vetorEstacao = new Estacao[2];
        int indiceEstacao = 0;
        do {
            vetorEstacao[indiceEstacao] = new Estacao();
            vetorEstacao[indiceEstacao].setIdEstacao(inteiro("ID da Estação"));
            vetorEstacao[indiceEstacao].setNomeEstacao(texto("Nome da Estação"));
            vetorEstacao[indiceEstacao].setLocalEstacao(texto("Local da Estação"));
            indiceEstacao++;
        } while (JOptionPane.showConfirmDialog(null, "Adicionar mais estações?", "Carregando...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        for (int i = 0; i < indiceEstacao; i++) {
            System.out.println("\nID: " + vetorEstacao[i].getIdEstacao() + "\nNome: " + vetorEstacao[i].getNomeEstacao() + "\nLocal: " + vetorEstacao[i].getLocalEstacao());
        }

        // Linha
        Linha[] vetorLinha = new Linha[2];
        int indiceLinha = 0;
        do {
            vetorLinha[indiceLinha] = new Linha();
            vetorLinha[indiceLinha].setIdLinha(inteiro("ID da Linha"));
            vetorLinha[indiceLinha].setNomeLinha(texto("Nome da Linha"));
            vetorLinha[indiceLinha].setSentidoLinha(texto("Sentido da Linha"));
            indiceLinha++;
        } while (JOptionPane.showConfirmDialog(null, "Adicionar mais linhas?", "Carregando...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        for (int i = 0; i < indiceLinha; i++) {
            System.out.println("\nID: " + vetorLinha[i].getIdLinha() + "\nNome: " + vetorLinha[i].getNomeLinha() + "\nSentido: " + vetorLinha[i].getSentidoLinha());
        }

        // Manutenção
        Manutencao[] vetorManutencao = new Manutencao[2];
        int indiceManutencao = 0;
        do {
            vetorManutencao[indiceManutencao] = new Manutencao();
            vetorManutencao[indiceManutencao].setIdManutencao(inteiro("ID da Manutenção"));
            vetorManutencao[indiceManutencao].setDescricaoManutencao(texto("Descrição da Manutenção"));
            vetorManutencao[indiceManutencao].setDataManutencao(texto("Data da Manutenção"));
            indiceManutencao++;
        } while (JOptionPane.showConfirmDialog(null, "Adicionar mais manutenções?", "Carregando...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        for (int i = 0; i < indiceManutencao; i++) {
            System.out.println("\nID: " + vetorManutencao[i].getIdManutencao() + "\nDescrição: " + vetorManutencao[i].getDescricaoManutencao() + "\nData: " + vetorManutencao[i].getDataManutencao());
        }

        // Operador
        Operador[] vetorOperador = new Operador[2];
        int indiceOperador = 0;
        do {
            vetorOperador[indiceOperador] = new Operador();
            vetorOperador[indiceOperador].setIdOperador(inteiro("ID do Operador"));
            vetorOperador[indiceOperador].setNomeOperador(texto("Nome do Operador"));
            vetorOperador[indiceOperador].setTelefoneOperador(texto("Telefone do Operador"));
            indiceOperador++;
        } while (JOptionPane.showConfirmDialog(null,
                "Adicionar operador?",
                "Carregando...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);
        for (int i = 0; i < indiceOperador; i++) {
            System.out.println("\nID: " + vetorOperador[i].getIdOperador() + "\nNome: " + vetorOperador[i].getNomeOperador() + "\nTelefone: " + vetorOperador[i].getTelefoneOperador());
        }


        // Relatório
        Relatorio[] vetorRelatorio = new Relatorio[2];
        int indiceRelatorio = 0;
        do {
            vetorRelatorio[indiceRelatorio] = new Relatorio();
            vetorRelatorio[indiceRelatorio].setIdRelatorio(inteiro("ID do Operador"));
            vetorRelatorio[indiceRelatorio].setDataRelatorio(texto("Data do relatório"));
            vetorRelatorio[indiceRelatorio].setDescricaoRelatorio(texto("Descrição do relatório"));
            vetorRelatorio[indiceRelatorio].setStatusRelatorio(texto("Status do relatório"));
            indiceRelatorio++;
        } while (JOptionPane.showConfirmDialog(null,
                "Adicionar relatorio?",
                "Carregando...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);
        for (int i = 0; i < indiceRelatorio; i++) {
            System.out.println("\nID: " + vetorRelatorio[i].getIdRelatorio() + "\nData do relatório: " + vetorRelatorio[i].getDataRelatorio() + "\nDescrição do relatório: " + vetorRelatorio[i].getDescricaoRelatorio() + "\nStatus do relatório: " + vetorRelatorio[i].getStatusRelatorio());
        }

        // Tecnico
        Tecnico[] vetorTecnico = new Tecnico[2];
        int indiceTecnico = 0;
        do {
            vetorTecnico[indiceTecnico] = new Tecnico();
            vetorTecnico[indiceTecnico].setIdTecnico(inteiro("ID do Operador"));
            vetorTecnico[indiceTecnico].setNomeTecnico(texto("Nome do Técnico"));
            vetorTecnico[indiceTecnico].setTelefoneTecnico(texto("Telefone do Técnico"));
            vetorTecnico[indiceTecnico].setCargo(texto("Cargo do Técnico"));
            indiceTecnico++;
        } while (JOptionPane.showConfirmDialog(null,
                "Adicionar Técnico?",
                "Carregando...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);
        for (int i = 0; i < indiceTecnico; i++) {
                System.out.println("\nID: " + vetorTecnico[i].getIdTecnico() + "\nNome do Técnico: " + vetorTecnico[i].getNomeTecnico() + "\nTelefone do Técnico: " + vetorTecnico[i].getTelefoneTecnico() + "\nCargo do Técnico: " + vetorTecnico[i].getCargo());
        }

    }
}