import java.util.Scanner;

/*
    Crie um programa que solicite ao usuário um número e calcule o fatorial desse número..
 */
public class Desafio0306 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = scanner.nextInt();
        int fat = 1;
        for (int i = 1; i <=num; i++) {
            fat *= i;
        }

        System.out.println("O número infomado foi: " + num);
        System.out.println("Seu fatorial é: " + fat);
    }
}
