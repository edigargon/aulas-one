package Desafio_01;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return """
                Conta Bancaria:
                
                Titular: %s
                Número da Conta: %d
                Saldo: %.2f""".formatted(titular, numeroConta, saldo);
    }
}
