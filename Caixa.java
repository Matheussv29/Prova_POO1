package br.com.newton.poo.provaE;

import javax.swing.*;

public class Caixa {

    private static String nome;
    private static int numConta;
    private static int agencia;

    private static double valor;


    public static void main(String[] args) {

        nome = JOptionPane.showInputDialog("Digite seu nome:");
        numConta = Integer.parseInt((String) JOptionPane.showInputDialog("Conta:"));
        agencia = Integer.parseInt((String) JOptionPane.showInputDialog("Agencia:"));

        int opcao;
        do {
            opcao = Integer.parseInt((String) JOptionPane.showInputDialog("Oque deseja fazer "+nome+":"+" \n<1>  Sacar\n<2>  Depositar\n<3>  Sair "));

            switch (opcao) {
                case 1:
                    int opcoes;
                    do {
                        opcoes = Integer.parseInt((String) JOptionPane.showInputDialog("De qual conta:\n<1>  Corrente\n<2>  Poupanca\n<3>  Sair "));

                        switch (opcoes) {

                            case 1:
                                valor = Integer.parseInt((String) JOptionPane.showInputDialog("Qual o valor?"));
                                JOptionPane.showMessageDialog(null, "R$"+valor + " sacado da sua conta corrente !", "Conta Corrente", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 2:
                                valor = Integer.parseInt((String) JOptionPane.showInputDialog("Qual o valor?"));
                                JOptionPane.showMessageDialog(null, "R$"+valor + " sacado da sua conta poupanca !", "Conta Poupanca", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 3:

                                break;
                        }
                    } while (opcoes != 3);

                case 2:
                    int op;
                    do {
                        op = Integer.parseInt((String) JOptionPane.showInputDialog("Em qual conta:\n<1>  Corrente\n<2>  Poupanca\n<3>  Sair "));

                        switch (op) {
                            case 1:
                                valor = Integer.parseInt((String) JOptionPane.showInputDialog("Qual o valor?"));
                                JOptionPane.showMessageDialog(null, "R$"+valor + " adicionado na sua conta corrente !", "Conta Corrente", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 2:
                                valor = Integer.parseInt((String) JOptionPane.showInputDialog("Qual o valor?"));
                                JOptionPane.showMessageDialog(null, "R$"+valor + " adicionado na sua conta poupanca !", "Conta Poupanca", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 3:

                                break;
                        }
                    } while (op != 3);

                case 3:

                    break;
            }

        } while (opcao != 3);
    }
}

