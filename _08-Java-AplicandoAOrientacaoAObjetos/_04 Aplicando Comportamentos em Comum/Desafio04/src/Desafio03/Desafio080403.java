package Desafio03;
/*
    Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.
 */

import Desafio03.Models.Tabuada;
import Desafio03.Models.TabuadaMultiplicacao;

public class Desafio080403 {
    public static void main(String[] args) {
        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.setNumero(5);

        String tabuada = tabuadaMultiplicacao.mostrarTabuada();

        System.out.println(tabuada);
    }
}
