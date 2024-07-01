package Desafio05.Models;

public class ProdutoFisico implements Calculavel{
    private String nome;
    private double preco;
    private double taxa;

    public ProdutoFisico(String nome, double preco, double taxa) {
        this.nome = nome;
        this.preco = preco;
        this.taxa = taxa;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + (preco * taxa);
    }

    public String getNome() {
        return nome;
    }
}
