/*
5. Escreva uma função que receba dois números inteiros e retorne o MMC 
deles. Faça um programa que calcule a soma de duas frações. Para 
isso, o programa deve pedir ao usuário que informe o valor do 
numerador e do denominador de cada fração. Considerando que n1 é o 
numerador da primeira fração, d1 é o denominador da primeira fração, 
n2 é o numerador da segunda fração e d2 é o denominador da segunda 
fração, o resultado da soma será: 

 dr= MMCded1ed2

 𝑛𝑟 = 𝑑𝑟  X  𝑛1 + 𝑑𝑟  X  𝑛2 
      𝑑1          𝑑2  

onde dr é o denominador do resultado e nr é o numerador do resultado.
 */

import java.util.Scanner;

public class exercicio5 {
    static int calcularMDC(int a, int b) {
    while (b != 0) {
        int resto = a % b;
        a = b;
        b = resto;
    }
    return a;
}
    static int calcularMMC(int a, int b){
        return Math.abs(a * b) / calcularMDC(a, b);
    }

    static int[] somarFracoes(int n1, int d1, int n2, int d2){
        int mmc = calcularMMC(d1, d2);
        int novoNumerador = ((mmc / d1) * n1) + ((mmc / d2) * n2); // o novo denominador é o mmc.
        return new int[] {novoNumerador, mmc};
    }

    public static void main(String[] args) {
        int n1,n2,d1,d2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numerador da 1° fração: ");  n1 = sc.nextInt();
        System.out.print("Digite o denominador da 1° fração: ");  d1 = sc.nextInt();
        System.out.print("Digite o numerador da 2° fração: ");  n2 = sc.nextInt();
        System.out.print("Digite o denominador da 2° fração: ");  d2 = sc.nextInt(); sc.close();

        int[] resultado = somarFracoes(n1,d1,n2,d2);
        System.out.printf("O resultado da soma das frações é: %d / %d  OU  %.4f\n",resultado[0],resultado[1],(double)resultado[0] / (double)resultado[1]);
    }
}