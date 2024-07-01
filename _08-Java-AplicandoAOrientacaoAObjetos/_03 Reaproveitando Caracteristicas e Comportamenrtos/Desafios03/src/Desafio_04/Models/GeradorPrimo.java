package Desafio_04.Models;

public class GeradorPrimo extends NumerosPrimos{
    public int gerarProximoPrimo(int numeroAtual) {
        int proximo = numeroAtual + 1;
        while (true) {
            if (verificarPrimalidade(proximo)) {
                return proximo;
            }
            proximo++;
        }
    }
}
