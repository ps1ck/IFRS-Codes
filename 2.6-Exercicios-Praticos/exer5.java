/*
 5. Faça um programa que leia um vetor com 20 posições contendo 
números inteiros. Logo após, divida todos os seus elementos pelo maior 
valor do vetor e os armazene em outro vetor. Mostre, ao final, os valores 
armazenados em todas as posições do vetor após os cálculos.
 */

import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        
        int[] numeros = new int[20];
        int[] resultados = new int[20];

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o 1° número: ");
        numeros[0] = sc.nextInt();
        int maior = numeros[0];
        
        for(int i = 1;i <= 19; i++){
            System.out.printf("Digite o %d° número: ",(i+1));
            numeros[i] = sc.nextInt();

            if(numeros[i] > maior){ maior = numeros[i]; }
        }
        sc.close();
        for(int i = 0;i <= 19;i++){
            resultados[i] = maior / numeros[i];
        }
            System.out.printf("  O MAIOR valor é: %d\n  Valores após os cálculos: \n",maior);
        for(int i = 0;i <= 19; i++){
            System.out.printf("%d° resultado: %d / %d = %d\n",(i+1),maior,numeros[i],resultados[i]);
        }
    }
}