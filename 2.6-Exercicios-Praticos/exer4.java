/* 
 
4. Faça um programa que leia dois vetores (A e B) com cinco posições. 
Cada vetor deverá armazenar números inteiros. O programa deve, 
então, subtrair o primeiro elemento de A do último de B, acumulando o 
valor; subtrair o segundo elemento de A do penúltimo de B, acumulando 
o valor, e assim por diante. Ao final, mostre o resultado de todas as 
subtrações realizadas.

 */


import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        
        int[] a = new int[5];
        int[] b = new int[5];
        int[] resultados = new int[5];
        int f = 4, u = 4;
        
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <= 4; i++){
            System.out.printf("Digite o %d° número do vetor A: \n",(i+1)); a[i] = sc.nextInt();
        }
        for(int i = 0; i <= 4; i++){
            System.out.printf("Digite o %d° número do vetor B: \n",(i+1)); b[i] = sc.nextInt();
        }
        for(int i = 0; i <= 4; i++){
            resultados[i] = a[i] - b[f];
            f -= 1;
        }

        System.out.println("--- RESULTADOS ---");

        for(int i = 0;i <= 4; i++){
            System.out.printf("%d - %d = %d\n",a[i],b[u],resultados[i]);
            u -= 1;
        }

        sc.close();


    }
}
