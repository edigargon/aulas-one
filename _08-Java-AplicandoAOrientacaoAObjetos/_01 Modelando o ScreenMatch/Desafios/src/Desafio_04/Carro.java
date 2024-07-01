package Desafio_04;

public class Carro {
    String modelo;
    int ano;
    String cor;

    private int idadeCarro;

    void fichaTecnica(){
        System.out.printf("""
                Modelo: %s
                Ano: %d
                Cor: %s
                Idade do Carro: %d""", modelo, ano, cor, idadeCarro);
    }

    int idadeCarro(int anoAtual){
        idadeCarro = anoAtual - ano;
        return idadeCarro;
    }
}
