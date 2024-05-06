package Desafio01.Models;

public class ConversorMoeda implements ConversaoFinanceira{

    private double valorDolar = 5.07;

    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar * this.valorDolar;
    }
}
