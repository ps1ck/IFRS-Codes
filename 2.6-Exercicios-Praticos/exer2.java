/* 
 2. Faça um programa que receba cinco números e mostre a saída a seguir: 
Digite o 1º número: 5 
Digite o 2º número: 3 
Digite o 3º número: 2 
Digite o 4º número: 0 
Digite o 5º número: 2 
Os números digitados foram: 
5 + 3 + 2 + 0 + 2 = 12
 */

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        
        int[] numeros = new int[5];
        int soma = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0;i <= 4;i++){
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }
        sc.close();
        
        System.out.printf("%d + %d + %d + %d + %d = %d",numeros[0] ,numeros[1] ,numeros[2] ,numeros[3] ,numeros[4], (soma));
    }
}
