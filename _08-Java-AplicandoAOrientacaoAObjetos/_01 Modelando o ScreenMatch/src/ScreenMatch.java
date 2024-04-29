public class ScreenMatch {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "O Poderoso Chefão";
        filme.anoDeLancamento = 1972;
        filme.duracaoEmMinutos = 175;

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5.5);
        filme.avalia(10);
        System.out.println(filme.somaDasAvaliacoes);
        System.out.println(filme.totalDeAvaliacoes);
        System.out.println(filme.retornaMedia());
    }
}