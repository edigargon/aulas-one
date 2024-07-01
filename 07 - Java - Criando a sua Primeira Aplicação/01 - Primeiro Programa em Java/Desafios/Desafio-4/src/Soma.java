/*
    Crie uma classe Soma em Java para imprimir no console o resultado da operação 10 + 5. Certifique-se de que o resultado seja exibido sem o uso de aspas, apresentando o valor "15" ao invés da expressão "10+5".
 */
public class Soma {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;
        int soma = num1 + num2;

        System.out.printf("A soma dos numeros %d e %d é %d", num1, num2, soma);
    }
}
