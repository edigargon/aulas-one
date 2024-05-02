package Desafio_04;
/*
    Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
 */
public class Desafio080204 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Edigar Gonçalves");

        aluno.darNotas(10);
        aluno.darNotas(8);
        aluno.darNotas(8);

        System.out.println(aluno.getNome());
        System.out.println(aluno.calcularMedia());
    }
}
