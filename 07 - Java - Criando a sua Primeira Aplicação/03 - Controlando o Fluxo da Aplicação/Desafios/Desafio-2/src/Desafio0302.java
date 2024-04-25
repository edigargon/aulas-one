import java.util.Scanner;

/*
    Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
 */
public class Desafio0302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o 1º número: ");
        int numero = scanner.nextInt();
        System.out.println("Informe o 2º número: ");
        int numero2 = scanner.nextInt();

        if (numero == numero2) {
            System.out.println("Números Iguais");
        } else if (numero > numero2){
            System.out.println("1º Número é Maior");
        } else {
            System.out.println("2º Número é Maior");
        }
    }
}
