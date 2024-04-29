package Desafio_04;
/*
    Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
 */public class Desafio080104 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Versa";
        carro.ano = 2014;
        carro.cor = "Preto";

        carro.idadeCarro(2024);
        carro.fichaTecnica();
    }
}
