package Desafio_02.Models;

public class Animal {
    private String nome;
    private String corDoPelo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public String emitirSom(){
        return """
                O animal esta emitindo um som""";
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Cor do Pelo: %s""".formatted(this.nome, this.corDoPelo);
    }
}
