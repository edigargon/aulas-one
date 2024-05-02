package Desafio_01;

import Desafio_01.Models.ModeloCarro;

/*
    Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
 */
public class Desafio080301 {
    public static void main(String[] args) {

        double[] precosFiesta = {20000.0, 21000.0, 22000.0};

        ModeloCarro fiesta = new ModeloCarro();
        fiesta.setNomeModelo("Fiesta");
        fiesta.setPrecos(precosFiesta);
        fiesta.calcularEMostrarPrecos();

        double[] precosGol = {19000.0, 19500.0, 20000.0};

        ModeloCarro gol = new ModeloCarro();
        gol.setNomeModelo("Gol");
        gol.setPrecos(precosGol);
        gol.calcularEMostrarPrecos();
    }
}
