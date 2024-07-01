package Desafio_02;

public class IdadePessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
        if (this.idade > 18){
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
    }

    @Override
    public String toString() {
        return """
                Dados:
                
                Nome: %s
                Idade: %d""".formatted(nome, idade);
    }
}
