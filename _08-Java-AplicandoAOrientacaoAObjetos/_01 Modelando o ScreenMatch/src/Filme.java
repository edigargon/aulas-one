public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.printf("Nome do Filme: %s%n" +
                "Ano de Lançamento: %d%n", nome, anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double retornaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
