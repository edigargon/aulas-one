package Desafio_04;

import Desafio_04.Models.GeradorPrimo;
import Desafio_04.Models.NumerosPrimos;
import Desafio_04.Models.VerificarPrimo;

import java.util.List;

/*
    Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos(). Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos. Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.

 */
public class Desafio080304 {
    public static void main(String[] args) {
        NumerosPrimos numerosPrimos = new NumerosPrimos();
        System.out.println("Verificação de primalidade:");
        System.out.println("17 é primo? " + numerosPrimos.verificarPrimalidade(17));
        System.out.println("20 é primo? " + numerosPrimos.verificarPrimalidade(20));

        System.out.println("\nListagem de primos até 20:");
        List<Integer> primosAte20 = numerosPrimos.listarPrimos(20);
        System.out.println(primosAte20);

        VerificarPrimo verificadorPrimo = new VerificarPrimo();
        System.out.println("\nVerificação de primalidade (usando subclasse VerificadorPrimo):");
        System.out.println("17 é primo? " + verificadorPrimo.verificarSeEhPrimo(17));
        System.out.println("20 é primo? " + verificadorPrimo.verificarSeEhPrimo(20));

        GeradorPrimo geradorPrimo = new GeradorPrimo();
        System.out.println("\nGeração do próximo primo após 17 (usando subclasse GeradorPrimo):");
        System.out.println("Próximo primo após 17: " + geradorPrimo.gerarProximoPrimo(17));
    }
}
