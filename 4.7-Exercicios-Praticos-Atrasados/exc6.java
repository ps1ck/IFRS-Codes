/*  Escreva um programa em Java que simule o lançamento de um dado, 
ou seja, sorteie um número entre 1 e 6.  */

public class exc6 {
    public static void main(String[] args) {

    double dado = 0.0;

    while(dado  < 0.1 || dado > 0.6){       /* Fiz dessa forma porque exclui as outras possibilidades, acredito que assim as probrabilidades estão 100% corretas pra cada lado. */
            dado = Math.random();
    }

    int resultado = (int) (dado * 10);
    System.out.printf("Resultado do dado = %d", resultado);

    }
}