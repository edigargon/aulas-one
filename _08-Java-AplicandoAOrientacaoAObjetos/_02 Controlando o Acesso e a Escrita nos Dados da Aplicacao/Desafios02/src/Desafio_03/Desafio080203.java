package Desafio_03;
/*
    Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
 */

public class Desafio080203 {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Iphone 15");
        produto.setPreco(5222.21);

        produto.aplicarDesconto(15);

        System.out.println(produto);
    }
}
