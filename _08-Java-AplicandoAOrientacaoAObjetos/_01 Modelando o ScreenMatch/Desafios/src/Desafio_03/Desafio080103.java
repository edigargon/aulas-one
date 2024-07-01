package Desafio_03;
/*
    Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
 */
public class Desafio080103 {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.titulo = "Rap do Brook: Cancão Solo";
        musica.artista = "Basara";
        musica.anoLancamento = 2021;

        musica.somaAvalicoes(10);
        musica.somaAvalicoes(8);
        musica.somaAvalicoes(9);
        musica.somaAvalicoes(6);
        musica.mediaAvaliacoes();

        musica.fichaTecnica();
    }
}
