/* 
1. Elabore um programa que preencha uma matriz 6 x 4, calcule e 
armazene o maior elemento de cada linha e multiplique cada linha por 
seu respectivo maior elemento. Mostre a matriz resultante.
 */

import java.util.Scanner;

public class exr1 {
    public static void main(String[] args) {
        
        int[][] matriz = new int[6][4];
        int[] maioresDasLinhas = new int[6];
        int maior = 0;

        Scanner sc = new Scanner(System.in);

        for(int linha = 0; linha < 6; linha++){
            for(int coluna = 0; coluna < 4; coluna++){
                System.out.printf("Digite o elemento armazenado na matriz [%d][%d]\n",(linha+1),(coluna+1)); matriz[linha][coluna] = sc.nextInt();
            }
        }
        sc.close();

        for(int linha = 0; linha < 6; linha++){
            maior = 0;
            for(int coluna = 0; coluna < 4; coluna++){
                if(matriz[linha][coluna] > maior){
                    maior = matriz[linha][coluna];
                    maioresDasLinhas[linha] = matriz[linha][coluna];
                }
            }
        }

        for(int linha = 0; linha < 6; linha++){
            for(int coluna = 0; coluna < 4; coluna++){
                matriz[linha][coluna] = matriz[linha][coluna] * maioresDasLinhas[linha];
            }
        }

        for(int linha = 0; linha < 6; linha++){
            for(int coluna = 0; coluna < 4; coluna++){
                System.out.printf("Elemento %d - [%d][%d]\n",matriz[linha][coluna],linha,coluna);
            }
        }
        
    }
}