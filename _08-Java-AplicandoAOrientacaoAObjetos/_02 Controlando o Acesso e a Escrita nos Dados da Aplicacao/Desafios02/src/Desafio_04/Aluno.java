package Desafio_04;

public class Aluno {

    private String nome;
    private double nota;

    private double somaNotas;

    private int qtdNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void darNotas(double nota){
        this.somaNotas += nota;
        this.qtdNotas ++;
    }

    public double calcularMedia(){
        return this.somaNotas / this.qtdNotas;
    }
}
