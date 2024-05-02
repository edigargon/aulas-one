import Models.Filme;

public class ScreenMatch {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("O Poderoso Chefão");
        filme.setAnoDeLancamento(1972);
        filme.setDuracaoEmMinutos(175);

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5.5);
        filme.avalia(10);
        System.out.println(filme.getTotalDeAvaliacoes());
        System.out.println(filme.retornaMedia());
    }
}