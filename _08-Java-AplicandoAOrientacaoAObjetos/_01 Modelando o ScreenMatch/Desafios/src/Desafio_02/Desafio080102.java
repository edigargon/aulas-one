package Desafio_02;
/*
    Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
 */
public class Desafio080102 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int dobro = calculadora.dobro(8);
        System.out.println(dobro);
    }
}
