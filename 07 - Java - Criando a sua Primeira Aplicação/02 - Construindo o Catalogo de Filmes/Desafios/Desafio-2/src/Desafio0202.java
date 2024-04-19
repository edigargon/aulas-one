/*
    Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
 */
public class Desafio0202 {
    public static void main(String[] args) {

        double num1 = 5.6;
        int num2 = 8;
        int cast = (int) num1;

        System.out.printf("Número Decimal: %f %n" +
                "Número Inteiro: %d %n" +
                "Número Casting: %d", num1, num2, cast);
    }
}
