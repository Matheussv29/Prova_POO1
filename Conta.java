package br.com.newton.poo.provaE;

public class Conta {

    private int numConta;
    private int agencia;
    private double saldo;

    Cliente cliente = new Cliente();

    public Conta(int numConta, int agencia, double saldo) {
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){


    }
    public void depositar(double valorDeposito){
        if (valorDeposito>0)
            saldo =+ valorDeposito;
    }
}
