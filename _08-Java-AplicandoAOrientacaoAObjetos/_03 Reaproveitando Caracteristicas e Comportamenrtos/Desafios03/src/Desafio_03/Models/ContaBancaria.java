package Desafio_03.Models;

public class ContaBancaria {

    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false; // saldo insuficiente
    }

    public double consultarSaldo() {
        return saldo;
    }
}
