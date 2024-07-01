package Desafio_03;

public class Produto {

    private String nome;
    private double preco;

    private double percentualDesconto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(double percentualDesconto){
        this.percentualDesconto = percentualDesconto;
        double desconto;
        return  desconto = this.preco - (this.preco * this.percentualDesconto) / 100;
    }

    @Override
    public String toString() {
        return """
                Produto:
                
                Nome: %s
                Preço: %.2f
                Preço com Desconto: %.2f""".formatted(nome, preco, aplicarDesconto(percentualDesconto));
    }
}
