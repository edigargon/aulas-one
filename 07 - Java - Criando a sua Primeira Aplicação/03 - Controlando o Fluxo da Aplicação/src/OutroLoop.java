import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvalicao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while(nota != -1) {
            System.out.println("Digite sua nota para o filme: ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvalicao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Média de Avaliações: " + mediaAvalicao/totalDeNotas);
    }

}
