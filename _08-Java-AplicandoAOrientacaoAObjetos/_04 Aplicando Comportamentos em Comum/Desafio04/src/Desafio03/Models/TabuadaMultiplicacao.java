package Desafio03.Models;

public class TabuadaMultiplicacao implements Tabuada{

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String mostrarTabuada() {
        StringBuilder tabuada = new StringBuilder();
        for (int i = 0; i <= 10; i++) {
            int resultado = this.numero * i;
            tabuada.append(this.numero)
                    .append(" x ")
                    .append(i)
                    .append(" = ")
                    .append(resultado)
                    .append("\n");
        }
        return tabuada.toString();
    }
}
