package Desafio_01.Models;

import java.util.Arrays;

public class Carros {
    private String nomeModelo;
    private double[] precos;

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public double[] getPrecos() {
        return precos;
    }

    public void setPrecos(double[] precos) {
        this.precos = precos;
    }

    public void calcularEMostrarPrecos() {
        Arrays.sort(precos);
        double menorPreco = precos[0];
        double maiorPreco = precos[precos.length - 1];
        System.out.println("Menor preço para o " + nomeModelo + ": " + menorPreco);
        System.out.println("Maior preço para o " + nomeModelo + ": " + maiorPreco);
    }
}
