package Desafio04;


import Desafio04.Models.ConversorTemperaturaPadrao;

/*
    Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.
 */
public class Desafio080404 {
    public static void main(String[] args) {

        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

        double celsius = 25.0;
        double fahrenheit = 77.0;

        System.out.println(celsius + " graus Celsius são " + conversor.celsiusParaFahrenheit(celsius) + " graus Fahrenheit");
        System.out.println(fahrenheit + " graus Fahrenheit são " + conversor.fahrenheitParaCelsius(fahrenheit) + " graus Celsius");
    }

}
