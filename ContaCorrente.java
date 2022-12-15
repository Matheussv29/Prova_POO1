package br.com.newton.poo.provaE;

public class ContaCorrente extends Conta{
    private double taxa;

    public ContaCorrente(int numConta, int agencia, double saldo, double taxa) {
        super(numConta, agencia, saldo);
        this.taxa = taxa;
    }
    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}