public class Condicionais {
    public static void main(String[] args) {
        int ano = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (ano >= 2022) {
            System.out.println("Lançamentos que estão assistindo.");
        } else {
            System.out.println("Filme Retro que vale a pena assitir");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
