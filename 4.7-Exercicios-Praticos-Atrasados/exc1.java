/* Escreva um programa em Java que calcule e mostre a raiz quadrada 
dos números de 1 a 100. Em cada linha de saída, o programa deve 
mostrar o número e sua raiz quadrada. */

public class exc1 {
    public static void main(String[] args) {
        
        int i;
        double r;

        for(i = 1; i < 101; i++){
            r = Math.sqrt(i);
            System.out.printf("A raiz quadradada de %d é = %.3f\n",i,r);
        }
    }
}