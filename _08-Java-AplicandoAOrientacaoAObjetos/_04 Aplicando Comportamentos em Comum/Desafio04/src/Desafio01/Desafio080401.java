package Desafio01;
/*
    Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
 */


import Desafio01.Models.ConversorMoeda;

public class Desafio080401 {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();

        System.out.println(conversorMoeda.converterDolarParaReal(1));

    }
}
