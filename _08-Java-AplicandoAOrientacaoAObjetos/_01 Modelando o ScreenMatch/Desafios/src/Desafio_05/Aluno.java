package Desafio_05;

public class Aluno {
    String nome;
    int idade;

    void informacoes(){
        System.out.printf("""
                Informações do Aluno
                    Nome do Aluno: %s
                    Idade do Aluno: %d""", nome, idade);
    }
}
