/*
    Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
 */
public class Desafio0204 {
    public static void main(String[] args) {

        double precoProduto = 5.60;
        int quantidade = 2;
        double valorTotal = precoProduto * quantidade;

        System.out.printf("Preço do Produto: %.2f %n" +
                "Quantidade de Itens: %d %n" +
                "Valor Total: %.2f", precoProduto, quantidade, valorTotal);
    }
}
