import java.util.Scanner;

/*
    Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
 */
public class Desafio0305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Número Par");
        } else {
            System.out.println("Número Impar");
        }
    }
}
