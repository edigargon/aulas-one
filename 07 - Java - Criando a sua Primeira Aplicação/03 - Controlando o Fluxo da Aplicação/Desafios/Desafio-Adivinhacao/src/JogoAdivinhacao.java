import java.util.Random;
import java.util.Scanner;

/*
    Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

    Dicas:

    Para gerar um número aleatório em Java: new Random().nextInt(100);
    Utilize o Scanner para obter os dados do usuário;
    Utilize uma variável para contar as tentativas;
    Utilize um loop para controlar as tentativas;
    Utilize a instrução break; para interromper o loop.
 */
public class JogoAdivinhacao {
    public static void main(String[] args) {

        System.out.println("************************************");
        System.out.println("****** JOGO DO NÚMERO SECRETO ******");
        System.out.println("************************************");
        System.out.println("TENTE ADIVINHAR O NÚMERO SECRETO ENTRE OS NÚMEROS 1 A 100");
        System.out.println("************************************");
        System.out.println("VOCÊ TERÁ SOMENTE 5 CHANCES");
        System.out.println("************************************");
        System.out.println("BOA SORTE !!");
        System.out.println("************************************");
        int numAleatorio = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            System.out.println("Informe um número: ");
            int chute = scanner.nextInt();
            if (chute == numAleatorio) {
                System.out.println("PARABEEENS");
                if (i == 1) {
                    System.out.println("Você acertou com 1 tentativa");
                    break;
                } else {
                    System.out.printf("Você acertou com %d tentativas", i);
                    break;
                }
            } else if (chute < numAleatorio) {
                System.out.println("ERROU..");
                System.out.println("O número secreto é Maior.");
            } else {
                System.out.println("ERROU..");
                System.out.println("O número secreto é Menor.");
            }
            if (i == 5) {
                System.out.printf("Acabaram suas tentativas... o número secreto era: %d", numAleatorio);
            }
        }
    }
}
