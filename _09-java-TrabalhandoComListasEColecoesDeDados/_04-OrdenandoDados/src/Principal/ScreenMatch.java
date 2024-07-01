package Principal;

import Calculadora.CalculdoraDeTempo;
import Calculadora.FiltroRecomendacao;
import Models.Episodio;
import Models.Filme;
import Models.Serie;

import java.util.ArrayList;

public class ScreenMatch {
    public static void main(String[] args) {
        Filme filme = new Filme("O Poderoso Chefão", 1972);
        filme.setDuracaoEmMinutos(175);

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5.5);
        filme.avalia(10);
        System.out.println(filme.getTotalDeAvaliacoes());
        System.out.println(filme.retornaMedia());

        Serie serie = new Serie("GOT", 2013);
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(12);
        serie.setMinutosPorEpisodio(75);
        serie.exibeFichaTecnica();

        CalculdoraDeTempo calculdoraDeTempo = new CalculdoraDeTempo();
        calculdoraDeTempo.inclui(filme);
        calculdoraDeTempo.inclui(serie);
        System.out.println(calculdoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(filme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVizualizacoes(300);

        filtroRecomendacao.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);
    }
}