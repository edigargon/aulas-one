package Desafio_05;

import java.util.Scanner;

/*
    Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
 */
public class Desafio080105 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        aluno.nome = scanner.nextLine();
        System.out.println("Informe a idade do aluno: ");
        aluno.idade = scanner.nextInt();

        aluno.informacoes();
    }
}
