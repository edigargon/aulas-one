import Models.Filme;
import Models.Serie;
import Models.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme filme = new Filme("O Poderoso Chefão", 1972);
        filme.avalia(9);
        Filme outroFilme = new Filme("A Cronicas de Narnia", 2012);
        outroFilme.avalia(10);
        Filme outroFilme2 = new Filme("Ratattue", 2014);
        outroFilme2.avalia(6);

        Serie serie = new Serie("GOT", 2013);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();

        listaDeAssistidos.add(filme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(outroFilme2);
        listaDeAssistidos.add(serie);

        for (Titulo item : listaDeAssistidos){
            System.out.println(item.getNome());
            if (item instanceof Filme filme2 && filme2.getClassificao() > 2){
                System.out.println("Classisficação " + filme2.getClassificao());
            }
        }



    }
}
