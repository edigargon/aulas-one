package Desafio_01;
/*
    Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.
 */
public class Desafio080201 {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.titular = "Edigar Gonçalves";

        contaBancaria.setNumeroConta(23075039);
        contaBancaria.setSaldo(1500.00);

        System.out.println(contaBancaria);
    }
}
