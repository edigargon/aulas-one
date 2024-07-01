package Desafio_02;

import Desafio_02.Models.Cachorro;
import Desafio_02.Models.Gato;

/*
    Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.
 */
public class Desafio080302 {
    public static void main(String[] args) {
        Gato gato = new Gato();

        gato.setNome("Bichano");
        gato.setCorDoPelo("Branco");

        System.out.println(gato);
        System.out.println(gato.emitirSom());
        System.out.println(gato.arranharMoveis());

        Cachorro cachorro = new Cachorro();

        cachorro.setCorDoPelo("Amarelo");
        cachorro.setNome("Bananinha");


    }
}
