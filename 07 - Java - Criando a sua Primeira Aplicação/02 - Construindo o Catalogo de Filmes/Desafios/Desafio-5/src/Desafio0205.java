/*
    Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
 */
public class Desafio0205 {
    public static void main(String[] args) {

        double valorEmDolares = 100;
        double valorEmReal = 4.94;
        double conversao = valorEmDolares * valorEmReal;

        System.out.printf("Para cada $1 equivale a R$4.94 %n" +
                "Quantos Dolares irá converter? %.2f %n" +
                "A conversão deu R$%.2f", valorEmDolares, conversao);
    }
}
