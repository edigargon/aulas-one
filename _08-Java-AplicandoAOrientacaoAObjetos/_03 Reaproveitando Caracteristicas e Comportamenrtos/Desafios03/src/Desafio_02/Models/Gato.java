package Desafio_02.Models;

public class Gato extends Animal{

    public String arranharMoveis(){
        return """
                Seu gato esta arranhdo os moveis""";
    }

    @Override
    public String emitirSom() {
        return """
                Miau Miau""";
    }
}
