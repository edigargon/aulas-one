package Desafio06.Models;

public class Produto implements Vendavel{
    private String nome;
    private double precoUnitario;
    private double desconto;

    public Produto(String nome, double precoUnitario, double desconto) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        double precoSemDesconto = precoUnitario * quantidade;
        return aplicarDesconto(precoSemDesconto);
    }

    @Override
    public double aplicarDesconto(double preco) {
        return preco - (preco * desconto);
    }

    public String getNome() {
        return nome;
    }
}
