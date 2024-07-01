public class MainScreenMatch {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.printf("Ano de Lançamento: %d %n", ano);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.printf("Média das Notas: %.2f %n", media);

        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80.";
        System.out.println("Sinopse: " + sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

    }
}
