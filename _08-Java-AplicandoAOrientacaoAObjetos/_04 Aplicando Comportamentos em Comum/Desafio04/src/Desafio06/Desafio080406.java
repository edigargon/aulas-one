package Desafio06;

import Desafio06.Models.Produto;
import Desafio06.Models.Servico;

/*
    Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.
 */
public class Desafio080406 {
    public static void main(String[] args) {
        Produto produto = new Produto("Camisa", 25.0, 0.1);
        Servico servico = new Servico("Limpeza", 50.0);

        int quantidade = 3;

        System.out.printf("Preço total da camisa (%d unidades): %.2f%n", quantidade, produto.calcularPrecoTotal(quantidade));
        System.out.printf("Preço total da limpeza (%d horas): %.2f%n", quantidade, servico.calcularPrecoTotal(quantidade));
    }
}
