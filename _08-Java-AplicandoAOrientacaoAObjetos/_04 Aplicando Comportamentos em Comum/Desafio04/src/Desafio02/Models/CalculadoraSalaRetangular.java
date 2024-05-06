package Desafio02.Models;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    private double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        double area = this.altura * this.largura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * (this.altura + this.largura);
        return perimetro;
    }
}
