package Desafio_03;
public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void fichaTecnica(){
        System.out.printf("""
                Titulo da Música: %s
                Artista: %s
                Ano de Lançamento: %d
                Avaliação: %.2f""", titulo, artista, anoLancamento, mediaAvaliacoes());
    }

    void somaAvalicoes(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacoes(){
        return avaliacao / numAvaliacoes;
    }
}
