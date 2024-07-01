package Desafio05;

import Desafio05.Models.Livro;
import Desafio05.Models.ProdutoFisico;

/*
    Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
 */
public class Desafio080405 {
    public static void main(String[] args) {
        Livro livro = new Livro("Java Programming", 50.0, 0.1);
        ProdutoFisico produto = new ProdutoFisico("Mouse", 20.0, 0.05);

        System.out.println("Preço final do livro '" + livro.getTitulo() + "': " + livro.calcularPrecoFinal());
        System.out.println("Preço final do produto '" + produto.getNome() + "': " + produto.calcularPrecoFinal());
    }
}
