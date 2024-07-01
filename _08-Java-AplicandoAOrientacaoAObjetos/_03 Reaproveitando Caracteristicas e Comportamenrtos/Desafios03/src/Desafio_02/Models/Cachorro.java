package Desafio_02.Models;

public class Cachorro extends Animal{

    public String abanarRabo(){
        return """
                Seu cachorro esta abanando ao rabo""";
    }

    @Override
    public String emitirSom() {
        return """
                Au au""";
    }
}
