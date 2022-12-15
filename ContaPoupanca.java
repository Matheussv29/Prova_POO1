package br.com.newton.poo.provaE;

public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(int numConta, int agencia, double saldo, double rendimento) {
        super(numConta, agencia, saldo);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}