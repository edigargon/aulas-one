/*
    Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
 */
public class Desafio0206 {
    public static void main(String[] args) {

        double precoOriginal = 50;
        double percentualDesconto = 10;
        double precoDoDesconto = (precoOriginal * percentualDesconto) / 100;
        double precoComDesconto = precoOriginal - precoDoDesconto;

        System.out.printf("Preço do Produto: R$ %.2f %n" +
                "Percentural do Desconto: %.2f%% %n" +
                "Preço do Desconto: R$ %.2f %n" +
                "Preço com Desconto: R$ %.2f %n", precoOriginal, percentualDesconto, precoDoDesconto, precoComDesconto);
    }
}
