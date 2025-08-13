/* 
3. Crie um programa que preencha uma matriz 5 x 5 de números reais, 
calcule e mostre a soma dos elementos da diagonal secundária.  
*/

import java.util.Scanner;

public class exr3 {
    public static void main(String[] args) {
        double[][] matriz = new double[5][5];
        double soma = 0.0;

        Scanner sc = new Scanner(System.in);

        for(int linhas = 0;linhas < 5;linhas++){
            for(int colunas = 0;colunas < 5;colunas++){
                System.out.printf("Digite o elemento da posição [%d][%d]: ",(linhas+1),(colunas+1)); matriz[linhas][colunas] = sc.nextDouble();
            }
        }
        sc.close();

        for(int l = 0;l < 5;l++){
            soma += matriz[l][4 - l];
        }

        System.out.printf("A soma dos elementos da diagonal secundária é: %.2f",soma);
    }
}