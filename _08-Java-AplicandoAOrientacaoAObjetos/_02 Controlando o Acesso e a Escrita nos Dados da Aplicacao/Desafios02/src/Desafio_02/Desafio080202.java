package Desafio_02;
/*
    Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
 */
public class Desafio080202 {
    public static void main(String[] args) {
        IdadePessoa idadePessoa = new IdadePessoa();

        idadePessoa.setNome("Edigar Gonçalves");
        idadePessoa.setIdade(28);
        System.out.println(idadePessoa);
        idadePessoa.verificarIdade();
    }
}
