/* 
1. Escreva um programa em Java que calcule e escreva a soma dos 
termos da série:  

    S = 100 + 99 + 98 + 97 + ... + 80
         0!   1!   2!   3!         20!

Defina um método  para o cálculo do fatorial para ser usado neste 
exercício.
 */

public class exercicio1 {
    static double fatorial(int num) {
        double fat = 1;
        for (int i = 2; i <= num; i++) {       // i começa em 2 porque ai se for 0 ou 1 ele já imprime 1 (fat = 1);
            fat *= i;
        }
        return fat;
    }

    public static void main(String[] args) {
        double s = 0;
        int numerador = 100;

        for (int i = 0; i <= 20; i++) {
            double termo = (double) numerador / fatorial(i);
            s += termo;
            System.out.printf("%d / %.5f (!%d) = %.5f\n", numerador, fatorial(i), i, termo);
            numerador--;
        }

        System.out.printf("\nResultado final: %.5f", s);
    }
}
