/*
2. Faça um programa em Java que calcule e mostre o resultado da série: 
  x                  2         3
e   = 1 + (x/1!) + (x /2!) + (x /3!) + ...
O valor de x deve ser informado pelo usuário. A série deve ser calculada 
até o 15º termo. Utilize o método definido no exercício 6 para o cálculo 
do fatorial. 
 */

import java.util.Scanner;

public class exercicio2 {
    static double fatorial(int num) {
        double fat = 1;
        for (int i = 2; i <= num; i++) {       
            fat *= i;
        }
        return fat;
    }
    public static void main(String[] args) {
        int x;
        double soma = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número para a fórmula: "); x = sc.nextInt(); sc.close();

        for(int i = 1; i <= 15; i++){
            soma += Math.pow(x,i) / fatorial(i);
        }
        
        System.out.printf("Resultado final: %.5f\n",soma);   
    }
}