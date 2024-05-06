package Desafio_03.Models;

public class ContaCorrente extends ContaBancaria{

    private double tarifaMensal;

    public ContaCorrente(double saldoInicial, double tarifaMensal) {
        super(saldoInicial);
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
    }
}
