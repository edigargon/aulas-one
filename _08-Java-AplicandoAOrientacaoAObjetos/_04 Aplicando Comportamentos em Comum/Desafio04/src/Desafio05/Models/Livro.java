package Desafio05.Models;

public class Livro implements Calculavel{
    private String titulo;
    private double preco;
    private double desconto;

    public Livro(String titulo, double preco, double desconto) {
        this.titulo = titulo;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco - (preco * desconto);
    }

    public String getTitulo() {
        return titulo;
    }
}
