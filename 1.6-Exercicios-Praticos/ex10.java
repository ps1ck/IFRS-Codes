/* 10. Faça um programa que receba um número inteiro maior que 1, verifique se o                        Exercícios com Switch (ESCOLHA) - 4/5
número fornecido é primo ou não. Um número é primo quando é divisível 
apenas por 1 e por ele mesmo. */

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        int n, vezesRestoZero = 0;
        double ultimoNumero;

        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o número inteiro maior que 1: "); n = sc.nextInt();   sc.close();
        
        ultimoNumero = Math.sqrt(n);
        
        for(int i = 2; i <= ultimoNumero; i++){
            if((n%i == 0)){
                vezesRestoZero += 1;
            }
        }

        switch(vezesRestoZero){
            case 0:
                System.out.println("É um número primo!"); break;
            default:
                System.out.println("Não é um número primo!"); break;
        }

    }
}