package Desafio_03;

import Desafio_03.Models.ContaCorrente;

/*
    Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
 */
public class Desafio080303 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1000, 10);
        System.out.println("Saldo inicial: " + conta.consultarSaldo());
        conta.depositar(500);
        System.out.println("Saldo após depósito: " + conta.consultarSaldo());
        conta.sacar(200);
        System.out.println("Saldo após saque: " + conta.consultarSaldo());
        conta.cobrarTarifaMensal();
        System.out.println("Saldo após cobrança da tarifa mensal: " + conta.consultarSaldo());
    }
}
