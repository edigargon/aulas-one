import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Informações Iniciais do Cliente
        System.out.println("***********************************************");
        System.out.println("          Dados Iniciais do Cliente");
        System.out.println();
        System.out.printf("""
                Nome:               Edigar Gonçalves da Silva
                Tipo de Conta:      Corrente
                Saldo Inicial:      R$ 2500,00%n""");
        System.out.println();
        System.out.println("***********************************************");

        //Menu
        int opcao = 0;
        double saldo = 2500;
        while(opcao != 4){
            //Opções do Menu
            System.out.println("""
                
                Operaçãoes Disponiveis:
                
                1 - Consultar Saldo
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair""");

            //Escolha da Opção para Metodos
            System.out.println("Informe o Código da Operação: ");
            opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.printf("O valor do saldo disponivel é de %.2f%n", saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a ser depositado: ");
                double deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.println("Deposito Realizada com Sucesso.");
                System.out.printf("O saldo atual é: %.2f%n", saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor a ser transferido:");
                double tranferencia = scanner.nextDouble();
                if (tranferencia > saldo){
                    System.out.println("O valor informado para transferencia é superior ao saldo. Transferia não realizada");
                } else{
                    saldo -= tranferencia;
                    System.out.println("Transferencia Realizada com Sucesso.");
                    System.out.printf("O saldo atual é: %.2f%n", saldo);
                }
            } else if (opcao == 4){
                System.out.println("Obrigado por utilizar nossos serviços");
            } else {
                System.out.println("Opção Invalida, informe outra opção%n.");
            }
        }



    }
}
