/* 
2. Faça um programa que preencha e mostre a média dos elementos da 
diagonal principal de uma matriz 10 x 10. 
*/

import java.util.Scanner;

public class exr2 {
    public static void main(String[] args) {
        int[][] matriz = new int [10][10];
        int soma = 0;
        double media = 0;

        Scanner sc = new Scanner(System.in);
        for(int linhas = 0;linhas < 10;linhas++){
            for(int colunas = 0; colunas < 10;colunas++){
                System.out.printf("Digite o elemento da posição [%d][%d]\n",(linhas+1),(colunas+1)); matriz[linhas][colunas] = sc.nextInt();
            }
        }
        
        sc.close();

        for(int i = 0;i < 10; i++){
            soma += matriz[i][i];
        }

        media = soma / 10.0;

        System.out.printf("A média dos elementos da diagonal principal essa matriz é: %.2f",media);
    }
}