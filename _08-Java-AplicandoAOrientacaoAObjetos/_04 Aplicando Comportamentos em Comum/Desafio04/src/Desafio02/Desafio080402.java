package Desafio02;

import Desafio02.Models.CalculadoraSalaRetangular;

/*
    Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.
 */
public class Desafio080402 {
    public static void main(String[] args) {

        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        calculadoraSalaRetangular.setAltura(5);
        calculadoraSalaRetangular.setLargura(5);

        double area = calculadoraSalaRetangular.calcularArea();
        double perimetro = calculadoraSalaRetangular.calcularPerimetro();

        System.out.println(area);
        System.out.println(perimetro);

    }
}
