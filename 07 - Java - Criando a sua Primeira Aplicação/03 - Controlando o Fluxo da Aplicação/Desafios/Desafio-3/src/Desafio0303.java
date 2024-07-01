import java.util.Scanner;

/*
    Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada..
 */
public class Desafio0303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("*****************************%n" +
                "-------------MENU------------%n" +
                "*****************************%n" +
                "1 - Calcular Área do Quadrado%n" +
                "2 - Calcular Área do Circulo%n" +
                "*****************************%n" +
                "Escolha uma das opções: ");

        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.println("Calcular Área do Quadrado");
            System.out.println("Informe o valor para a Base: ");
            double base = scanner.nextInt();
            double area = base*2;
            System.out.printf("Sabendo que a bse do quadrado é %.2f, sua área mede: %.2f", base, area);
        } else{
            System.out.println("Calcular Área do Circulo");
            System.out.println("Informa o valor do Raio");
            double raio = scanner.nextInt();
            double pi = 3.14;
            double area = (raio*2)*pi;
            System.out.printf("Sabendo que p raio do circulo é: %.2f e o valor de π é %.2f, podemos concluir que o valor da área é: %.2f", raio, pi, area);
        }
    }

}
