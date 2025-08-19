/*
4. Crie um procedimento que receba como parâmetro um vetor A de 25 
números inteiros e substitua todos os valores negativos de A por zero. 
Faça também um programa que leia um vetor, chame o procedimento 
para alterar os valores negativos desse vetor para zero e depois mostre 
o vetor resultante. 
*/

import java.util.Scanner;

public class exercicio4 {
    static void trocaNegativos(int A[]){        // void pois é um procedimento, não um método, então não deve retornar valor.
        for(int i = 0;i <= (A.length - 1); i++){ if(A[i] < 0){ A[i] = 0; } }
    }
    public static void main(String[] args) {
        int A[] = new int[25];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i <= (A.length - 1); i++){
            System.out.printf("Digite o %d° do vetor A: ",i+1); A[i] = sc.nextInt();
        }
        sc.close();
        trocaNegativos(A);
        System.out.printf("Novo vetor sem os números negativos:\nVETOR A -> ");
        for(int i = 0;i <= (A.length - 1); i++){ 
            System.out.printf("%d  ",A[i]); 
        }
    }
}