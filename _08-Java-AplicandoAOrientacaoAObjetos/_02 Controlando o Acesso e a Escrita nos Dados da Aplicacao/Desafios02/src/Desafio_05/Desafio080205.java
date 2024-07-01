package Desafio_05;
/*
    Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.
 */
public class Desafio080205 {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setTitulo("O Principe");
        livro.setAutor("Maquiavel");

        System.out.println(livro.exibirDetalhes());
    }
}
