package Models;

public class Preferidas {

    public void inclui(Audio audio){
        if(audio.getClassificao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto.");
        } else{
            System.out.println(audio.getTitulo() + " é uma que todos estão ouvindo.");
        }
    }
}
