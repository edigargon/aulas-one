import java.util.Scanner;

/*
    Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10..
 */
public class Desafio0304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual tabuada gostaria de fazer? ");
        int num = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            int result = i * num;
            System.out.printf("%d X %d = %d%n", num, i, result);
        }
    }
}
